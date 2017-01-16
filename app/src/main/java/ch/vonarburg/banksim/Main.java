package ch.vonarburg.banksim;

public class Main
{
	public static void main(String[] args)
	{
		//Konto kontoUrs = new Konto("Urs");
		//kontoUrs.gibKtoStandAus();
		//kontoUrs.zahleEin(99.95);
		//kontoUrs.gibKtoStandAus();
		
		Konto kontoLevent = new Konto("Levent", 10);
		//kontoLevent.zahleAus(100);
		kontoLevent.gibKtoStandAus();
		
		//Konto kontoGiorgio = new Konto("Giorgio", 10, "Privat");
		//kontoGiorgio.gibKtoStandAus();

		int anzahlEinzahlungen = 15;
		while(anzahlEinzahlungen > 0){
			kontoLevent.zahleEin(1);
			anzahlEinzahlungen--;
		}
		kontoLevent.gibKtoStandAus();


		Konto.gibAnzahlKontosAus();
	}
}
