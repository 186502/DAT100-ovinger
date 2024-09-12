package uke37;

public class torsdag {
	private static void skrivTabell(double [] tab) {
		for(double e : tab) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	private static void bytt(double[] tabell, int plassering, int nyplassering) {
		double tmp = tabell[plassering];
		tabell[nyplassering] = tmp;
		
	}
	
	private static int minstepos(double[] tabell, int plassering) {
		int mP = plassering;
		for (int i = plassering+1; i < tabell.length; i++) {
			if(tabell[i] < tabell[mP]) {
				mP = i;
			}
		}
		return mP;
	}
	private static void plukk(double[] tabell) {
		for(int i = 0; i < tabell.length - 1; i++) {
			int j = minstepos(tabell, i);
			bytt(tabell, i, j);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {2.1, 1.3, 0.0, 4.5, 1.0};
		
		bytt(a, 0, 1);
		minstepos(a,3);
		plukk(a);
		skrivTabell(a);
		

	}

}
