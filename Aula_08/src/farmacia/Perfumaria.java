package farmacia;

public class Perfumaria extends Medicamento {

	public Perfumaria(String produto, String tamanho, String classe, double valor, String receita, int manipulado) {
		super(produto, tamanho, classe, valor, receita, manipulado);
		this.manipulado = manipulado;
	}

	private int manipulado;

	public int getManipulado() {
		return manipulado;
	}

	public void setManipulado(int manipulado) {
		this.manipulado = manipulado;
	}

}
