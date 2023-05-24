public class Queque {

	private String tipo;
	private String tamaño;

	private int precio;
	private String sabor;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String Tipo) {
		this.tipo= Tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String Tamaño) {
		this.tamaño=Tamaño;
	}

	public int getPrecio() {
		return precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Queque(String tipo, String tamaño, String sabor, int precio ){
		this.tipo=tipo;
		this.tamaño=tamaño;
		this.sabor=sabor;
		this.precio=precio;
	}

	public String toString() {
		return "Queque "+getTipo()+" de tamaño"+getTamaño()+" y con sabor a "+getSabor()+" de precio: "+getPrecio();
	}

}