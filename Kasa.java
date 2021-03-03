package kafic;

public class Kasa {
	
	private double trenutnoStanje;
	//lista racuna, napraviti klasu racun, klasu sto, svaki sto ima racun, kata se sto oslobodi
	//racun se upisuje u fajl a vrednosti se redefinisu kada se sto ponovo zauzme 
	
	
	public Kasa(double trenutnoStanje) {this.trenutnoStanje=trenutnoStanje; }
	
	public double getTrenutnostanje() {return trenutnoStanje; }
	
	public void  setTrenutnostanje(double trenutnoStanje) {this.trenutnoStanje=trenutnoStanje; }
	
	public void naplati(double iznos, double datnovac) {
		
		double x=getTrenutnostanje();
		
		if(datnovac >= iznos) {
			
			x+=datnovac;
			double kusur= datnovac-iznos;
			x-=kusur;
			setTrenutnostanje(x);
			
		} else
			System.out.print("Nije dovoljno novca dato ");
		
		
	}
	
	

}
