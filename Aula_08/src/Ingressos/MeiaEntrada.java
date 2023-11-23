package Ingressos;

public class MeiaEntrada extends Ingressos {

	private int descontoValor;

	public MeiaEntrada(String artista, double valor, String horasDeShow, String horárioDeInicio, int valorDaAgua,
			int descontoValor) {
		super(artista, valor, horasDeShow, horárioDeInicio, valorDaAgua);
		this.descontoValor = descontoValor;
	}

	public int getDescontoValor() {
		return descontoValor;
	}

	public void setDescontoValor(int descontoValor) {
		this.descontoValor = descontoValor;
	}

	@Override
	public void visualizar() {
		super.visualizar();

		String op = "";

		switch (this.descontoValor) {
		case 1:
			op = "Sim";
			break;
		case 2:
			op = "Não";
			break;
		}
		System.out.println("Ingresso meia entrada? " + op);
	}
}