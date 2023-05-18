public class Cafe {
	private float gramosCafe;

	private int mililitrosAgua;
	private String tamaño;
	private String nombre;
	private int precio;

	public Cafe( String nombre,float gramosCafe, int mililitrosAgua, String tamaño) {
		this.gramosCafe= gramosCafe;
		this.mililitrosAgua= mililitrosAgua;
		this.tamaño=tamaño;
		this.nombre= nombre;

	}

	public String getTamaño() {
		return tamaño;
	}

	public float getGramosCafe() {
		return gramosCafe;
	}

	public int getMililitrosAgua() {
		return mililitrosAgua;
	}

	public String getNombre() {
		return nombre;
	}

	public void setGramosCafe(float gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString(){
		return "Cafe "+getNombre()+" de tamaño "+ getTamaño()+ " con "+getGramosCafe()+" gramos de cafe y "+getMililitrosAgua()+" mm de agua";
	}

}
