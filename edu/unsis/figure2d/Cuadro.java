package edu.unsis.figure2d;

public class Cuadro extends Figure2D {

	public Cuadro () {
		
	}
	public Cuadro (double lado) {
		super.setLado(lado);
	}
	
	@Override
	public double getPerimetro() {
		return super.getLado() * 4;
	}
	
	@Override
	public double getArea() {
		return Math.pow(super.getLado(), super.getLado());
	}

}
