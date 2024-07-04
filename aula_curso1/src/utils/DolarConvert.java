package utils;

public class DolarConvert {
	public static double dolar;
	public static double buyDolar;
	public static final double DESCOUNT = 0.06;
	
	public static double result() {
		double multi = dolar * buyDolar;
		double porcentage = multi * DESCOUNT;
		double result = multi + porcentage;
		return result;
	}
}
