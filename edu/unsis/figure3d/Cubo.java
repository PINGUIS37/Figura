/*************************************** 
*Autores: Elietzer Jared Galicia Cordoba*
*Elio Justino Cruz Ortega
*Arleth Machuca Fabian
*Yael Alberto Gomez Hernandez
*Fecha creacion: 11/04/2023
*Fecha modificacion: 14/04/2023*
*Descripcion: Figuras
/***************************************/

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
