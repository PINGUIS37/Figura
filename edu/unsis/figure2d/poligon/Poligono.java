package edu.unsis.figure2d.poligon;

import edu.unsis.figure2d.Figure2D;

public  class Poligono extends Figure2D {

	private double apotema;
	private int numLados;

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.getLado() * this.getNumLados();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getPerimetro() * this.getApotema() / 2;
	}

}
