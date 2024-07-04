import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class CalcularPrazo {
    private String url;
    private String cepOrigem;
    private String cepDestino;

    public CalcularPrazo(String cepOrigem, String cepDestino) {
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.url = "https://www.linkcorreios.com.br/";
    }

    public String calcularFrete() {
        try {
            return fetchTrackingService();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String fetchTrackingService() throws Exception {
        String endpoint = String.format("%sceps/calculo-prazo-entrega-correios?cep_origem=%s&cep_destino=%s&bt_calcular_prazo=Calcular+Prazo",
                this.url, this.cepOrigem, this.cepDestino);
        URL url = new URL(endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
        connection.setRequestProperty("Cache-Control", "no-cache");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return handleBody(content.toString());
        } else {
            throw new Exception("Erro ao tentar se comunicar ao serviço dos correios.");
        }
    }

    private String handleBody(String responseBody) throws Exception {
        List<String> strs = new ArrayList<>();
        List<Event> ret = new ArrayList<>();
        Document html = Jsoup.parse(responseBody);
        wrapData(html, strs, ret);
        if (ret.isEmpty()) {
            return "{\"events\": []}";
        }
        return "{\"events\": " + ret.toString() + "}";
    }

    private void wrapData(Document html, List<String> strs, List<Event> ret) {
        Elements rows = html.select(".linha_status");
        for (Element row : rows) {
            strs.add(row.html());
        }
        for (String element : strs) {
            String sedex = null, pac = null;
            Elements listItems = Jsoup.parse(element).select("li");
            for (Element li : listItems) {
                String text = li.text();
                if (text.contains("SEDEX")) {
                    sedex = text;
                }
                if (text.contains("PAC")) {
                    pac = text;
                }
            }
            ret.add(new Event(sedex, pac));
        }
    }

    class Event {
        private String sedex;
        private String pac;

        public Event(String sedex, String pac) {
            this.sedex = sedex;
            this.pac = pac;
        }

        @Override
        public String toString() {
            return "{\"Sedex\": \"" + (sedex != null ? sedex : "") + "\", \"Pac\": \"" + (pac != null ? pac : "") + "\"}";
        }
    }
}
