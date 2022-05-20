package ConnectionJDBC;

public class Livro {
	Integer isbn;
	String titulo;
	int ano;
	String categoria;
	String editora;
	String autor;
	
	public Livro(Integer isbn, String titulo, int ano, String categoria, String editora, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.categoria = categoria;
		this.editora = editora;
		this.autor = autor;
	}

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", ano=" + ano + ", categoria=" + categoria + ", editora="
				+ editora + ", autor=" + autor + "]";
	}
	
	
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
