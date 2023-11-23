package farmacia;

public class Medicamento extends farmacia {

	private int manipulado;

	public Medicamento(String produto, String tamanho, String classe, double valor, String receita, int manipulado) {
		super(produto, tamanho, classe, valor, receita);
		this.manipulado = manipulado;
		}
		
		public int getManipulado() {
			return manipulado;
		}

		public void setManipulado(int manipulado) {
			this.manipulado = manipulado;
		}
		
		@Override
		public void visualizar() {
		super.visualizar();
		
		String manipulado= "";

		switch (this.manipulado) {
		case 1:
			manipulado = "Sim";
			break;
		case 2:
			manipulado = "Não";
			break;
		}
		
		System.out.println("O medicamento é manipulado? " + manipulado); 		
	}
}