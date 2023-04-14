package edu.unsis.figure2d;

public class Rombo extends Figure2D {

	private double dMenor;
	private double dMayor;

	public Rombo() {
		// TODO Auto-generated constructor stub
	}

	public Rombo(double lado, double dMenor, double dMayor) {
		super.setLado(lado);
		this.dMayor = dMayor;
		this.dMenor = dMenor;

	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	public double getdMayor() {
		return dMayor;
	}

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return super.getLado() * 4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getdMayor() * this.getdMenor() / 2;
	}

}
