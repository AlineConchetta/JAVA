package videogame;

public class videogame {
	
	String nomeJogo;
	double valor;
	String console;
	String horasDeJogo;
	String tipo;
	
	
	public videogame(String nomeJogo, double valor, String console, String horasDeJogo, String tipo) {
		this.nomeJogo = nomeJogo;
		this.valor = valor;
		this.console = console;
		this.horasDeJogo = horasDeJogo;
		this.tipo = tipo;
	}


	public String getNomeJogo() {
		return nomeJogo;
	}


	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getConsole() {
		return console;
	}


	public void setConsole(String console) {
		this.console = console;
	}


	public String getHorasDeJogo() {
		return horasDeJogo;
	}


	public void setHorasDeJogo(String horasDeJogo) {
		this.horasDeJogo = horasDeJogo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		System.out.println("O nome do jogo é: " + this.nomeJogo);
		System.out.println("O valor do jogo é: " + this.valor);
		System.out.println("Jogo para console de: " + this.console);
		System.out.println("São " + this.horasDeJogo + "de jogo.");
		System.out.println("O jogo é de: " + this.tipo + "\n");
	}
	
}
