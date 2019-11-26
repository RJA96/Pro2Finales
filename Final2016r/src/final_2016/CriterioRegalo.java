package final_2016;

public class CriterioRegalo implements Criterio {
	String regalo;
	public CriterioRegalo(String r) {
		regalo = r;
	}
	public boolean cumple(Carta c) {
		return (regalo==c.getRegalo());
	}
}
