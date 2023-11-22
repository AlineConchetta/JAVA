package funcionarios;

public class funcionarios {
	
	private	String nomeCompleto;
	private String cargo;
	private double salario;
	private int cargaHoraria;
	private int faltas;
		
	public funcionarios(String nomeCompleto, String cargo, double salario, int cargaHoraria, int faltas) {
		this.nomeCompleto = nomeCompleto;
		this.cargo = cargo;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.faltas = faltas;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public void visualizar() {
		System.out.println("Nome completo: " + this.nomeCompleto);
		System.out.println("Carga horária: " + this.cargaHoraria);
		System.out.println("Quantidade de faltas: " + this.faltas);
		System.out.println("O cargo que o funcionário ocupa: " + this.cargo);
		System.out.println("Salário do funcionário: " + this.salario + "\n");
	}
}
