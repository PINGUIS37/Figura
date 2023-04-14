
package edu.unsis.figure3d;

public class Cubo extends Figura3D {
	private double lado;

	public Cubo () {
		
	}

	public Cubo (double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return 6 * (lado * lado);
	}

	@Override
	public double getVolumen() {
		return lado * lado * lado;
	}

}
