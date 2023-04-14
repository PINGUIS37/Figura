package edu.unsis.figure2d;

import edu.unsis.figure.Figura;

public abstract class Figure2D extends Figura {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public abstract double getPerimetro();

}
