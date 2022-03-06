package codigos;

public class Emprestimo {
		private int[] dataEmprestimo= new int[3];
		private int[] prazoMaximo= new int[3] ;
		private double valorLivro;
		private int prazo;
		private double atraso;
		private double multa;
	public Emprestimo(int[] dataEmprestimo, int[] prazoMaximo, double valorLivro, int prazo, double atraso,  double multa) {
			this.dataEmprestimo = dataEmprestimo;
	        this.prazoMaximo = prazoMaximo;
	        this.valorLivro = valorLivro;
	        this.prazo = prazo;
	        this.atraso = atraso;
	        this.multa = multa;
	}
				
		public int[] getDataEmprestimo() {
			return dataEmprestimo;
		}
		public void setDataEmprestimo(int[] dataEmprestimo) {
			this.dataEmprestimo = dataEmprestimo;
		}
		public int[] getPrazoMaximo() {
			return prazoMaximo;
		}
		public void setPrazoMaximo(int[] prazoMaximo) {
			this.prazoMaximo = prazoMaximo;
		}
		public double getValorLivro() {
			return valorLivro;
		}
		public void setValorLivro(int valorLivro) {
			this.valorLivro = valorLivro;
		}

		public int getPrazo() {
			return prazo;
		}

		public void setPrazo(int prazo) {
			this.prazo = prazo;
		}

		public double getMulta() {
			return multa;
		}

		public void setMulta(double multa) {
			this.multa = multa;
		}

		public double getAtraso() {
			return atraso;
		}
		
		
		
	void calcular_multa() {
		    System.out.println("Data de Retirada");
		    System.out.println(dataEmprestimo[0]);

		    prazo = dataEmprestimo[0] + 7;
		    atraso = prazoMaximo[0] - prazo;

		    System.out.println("A data de devolução é dia " + prazo);

		    if (prazoMaximo[0] > prazo) {
		        System.out.println("Livro entregue com " + atraso + " dias de atraso!"
		                + " Cobrar multa de $2,00 ao dia ate o valor do livro!");
		     		           multa = (atraso * multa);
		    }
		     		           else if (multa > valorLivro){
		     				        System.out.println("Taxa maxima " + multa + "o valor do livro!");
		     		           
		        System.out.println("Valor total da multa:");
		        System.out.println(String.format("(R$) %.02f", multa));
		    } else {
		        System.out.println("Livro entegue no prazo");
		    }


		}
}
