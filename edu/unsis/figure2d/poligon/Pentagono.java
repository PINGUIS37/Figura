package edu.unsis.figure2d.poligon;

public class Pentagono extends Poligono {

	public Pentagono() {
		super.setNumLados(5);
	}
	public Pentagono(double apotema, double lado) {
		this.setLado(lado);
		this.setNumLados(5);
		this.setApotema(apotema);
	}

}
