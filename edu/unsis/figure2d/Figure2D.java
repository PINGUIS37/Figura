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
