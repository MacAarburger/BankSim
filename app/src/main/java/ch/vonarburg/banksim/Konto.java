package ch.vonarburg.banksim;

public class Konto{
	private static int anzKonten;

	private final String ktoInhaber;
	private double ktoStand;
	private String ktoTyp;
	private final int ktoNummer;

	public Konto(String inhaber){
		this.ktoInhaber = inhaber;
		anzKonten++;
		this.ktoNummer = anzKonten;
	}
	public Konto(String inhaber, double saldo){
		this.ktoInhaber = inhaber;
		this.ktoStand = saldo;
		anzKonten++;
		this.ktoNummer = anzKonten;
	}
	public Konto(String inhaber, double saldo, String ktoTyp){
		this.ktoInhaber = inhaber;
		this.ktoStand = saldo;
		anzKonten++;
		this.ktoNummer = anzKonten;
		this.ktoTyp = ktoTyp;
	}

	public void zahleEin(double betrag){
		this.ktoStand += betrag;
		//System.out.println("KontoStand nach Einzahlung: " + ktoStand);
	}
	public void zahleAus(double betrag){
		if (ktoStand >= betrag){
			ktoStand -= betrag;
		} else {
			System.out.println("Kontosaldo zu tief! Maximale Auszahlung: " + ktoStand);
		}
	}
	public void gibKtoStandAus(){
		String output = "Ausgabe Kontostand... ";
		if (this.ktoNummer != 0){
			output += "Konto Nummer:  " + this.ktoNummer 	+ "\n";
		}
		if (this.ktoInhaber != null && !this.ktoInhaber.equals("")){
			output += "Konto Inhaber: " + this.ktoInhaber 	+ "\n";
		}
		if (this.ktoTyp != null && !this.ktoTyp.equals("")){
			output += "Konto Typ:     " + this.ktoTyp 		+ "\n";
		}
		output +=     "Saldo:         " + this.ktoStand + " CHF!\n";
		System.out.println(output);
	}

	public static void gibAnzahlKontosAus(){
		System.out.println("Total erzeugte Konti:" + anzKonten);
	}
}
