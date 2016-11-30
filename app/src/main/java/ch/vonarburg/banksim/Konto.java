package ch.vonarburg.banksim;

public class Konto
{
	private static int anzKonten;
	
	private String ktoInhaber;
	private double ktoStand;
	private String ktoTyp;
	private int    ktoNummer;

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
		System.out.println("KontoStand nach Einzahlung: " + ktoStand);
	}
	public void zahleAus(double betrag){
		this.ktoStand -= betrag;
		System.out.println("KontoStand nach Auszahlung: " + ktoStand);
	}
	public void gibktoStandAus(){
		String output = "";
		if (this.ktoNummer != 0){
			output += "Konto Nummer: " + this.ktoNummer + "\n";
		}
		if (this.ktoTyp != null && this.ktoTyp != ""){
			output += "Konto Typ:    " + this.ktoTyp + "\n";
		}
		output +=     "Saldo:        " + this.ktoStand + " CHF!\n";
		System.out.println(output);
	}
	
}
