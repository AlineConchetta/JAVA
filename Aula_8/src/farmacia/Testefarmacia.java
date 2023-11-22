package farmacia;

public class Testefarmacia {

	public static void main(String[] args) {

		farmacia f1 = new farmacia("Dipirona", "250g", "Analgésico e antipirético", 15.90d, "Não");
		f1.visualizar();

		farmacia f2 = new farmacia("Amoxilina", "500g", "Antibiótico", 24.89d, "Sim");
		f2.visualizar();

		farmacia f3 = new farmacia("Fluxetina", "20g", "Psicotrópico", 12.75d, "Sim");
		f3.visualizar();

		Medicamento manip = new Medicamento("Sertralina", "50mg", "Psicotrópico", 10.45d, "Sim", 2);
		manip.visualizar();
		
		Perfumaria perf = new Perfumaria("Hidratante", "500mg", "Dermatológico", 13.35d, "Não", 1);
	}

}
