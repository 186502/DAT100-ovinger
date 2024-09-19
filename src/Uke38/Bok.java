package Uke38;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Bok {

	private String tittel;
	private String forfatter;
	private double pris;
	private int antallSider;
	
	public String getTittel() {
		return tittel;
	}
	public String getForfatter() {
		return forfatter;
	}
	public double getPris() {
		return pris;
	}
	public int getantallSider() {
		return antallSider;
	}
	public void setTittel(String nyTittel) {
		tittel = nyTittel;
	}
	public void setForfatter(String nyForfatter) {
		forfatter = nyForfatter;
	}
	public void setPris(double nyPris) {
		pris = nyPris;
	}
	public void setAS(int nyAS) {
		antallSider = nyAS;
	}	
	public Bok(String tittel, String forfatter, double pris, int antallSider) {
		
		this.tittel = tittel;
		this.forfatter = forfatter;
		this.pris = pris;
		this.antallSider = antallSider;
		
	}
	public Bok() {
		
		System.out.print("Hva er forfatter du ønsker å taste inn?" );
		Scanner forfatterinput = new Scanner(System.in);
		forfatter = forfatterinput.nextLine();
		
		System.out.print("Hva er tittelen du ønsker å taste inn?" );
		Scanner tittelinputs = new Scanner(System.in);
		tittel = tittelinputs.nextLine();
		
		System.out.print("Hva er prisen du ønsker å taste inn?" );
		Scanner prisinputs = new Scanner(System.in);
		pris = parseDouble(prisinputs.nextLine());
		
		System.out.print("Hva er antall sider du ønsker å taste inn?" );
		Scanner antallSiderS = new Scanner(System.in);
		antallSider = parseInt(antallSiderS.nextLine());
	
		
		tittelinputs.close();
		prisinputs.close();
		antallSiderS.close();
		forfatterinput.close();
	}
	public String setnyForfatter() {
		System.out.print("Hva er forfatter du ønsker å taste inn?" );
		Scanner forfatterinput = new Scanner(System.in);
		forfatter = forfatterinput.nextLine();
		forfatterinput.close();
		return forfatter;
		
	}		
	public String setnyTittel() {
		System.out.print("Hva er tittelen du ønsker å taste inn?" );
		Scanner tittelinputs = new Scanner(System.in);
		tittel = tittelinputs.nextLine();
		tittelinputs.close();
		return tittel;
		
	}
	
	public double setnyPris() {
		System.out.print("Hva er prisen du ønsker å taste inn?" );
		Scanner prisinputs = new Scanner(System.in);
		pris = parseDouble(prisinputs.nextLine());
		prisinputs.close();
		return pris;
	}
	
	public int setnyAS() {
		System.out.print("Hva er antall sider du ønsker å taste inn?" );
		Scanner antallSiderS = new Scanner(System.in);
		antallSider = parseInt(antallSiderS.nextLine());
		antallSiderS.close();
		return antallSider;
	}
	
	public void skriv_ut() {
		System.out.println("Tittel: " + tittel);
		System.out.println("Forfatter: " + forfatter);
		System.out.println("Prisen er: " + pris);
		System.out.println("Antall sider er: " + antallSider);
		
		
		
		
		
	}

	
}
