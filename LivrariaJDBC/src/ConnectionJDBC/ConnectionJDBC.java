package ConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC {
public Connection conexao;
	
	public String conectar(String URL, String Driver) {
		try {
				Class.forName(Driver);
				conexao = (Connection) DriverManager.getConnection(URL);
				return "Conectado";				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Não foi possível conectar";			
		}
	}
	
	public ResultSet consulta(String query) {
		Statement st;
		ResultSet resultado = null;
		try {
			st = conexao.createStatement();
			resultado = st.executeQuery(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	void searchAll() throws SQLException {
		
		String query = "SELECT * from livro order by nome";
		
		ResultSet rs = conexao.createStatement().executeQuery(query);
		
		while(rs.next()) {
			int isbn = rs.getInt("isbn");
			String titulo = rs.getString("nome");
			int ano = rs.getInt("ano");
			String editora = rs.getString("editora");
			String categoria = rs.getString("categoria");
			String autor = rs.getString("autor");
			
			System.out.println("ISBN: " + isbn + " Titulo: " + titulo + " Ano: " + ano + " Editora: " + editora + 
					" Categoria: " + categoria + " Autor: " + autor);
		}
	}
	
	public int inserirAlterarExcluir(String query) {
		int linhas = 0;
		try {
			Statement st = conexao.createStatement();
			linhas = st.executeUpdate(query);
			System.out.println("Operação Efetuada com Sucesso");
			return linhas;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Operação Não Efetuada");
		}
		return linhas;
	}
	

}