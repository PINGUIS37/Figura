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

public class Esfera extends Figura3D{
	private double radio;

	public Esfera() {
		// TODO Auto-generated constructor stub
	}
	
	public Esfera(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return 4*Math.PI*(radio*radio);
	}

	@Override
	public double getVolumen() {
		System.out.println("pi: " + (4/3)*Math.PI + " cub: " + Math.pow(radio, 3));
		return ((Math.PI * 4) * (Math.pow(radio, 3)) / 3);
	}
}
