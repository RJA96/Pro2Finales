package final_2016;

import java.util.ArrayList;

public class Localidad extends CPais {
	ArrayList<Buzon> buzonesesp;
	ArrayList<CPais> buzones;
	public double getPorcentajeRegalo(Criterio r) {
		double aux = 0;
		if (buzonesesp.size()>0) {
			for(int i = 0;i<buzonesesp.size();i++) {
				aux+=buzonesesp.get(i).getPorcentajeRegalo(r);
			}
			aux=aux/buzonesesp.size();
		}
		if(buzones.size()>0) {
			for (int i = 0;i<buzones.size();i++) {
				aux+=buzonesesp.get(i).getPorcentajeRegalo(r);
			}
			aux=aux/buzones.size();
		}
		return aux;
		
	}
	public int getCantCartas(Criterio r) {
		int aux=0;
		for(int i = 0;i<buzonesesp.size();i++) {
			aux+=buzonesesp.get(i).getCantCartas(r);
		}
		for(int i = 0;i<buzones.size();i++) {
			aux+=buzones.get(i).getCantCartas(r);
		}
		return aux;
	}
	public int getCantNiniosMalos() {
		int aux=0;
		for(int i = 0;i<buzonesesp.size();i++) {
			aux+=buzonesesp.get(i).getCantNiniosMalos();
		}
		for(int i = 0;i<buzones.size();i++) {
			aux+=buzones.get(i).getCantNiniosMalos();
		}
		return aux;
	}
	public int getTotalCartas() {
		int aux=0;
		for(int i = 0;i<buzonesesp.size();i++) {
			aux+=buzonesesp.get(i).getTotalCartas();
		}
		for(int i = 0;i<buzones.size();i++) {
			aux+=buzones.get(i).getTotalCartas();
		}
		return aux;
	}
	public ArrayList<Carta> listaCartas(){
		ArrayList<Carta> aux = new ArrayList<Carta>();
		for(int i = 0;i<buzonesesp.size();i++) {
			aux.addAll(buzonesesp.get(i).listaCartas());
		}
		for(int i = 0;i<buzones.size();i++) {
			aux.addAll(buzones.get(i).listaCartas());
		}
		return aux;
	}
}
