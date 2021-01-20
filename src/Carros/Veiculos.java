package Carros;

public class Veiculos {

	private String modelo;
	private int ano;

	public Veiculos(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		String carro;

		carro = "| Modelo: " + getModelo() + " | ano: " + getAno() + " |";

		return carro;
	}
}
