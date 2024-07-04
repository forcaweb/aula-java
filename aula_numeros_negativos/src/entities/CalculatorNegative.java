package entities;

public class CalculatorNegative {
	private int qtd;
	private double[] num;
	
	public CalculatorNegative(int qtd, double[] num) {
		this.qtd = qtd;
		this.num = num;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}
}
