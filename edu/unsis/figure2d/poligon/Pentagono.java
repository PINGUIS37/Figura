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
