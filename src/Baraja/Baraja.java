package Baraja;

import java.util.Arrays;

public class Baraja {

	private Carta cartas[];
	
	public Baraja() {
		cartas= new Carta[52];
		
		
		for(int i=0;i<13;i++) {
			cartas[i]=CrearCarta(i+1,'C');
		}
		for(int i=13;i<26;i++) {
			cartas[i]=CrearCarta(i-12,'D');
		}
		for(int i=26;i<39;i++) {
			cartas[i]=CrearCarta(i-25,'T');
		}
		for(int i=39;i<52;i++) {
			cartas[i]=CrearCarta(i-38,'P');
		}
	}	
		
	
	private Carta CrearCarta(int numero, char palo) {
		Carta carta=new Carta();
				
				switch(numero) {
				case 1:carta.setValor("A");break;
				case 2:carta.setValor("2");break;
				case 3:carta.setValor("3");break;
				case 4:carta.setValor("4");break;
				case 5:carta.setValor("5");break;
				case 6:carta.setValor("6");break;
				case 7:carta.setValor("7");break;
				case 8:carta.setValor("8");break;
				case 9:carta.setValor("9");break;
				case 10:carta.setValor("10");break;
				case 11:carta.setValor("J");break;
				case 12:carta.setValor("Q");break;
				case 13:carta.setValor("K");break;
				}
				carta.setPalo(palo);
				return carta;
			}


	
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
	
	
	
}
