package com.gabrielortis.interfacePolimorfismo;

public class Quadrado extends Figura2D {
	public int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

}
