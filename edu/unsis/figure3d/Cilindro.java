package edu.unsis.figure3d;


public class Cilindro extends Figura3D{
	private double radio;
	private double altura;
	
	public Cilindro () {
		
	}
	
	public Cilindro (double radio, double altura) {
		this.altura = altura;
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return 2*Math.PI*radio*altura+2*Math.PI*(radio*radio);
	}

	@Override
	public double getVolumen() {
		return Math.PI*(radio*radio)*altura;
	}
}
