package edu.unsis.figure2d.poligon;

public class Hexagono extends Poligono {

	public Hexagono() {
		super.setNumLados(6);
	}
	
	public Hexagono(double apotema, double lado) {
		this.setLado(lado);
		this.setNumLados(6);
		this.setApotema(apotema);
	}
	

}
