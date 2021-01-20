package ReciboUsuario;

import java.util.Scanner;

import Carros.Veiculos;
import Cliente.Usuario;
import Locacao.Locar;
import RepositorioUsuarios.RepositorioCliente;

public class Recibo {

	public static void main(String[] args) {
		
		//Realizando o cadastro e locando veículo
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome:");
		String nome = sc.next();
		System.out.println("Insira o número da sua CNH:");
		int cnh = sc.nextInt();
		System.out.println("Insira seu CPF:");
		int cpf = sc.nextInt();
		Usuario cliente = new Usuario(nome, cnh, cpf);
		System.out.println("Insira o modelo do carro desejado:");
		String modeloCarro = sc.next();
		System.out.println("Insira o ano do carro desejado:");
		int ano = sc.nextInt();
		System.out.println("Insira a quantidade de dias de locação:");
		int dias = sc.nextInt();
		
		RepositorioCliente repositorioUsuarios = new RepositorioCliente(cliente);
		System.out.println(repositorioUsuarios);
		
		Veiculos carro = new Veiculos(modeloCarro, ano);
		Locar gol = new Locar(cliente, carro, dias);
		System.out.println(gol);
		sc.close();
	}

}
