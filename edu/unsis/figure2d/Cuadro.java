/*************************************** 
*Autores: Elietzer Jared Galicia Cordoba*
*Elio Justino Cruz Ortega
*Arleth Machuca Fabian
*Yael Alberto Gomez Hernandez
*Fecha creacion: 11/04/2023
*Fecha modificacion: 14/04/2023*
*Descripcion: Figuras
/***************************************/
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
