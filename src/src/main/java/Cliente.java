import java.util.Random;
public class Cliente {


	Cafeteria Tienda;
	private String Nombre;
	private int Dinero;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre= Nombre;
	}

	public int getDinero() {
		return Dinero;
	}

	public void setDinero(int Dinero) {
		this.Dinero = Dinero;
	}

	public Boolean dineroSuficiente() {
		return true;
	}

}