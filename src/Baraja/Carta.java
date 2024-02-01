package Baraja;

public class Carta {

	private String valor;
	private char palo;
	private boolean bocaArriba=true;
	
	
	
	public boolean isBocaArriba() {
		return bocaArriba;
	}
	public void setBocaArriba(boolean girada) {
		this.bocaArriba = girada;
	}
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
		String devolver="["+valor +""+palo;
		if(bocaArriba) {
			devolver+="]";
		}
		else devolver +="*]";
		return devolver;
	}
	
}
