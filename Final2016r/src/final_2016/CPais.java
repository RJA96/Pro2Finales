package final_2016;

import java.util.ArrayList;

public abstract class CPais {
	String nombre;
	public abstract double getPorcentajeRegalo(Criterio r);
	public abstract int getCantCartas(Criterio r);
	public abstract int getCantNiniosMalos();
	public abstract int getTotalCartas();
	public abstract ArrayList<Carta> listaCartas();
}
