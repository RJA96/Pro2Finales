package final_2016;

public class Carta {
	Ninio remitente;
	String regalo;
	public Carta(Ninio remitente, String regalo) {
		super();
		this.remitente = remitente;
		this.regalo = regalo;
	}
	public Ninio getRemitente() {
		return remitente;
	}
	public void setRegalo(String regalo) {
		this.regalo = regalo;
	}
	 public String getRegalo() {
		 return regalo;
	 }
}