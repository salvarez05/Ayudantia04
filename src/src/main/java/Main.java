public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteriaPrueba = agregarCafeteria("cafeggedon","montt 231", "@cafeggedon");
        cafeteriaPrueba.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano);
        cafeteriaPrueba.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.agregarCafe("latte",20,200, Cafe.Tamaño.Grande);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        mostrarCafes(cafeteriaPrueba);
        cafeteriaPrueba.removerCafe(1);
        mostrarCafes(cafeteriaPrueba);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Grande);

    }

    private static void mostrarCafes(Cafeteria cafeteria) {
        System.out.println(cafeteria.toString()+" tiene a la venta los siguientes cafes:");
        for (int i = 0; i < cafeteria.getCafesALaVenta().size(); i++) {
            System.out.println(cafeteria.getCafesALaVenta().get(i).toString());
        }
    }

    private static Cafeteria agregarCafeteria(String nombre, String direccion, String redesSociales) {
        Cafeteria cafeteria= new Cafeteria(nombre, direccion, redesSociales);
        return cafeteria;
    }

}