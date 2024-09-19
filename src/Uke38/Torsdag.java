package Uke38;


public class Torsdag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bok a = new Bok("Java", "Han Lars", 250.49, 342);
		Bok b = new Bok();
		Bok c = new Bok("Java bundle", "Han Lars",(b.getPris() + a.getPris()), (b.getantallSider() + a.getantallSider()));
		
		a.skriv_ut();
		b.skriv_ut();
		
		c.skriv_ut();
		System.out.println("Bok C er en bundle med: ");
		a.skriv_ut();
		b.skriv_ut();
		//System.out.println(b.getTittel());
		
	}

}
