package Ingressos;

public class Testaingresso {

	public static void main(String[] args) {

		Ingressos i1 = new Ingressos("Taylor Swift", 700.00d, "18h", "4h", 10);
		i1.visualizar();

		Ingressos i2 = new Ingressos("RBD - Rebeldes", 600.00d, "19h", "4h", 8);
		i2.visualizar();

		Ingressos i3 = new Ingressos("Lady Gaga", 890.00d, "20h", "3h", 12);
		i3.visualizar();

		Ingressos i4 = new Ingressos("Miley Cirus", 550.00d, "18h", "3h", 10);
		i4.visualizar();

		Vip ingvip = new Vip("RBD - Rebeldes", 600.00d, "4h", "19h", 8, 1);
		ingvip.visualizar();
		
		MeiaEntrada meia = new MeiaEntrada ("Lady Gaga", 350.00d, "3h", "20h", 8, 1);
		meia.visualizar();

	}

}
