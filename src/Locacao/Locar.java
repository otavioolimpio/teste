package Locacao;

import Carros.Veiculos;
import Cliente.Usuario;

public class Locar {

	private Usuario locador;
	private Veiculos carroLocado;
	private int valorCarro, duracao;

	public Locar(Usuario cliente, Veiculos carro, int duracao) {
		this.locador = cliente;
		this.carroLocado = carro;
		this.duracao = duracao;
	
		// valor modelo
		int valorModelo = 0, valorAno = 0;		
		switch (carro.getModelo()) {
		case "argo":
			valorModelo = 150;
			break;
		case "onix":
			valorModelo = 140;
			break;
		case "sandero":
			valorModelo = 130;
			break;
		case "gol":
			valorModelo = 120;
			break;
		case "kwid":
			valorModelo = 100;
			break;
		default:
			break;
		}

		// valor ano
		if (valorModelo != 0) {

			switch (carro.getAno()) {
			case 2015:
				valorAno = 10;
				break;
			case 2016:
				valorAno = 20;
				break;
			case 2017:
				valorAno = 30;
				break;
			case 2018:
				valorAno = 40;
				break;
			case 2019:
				valorAno = 50;
				break;
			case 2020:
				valorAno = 100;
				break;
			default:
				break;
			}
		}

		valorCarro = valorAno + valorModelo;
	}
	
	public String toString() {
		
		return "| Locador: " + locador.getNome() +" | Veiculo: " + carroLocado.getModelo() +
				" | Ano: " + carroLocado.getAno() + " | Duração: " + duracao + 
				" dias | Total: " + (valorCarro * duracao) + " reais |";
	}
}
