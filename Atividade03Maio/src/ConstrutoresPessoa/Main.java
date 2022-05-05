package ConstrutoresPessoa;
import java.util.Scanner;

import ConstrutoresPessoa.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		String control;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Bem vindo ao cadastro de pessoas, digite '1' para cadastrar o nome e idade, ou então '2' para cadastrar somente a idade da pessoa :");
		control = leitura.nextLine();
		System.out.println(control);
		
		int controlInt = Integer.parseInt(control);
		
		if (controlInt == 1) {
			System.out.println("Insira o nome da pessoa: ");
			String nomePessoa = leitura.nextLine();
			System.out.println("Insira a idade da pessoa: ");
			String idadePessoa = leitura.nextLine();
			
			Pessoa pessoa1 = new Pessoa(nomePessoa, idadePessoa);
		} 
		else if(controlInt == 2) {
			System.out.println("Insira a idade da pessoa: ");
			String idadePessoa = leitura.nextLine();
			
			Pessoa pessoa = new Pessoa(idadePessoa);
			
		} else {
			System.out.println("Digite 1 ou 2 para descrever a pessoa conforme nome ou idade. Tente novamente");
		} 
	}

}
