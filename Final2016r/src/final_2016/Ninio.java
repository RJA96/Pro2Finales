package final_2016;

public class Ninio {
	int dni;
	public Ninio (int dni) {
		this.dni = dni;
	}
	public int getDni() {
		return dni;
	}

	@Override
	public boolean equals(Object obj) {
		 Ninio aux = (Ninio) obj;
         if (this.dni == aux.getDni()) { return true; } else { return false; }

	}
}
