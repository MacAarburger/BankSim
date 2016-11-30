package ch.vonarburg.banksim;

public class Main
{
	public static void main(String[] args)
	{
		Konto kontoUrs = new Konto("Urs");
		kontoUrs.gibktoStandAus();
		kontoUrs.zahleEin(99.95);
		kontoUrs.gibktoStandAus();
		
		Konto kontoLevent = new Konto("Levent", 10000);
		kontoLevent.zahleAus(100);
		kontoLevent.gibktoStandAus();
		
		Konto kontoGiorgio = new Konto("Giorgio", 10, "Giro");
		kontoGiorgio.gibktoStandAus();
	}
}
