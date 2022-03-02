package codigos;

import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Emprestimo {
	
		private Cliente usuario;
		private Date dataEmprestimo;
		private Date prazoMaximo ;
		private List<Livro> livros;
		private double valorLivro;
		public Cliente getUsuario() {
			return usuario;
		}
		public void setUsuario(Cliente usuario) {
			this.usuario = usuario;
		}
		public Date getDataEmprestimo() {
			return dataEmprestimo;
		}
		public void setDataEmprestimo(Date dataEmprestimo) {
			this.dataEmprestimo = dataEmprestimo;
		}
		public Date getPrazoMaximo() {
			return prazoMaximo;
		}
		public void setPrazoMaximo(Date prazoMaximo) {
			this.prazoMaximo = prazoMaximo;
		}
		public List<Livro> getLivros() {
			return livros;
		}
		public void setLivros(List<Livro> livros) {
			this.livros = livros;
		}
		public double getValorLivro() {
			return valorLivro;
		}
		public void setValorLivro(int valorLivro) {
			this.valorLivro = valorLivro;
		}
		}

