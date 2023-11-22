package Ingressos;

public class Vip extends Ingressos {

	private int openBar;

	public Vip(String artista, double valor, String horasDeShow, String horarioDeInicio, int valorDaAgua, int openBar) {
		super(artista, valor, horasDeShow, horarioDeInicio, valorDaAgua);
		this.openBar = openBar;
	}

	public int getOpenBar() {
		return openBar;
	}

	public void setOpenBar(int openBar) {
		this.openBar = openBar;
	}

	@Override
	public void visualizar() {
		super.visualizar();

		String opcao = "";

		switch (this.openBar) {
		case 1:
			opcao = "Sim";
			break;
		case 2:
			opcao = "Não";
			break;
		}

		System.out.println("Ingresso Vip com OpenBar? " + opcao);
	}

}
