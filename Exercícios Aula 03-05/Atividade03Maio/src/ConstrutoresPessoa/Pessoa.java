package ConstrutoresPessoa;

public class Pessoa {
	public String nome;
	public String idade;
	
	public Pessoa (String nomePessoa, String idadePessoa) {
		nome = nomePessoa;
		idade = idadePessoa;
		System.out.println("O nome da pessoa é: " + nomePessoa + " e possui a idade de: " + idadePessoa + " anos.");
	}

	public Pessoa (String idadePessoa) {
		idade = idadePessoa;
		System.out.println("A idade da pessoa é: " + idadePessoa);
	}
}
