package Baraja;

public class Carta {

	private String valor;
	private char palo;
	
	
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public char getPalo() {
		return palo;
	}
	public void setPalo(char palo) {
		this.palo = palo;
	}
	
	public String toString() {
		return "["+valor + palo+"]";
	}
	
}
