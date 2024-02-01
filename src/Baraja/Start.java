package Baraja;

public class Start {
	public static void main(String[] args) {
		
	
	Baraja baraja= new Baraja();
	
	
	System.out.println(baraja);
	baraja.voltearCarta("4",'D');
	baraja.voltearCarta("2",'D');
	baraja.voltearCarta("A",'C');
	System.out.println(baraja);
	baraja.Barajar();
	baraja.Barajar();
	baraja.Barajar();
	baraja.Barajar();
	System.out.println(baraja);
	}
}
