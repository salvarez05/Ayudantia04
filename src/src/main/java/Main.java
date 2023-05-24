public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteriaPrueba = agregarCafeteria("cafeggedon","montt 231", "@cafeggedon");
        cafeteriaPrueba.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano, 1000);
        cafeteriaPrueba.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño,1400);
        cafeteriaPrueba.agregarCafe("latte",20,200, Cafe.Tamaño.Grande,1600);
        System.out.println(cafeteriaPrueba.toString());
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.mostrarCafes();
        cafeteriaPrueba.removerCafe(1);
        cafeteriaPrueba.mostrarCafes();
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Grande);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaPrueba.mostrarTrabajadores();
    }




    private static Cafeteria agregarCafeteria(String nombre, String direccion, String redesSociales) {
        Cafeteria cafeteria= new Cafeteria(nombre, direccion, redesSociales);
        return cafeteria;
    }

}