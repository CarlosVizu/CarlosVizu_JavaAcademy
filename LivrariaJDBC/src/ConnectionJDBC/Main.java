package ConnectionJDBC;
import java.sql.SQLException;
import java.util.Scanner;

import ConnectionJDBC.ConnectionJDBC;
public class Main {

	public static void main(String[] args) throws SQLException {
		String urlBD = "jdbc:mysql://localhost:3306/livraria?user=root&password=root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Livro livro = new Livro();
		ConnectionJDBC bd = new ConnectionJDBC();
		
		
		
		bd.conectar(urlBD, driver);
		bd.inserirAlterarExcluir("INSERT INTO livro (isbn, nome, ano, editora, categoria, autor) values ('521423','Festim dos Corvos','2013','LeYa','Fantasia','George R.R. Martin')");
		bd.searchAll();
		
		
		
		/*
		Scanner read = new Scanner(System.in);
		System.out.println("Digite um novo livro");
		System.out.println("");
		System.out.println("Digite o ISBN: ");
		livro.setIsbn(read.nextInt());
		read.nextLine();
		System.out.println("");
		System.out.println("Digite o TITULO DO LIVRO: ");
		livro.setTitulo(read.nextLine());
		System.out.println("Digite o ANO do livro: ");
		livro.setAno(read.nextInt());
		read.nextLine();
		System.out.println("Digite a EDITORA: ");
		livro.setEditora(read.nextLine());
		System.out.println("Digite a CATEGORIA: ");
		livro.setCategoria(read.nextLine());
		System.out.println("Digite o AUTOR: ");
		livro.setAutor(read.nextLine());
		System.out.println(livro.toString());
		*/

		
		
		

	}

}
