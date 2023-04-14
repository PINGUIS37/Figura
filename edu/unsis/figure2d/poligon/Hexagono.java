/*************************************** 
*Autores: Elietzer Jared Galicia Cordoba*
*Elio Justino Cruz Ortega
*Arleth Machuca Fabian
*Yael Alberto Gomez Hernandez
*Fecha creacion: 11/04/2023
*Fecha modificacion: 14/04/2023*
*Descripcion: Figuras
/***************************************/
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
