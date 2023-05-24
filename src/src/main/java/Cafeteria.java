import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
	private ArrayList<Cafe> cafesALaVenta= new ArrayList<>();
	private ArrayList<Trabajador> trabajadores= new ArrayList<>();
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

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	public List<Trabajador> getTrabajadores(){return trabajadores;}


	public void agregarCafe(String nombre, float gramosCafe, int mililitrosAgua, Cafe.Tamaño tamano, int precio){
		Cafe cafe = new Cafe(nombre, gramosCafe, mililitrosAgua, tamano, precio);
		this.cafesALaVenta.add(cafe);
	}
	public void agregarTrabajador(String nombre, Trabajador.Tipo tipo, int sueldo){
		Trabajador trabajador = new Trabajador(nombre,tipo,sueldo);
		this.trabajadores.add(trabajador);
	}



	public void removerCafe(int numero){
		getCafesALaVenta().remove(numero);
	}
	public void buscarCafe (Cafe.Tamaño tamaño){
		int numero=0;
		boolean existencia= false;
		for (int i = 0; i < getCafesALaVenta().size(); i++) {
			numero++;
			if(getCafesALaVenta().get(i).getTamaño().equals(tamaño)){
				System.out.println("Hay un cafe de tamaño "+tamaño+" en la posicion numero "+numero+" del menu");
				existencia=true;
			}
		}
		if (existencia==false){
			System.out.println("No hay cafes de tamaño "+tamaño);
		}
	}
	public void mostrarCafes() {
		System.out.println("La cafeteria "+getNombre()+" tiene a la venta los siguientes cafes:");
		for (int i = 0; i < getCafesALaVenta().size(); i++) {
			System.out.println(getCafesALaVenta().get(i).toString());
		}
	}
	public void mostrarTrabajadores() {
		System.out.println("La cafeteria "+getNombre()+" tiene los siguientes empleados:");
		for (int i = 0; i < getTrabajadores().size(); i++) {
			System.out.println(getTrabajadores().get(i).toString());
		}
	}


	public String toString(){
		return "Cafeteria "+getNombre()+" con direccion "+ getDireccion()+ " y redes sociales en "+getRedesSociales();
	}
}