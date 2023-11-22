package Ingressos;

public class Ingressos {

	private String artista;
	private double valor;
	private String horasDeShow;
	private String horárioDeInicio;
	private int valorDaAgua;

	public Ingressos(String artista, double valor, String horasDeShow, String horárioDeInicio, int valorDaAgua) {
		this.artista = artista;
		this.valor = valor;
		this.horasDeShow = horasDeShow;
		this.horárioDeInicio = horárioDeInicio;
		this.valorDaAgua = valorDaAgua;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getHorasDeShow() {
		return horasDeShow;
	}

	public String setHorasDeShow(String horasDeShow) {
		return horasDeShow;
	}

	public String getHorárioDeInicio() {
		return horárioDeInicio;
	}

	public String setHorárioDeInicio(String horárioDeInicio) {
		return horárioDeInicio;
	}

	public int getValorDaAgua(int valorDaAgua) {
		return this.valorDaAgua = valorDaAgua;
	}

	public int setalorDaAgua(int valorDaAgua) {
		return this.valorDaAgua = valorDaAgua;
	}

	public void visualizar() {
		System.out.println("Qual artista? " + this.artista);
		System.out.println("Qual valor? " + this.valor);
		System.out.println("Qual duração do evento? " + this.horasDeShow);
		System.out.println("Inicio do show: " + this.horárioDeInicio);
		System.out.println("Qual valor da água? " + this.valorDaAgua + "\n");
	}
}
