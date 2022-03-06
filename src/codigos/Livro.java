package codigos;

import java.util.Scanner;

public class Livro {

	    private String titulo;
	    private String autor;
	    private int quantidade;
	    private int isbn;
	    private int codLivro;

	    public Livro(String titulo, String autor, int codLivro, int isbn, int quantidade) {
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
	
	@SuppressWarnings("resource")
	public void emprestar (int quantidade, int codLivro) {
			System.out.print("Digite o codigo do livro a ser emprestado:");
			 codLivro = new Scanner(System.in).nextInt();
			 System.out.print("Digite a quantidade do livro a ser emprestado:");
			 quantidade = new Scanner(System.in).nextInt();
			   for (quantidade =12 ; quantidade <=12 ; --quantidade);
				 System.out.print("Ainda ha" + quantidade + "livros");

					
		return;
   }
}