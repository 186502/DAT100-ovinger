package oveingertilproveuke38;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.math.*;




public class jp2 {
	private static String G1(int n) {
		/* Oppgave G1
		a)

		Legg til en deklarasjon av en variabel n of typen heltall (int) i main-metoden.
		b)

		Legg til en for-løkke som skriver ut tallene fra 1 opptil 10. Kjør programmet å se at det fungerer.
		c)

		Modifiser for-løkken slik den skriver tallene fra 1 til (men ikke med) verdien av variabelen n. Kjør programmet der du en gir n forskjellige verdier og se at programmet gir korrekt utskrift. Hva skjer om n settes til en negativ verdi?
		*/
		
		for(int i = 1; i<n; i++) {
			System.out.println(i);
		}
		return("Programmet er kjørt!");
		
	}
	
	private static String G2() {
		/* 
		
		Oppgave G2

		Bruk en while-løkke til å skrive ut tallene fra 20 ned til 1.
		*/ 
		int i = 0;
		int n = 20;
		while(i<n) {
			n--;
			System.out.println(n);
		}
		return("Programmet er kjørt!");
		
	}
	
	private static String G3() {
		/* Oppgave G3
	a)

	Skriv et Java program som bruker en for-løkke med en tellevaribel i som starter på 1 og løper opp til og med 20
	b)

	Legg til en switch-setning inne i for-løkken slik programmet skriver ut A hvis i har verdien, 1 og B om i har verdien 2, og C ellers.
	c)

	Modifiser programmet fra b) slik det bruker en valgsetning (if-else if ... else) i stedet for en switch-setning.
	
		 */
		for(int i = 1; i <= 20; i++) {
			switch(i) {
			
			case 1:
				System.out.println(("A"));
				break;
				
			case 2:
				
				System.out.println("B");
				break;
				
			default:
				System.out.println("C");
			}
			
		}
		return("Programmet G3 har kjørt");
	}
	
	private static int G4() {
/*
 * 
	Oppgave G4

	Lag et program som leser inn to heltall fra brukeren og skriver ut summen av de. Modifiser programmet slik det kan beregne areal av et rektangel der lengden og bredden på rektangelet leses inn fra brukeren.
	
 */ 
		System.out.print("Hva er det første heltallet du vil regne på? ");
		Scanner input1 = new Scanner(System.in);
		int a = parseInt(input1.nextLine());
		
		
		System.out.print("Hva er det andre taller du vil regne på? ");
		Scanner input2 = new Scanner(System.in);
		int b = parseInt(input2.nextLine());
		
		System.out.print(a*b);
		input1.close();
		input2.close();
		return(a*b);
		
	}
	
	private static String G6() {
		int a = 5;
	    String s = "Hei";
	    double b = 4.2;
	    s = "ei";

	    System.out.println(a);
	    System.out.println(s);
	    System.out.println(b);
	    System.out.println(s + a + 3);
	    System.out.println(3 + a + s);
	    System.out.println(s);
	    System.out.println(7 / a);
	    System.out.println(13 - 2 * 5);

	    int c = 1578;
	    System.out.println(c);
	    System.out.println(s.length());
	    return("Program G6 har kjørt!");
	}
	/* 
	Oppgave G5

	Oppgave 6 Kap. 2 i Java-boken: Metoden min i klassen Math finner det minste av to tall dvs. min(1,10) = 1. Bruk denne metoden til å beregne og skrive ut det minste av 4 tall som brukeren skriver inn.
	Oppgave G6 (Gruppearbeid)

	Nedanfor finn du eit lite Java-program. Programmet inneheld nokre feil. Først går kvar enkelt student gjennom programmet på eigahand (utan å bruke Eclipse) og prøver å finne feila og kva som blir skrive ut i dei skrivesetningane som kan utførast. Metoden length() gir lengden på en streng.

	Deretter set 2 - 3 studentar seg saman og diskuterer svara. Bli einige om svara før de skriv inn programmet og sjekkar at de har rett. Dersom de har feil, prøv å forstå kvifor de tok feil. Viss ikkje de forstår kvifor, spør.

	public class Eksperiment
  	p	ublic static void main(String[] args) {

    	int a = 5;
    	String s = "Hei";
    	b = 4.2;

    	System.out.println(a);
    	System.out.println(s);
    	System.out.println(b);
    	System.out.println(s + a + 3);
    	System.out.println(3 + a + s);
    	System.out.println(s - "H");
    	System.out.println(7 / a);
    	System.out.println(13 - 2 * 5);

    	int c = 1578;
    	System.out.println(c.length());
    	System.out.println(s.length());
    
    */ 
	
	private static void B2() {
		int b, h, d;
	    String btext, htext, dtext;

	    // les inn høyde, bredde, dybde
	    htext = JOptionPane.showInputDialog("Angi høyde:");
	    btext = JOptionPane.showInputDialog("Angi bredde:");
	    dtext = JOptionPane.showInputDialog("Angi dybde:");

	    // konverter fra tekst til heltal

	    h = Integer.parseInt(htext);
	    b = Integer.parseInt(btext);
	    d = Integer.parseInt(dtext);

	    int volum = b * h * d;

	    String respons =
	        "Volum [" + htext + "," + btext + "," + dtext + "] = " + volum;

	        JOptionPane.showMessageDialog(null, respons);
	}
	
	private static void B3() {
		/*
		 * For å regne ut verdien xn, der n er et positivt heltall og x har en reell (double) verdi, kan du bruke funksjonen Math.pow(x,n) i Math-klassen. Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html

Men du kan også lage en program-løkke vha. en while-setning der du regner ut xn direkte ved å starte med å sette en variabel til 1.0, og deretter multipliserer den med x så mange ganger som n-verdien er.

Lag en klasse der du i main-metoden regner ut xn på begge måter. Verdier til x og n skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata inkludert tilfeller der talet x har desimaler. Får du alltid det samme resultatet på begge måter?
		 */
		System.out.print("Hva er heltallet du vil opphøye i? ");
		Scanner input1 = new Scanner(System.in);
		int a = parseInt(input1.nextLine());
			
			
		System.out.print("Hva skal the power of være? ");
		Scanner input2 = new Scanner(System.in);
		int b = parseInt(input2.nextLine());
		
		System.out.println("Hvis vi bruker Math.pow får vi: " + Math.pow(a, b));
		int i = 1;
		double c = a;
		while(i < b) {
			i++;
			c = a*c;
		}
		System.out.println("Ved hjelp an manuell while loop får vi: " + c);
		
		input1.close();
		input2.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Vennligst tast inn tallet du vil bruke i oppgavene");
		//Scanner input = new Scanner(System.in);
		//String inputs = input.nextLine();
		
		//int n = parseInt(inputs);
		
		//System.out.println(G1(n));
		//System.out.println(G2());
		//System.out.println(G3());
		//G4();
		//G6();
		//B2();
		B3();
		
		
		
		
		
		
	}

}
