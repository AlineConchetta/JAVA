package farmacia;

public class farmacia {

	String produto;
	String tamanho;
	String classe;
	double valor;
	String receita;

	public farmacia(String produto, String tamanho, String classe, double valor, String receita) {
		this.produto = produto;
		this.tamanho = tamanho;
		this.classe = classe;
		this.valor = valor;
		this.receita = receita;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void serTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public void visualizar() {
		System.out.println("Qual produto? " + this.produto);
		System.out.println("Qual tamanho? " + this.tamanho);
		System.out.println("Qual a classe do medicamento? " + this.classe);
		System.out.println("Qual valor do medicamento? " + this.valor);
		System.out.println("Precisa de receita? " + this.receita);
	}
}
