public class Te {

	private String tipoTe;
	private int mililitroAgua;
	private String concentracion;
	private String tamaño;
	private String temperatura;

	public String getTipoTe() {
		return this.tipoTe;
	}

	public void setTipoTe(String tipoTe) {
		this.tipoTe = tipoTe;
	}

	public int getMililitroAgua() {
		return this.mililitroAgua;
	}

	public void setMililitroAgua(int mililitroAgua) {
		this.mililitroAgua = mililitroAgua;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String Concentracion) {
		this.concentracion= Concentracion;
	}


	public Te(String tipoTe, int militroAgua, String concentracion) {
		this.tipoTe=tipoTe;
		this.mililitroAgua=militroAgua;
		this.concentracion=concentracion;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String Tamaño) {
		this.tamaño = tamaño;
	}

	public String getTemperatura() {
		return  temperatura;
	}


	public void setTemperatura(String Temperatura) {
		this.temperatura= Temperatura;
	}

	public String toString() {
		return "";
	}

}