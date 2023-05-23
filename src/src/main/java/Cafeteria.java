import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
	private ArrayList<Cafe> cafesALaVenta= new ArrayList<>();
	private String nombre;
	private String direccion;
	private String redesSociales;

	public Cafeteria(String nombre,String direccion,String redesSociales){
		this.direccion= direccion;
		this.nombre=nombre;
		this.redesSociales= redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCafesALaVenta(ArrayList<Cafe> cafesALaVenta) {
		this.cafesALaVenta = cafesALaVenta;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public List<Cafe> getCafesALaVenta() {
		return cafesALaVenta;
	}


	public void agregarCafe(String nombre, float gramosCafe, int mililitrosAgua, Cafe.Tamaño tamano){
		Cafe cafe = new Cafe(nombre, gramosCafe, mililitrosAgua, tamano);
		this.cafesALaVenta.add(cafe);
	}
	public void removerCafe(int numero){
		getCafesALaVenta().remove(numero);
	}
	public void buscarCafe (Cafe.Tamaño tamaño){
		int numero=0;
		for (int i = 0; i < getCafesALaVenta().size(); i++) {
			numero++;
			if(getCafesALaVenta().get(i).getTamaño().equals(tamaño)){
				System.out.println("Hay un cafe de tamaño "+tamaño+" en la posicion numero "+numero);
			}
		}
	}
	public String toString(){
		return "La cafeteria "+getNombre()+" con direccion "+ getDireccion()+ " y redes sociales en "+getRedesSociales();
	}
}