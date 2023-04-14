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

public class Circulo extends Figure2D {

	private double radio;

	// Constructors
	public Circulo() {

	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	// Setter and getter
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// implements abstract methods
	@Override
	public double getPerimetro() {
		return 2 * Math.PI * this.getRadio();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getRadio(), 2);
	}

}
