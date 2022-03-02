package codigos;


	public class Livro {

	    private String titulo;
	    private String autor;
	    private int quantidade;
	    private int isbn;
	    private int codLivro;

	    public Livro(String titulo, String autor, int npag, int edicao, int codLivro, int isbn, int quantidade) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.quantidade = quantidade;
	        this.isbn = isbn;
	        this.codLivro = codLivro;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade( int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public int getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(int isbn) {
	        this.isbn = isbn;
	    }

		public int getCodLivro() {
			return codLivro;
		}

		public void setCodLivro(int codLivro) {
			this.codLivro = codLivro;
		}
   }
