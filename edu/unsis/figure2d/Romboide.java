package edu.unsis.figure2d;

public class Romboide extends Figure2D {

	private double base;
	private double altura;

	public Romboide() {

	}

	public Romboide(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (this.getAltura() + this.getBase());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getAltura() * this.getBase();
	}

}
