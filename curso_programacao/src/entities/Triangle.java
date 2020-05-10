package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	/*
	 * O método não precisou de parametro, porque os dados que ele 
	 * utiliza já estão na classe
	 * */
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
