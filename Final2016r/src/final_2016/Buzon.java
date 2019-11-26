package final_2016;

import java.util.ArrayList;

public class Buzon extends CPais {
	ArrayList<Ninio> niniosbuenos;
	String remplazo;
	ArrayList<Carta> cartas;
	
	public Buzon(String remplazo) {
		this.niniosbuenos = new ArrayList<Ninio>();
		this.remplazo = remplazo;
		this.cartas = new ArrayList<Carta>();
	}
	public void addCarta(Carta c) {
		if(niniosbuenos.contains(c.getRemitente())) {
			cartas.add(c);
		}
		else {
			c.setRegalo(remplazo);
			cartas.add(c);
		}
	}
	public double getPorcentajeRegalo(Criterio r) {
		int aux =0;
		for (int i=0;i<cartas.size();i++) {
			if (r.cumple(cartas.get(i))) {
				aux++;
			}
		}
		return aux*100/cartas.size();
	};
	public int getCantCartas(Criterio r) {
		int aux =0;
		for (int i=0;i<cartas.size();i++) {
			if (r.cumple(cartas.get(i))) {
				aux++;
			}
		}
		return aux;
	}
	public int getCantNiniosMalos() {
		int aux = 0;
		for (int i=0;i<cartas.size();i++) {
			if (niniosbuenos.contains(cartas.get(i).getRemitente())==false) {
				aux++;
			}
		}
		return aux;
	}
	public int getTotalCartas() {
		return cartas.size();
	}
	public  ArrayList<Carta> listaCartas(){
		ArrayList<Carta> aux = new ArrayList<Carta>();
		aux = cartas;
		return aux;
	}
}
