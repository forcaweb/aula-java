package application;

public class Program {

	public static void main(String[] args) {
		CalcularPrazo calcularPrazo = new CalcularPrazo("12345678", "87654321");
        String result = calcularPrazo.calcularFrete();
        System.out.println(result);

	}

}
