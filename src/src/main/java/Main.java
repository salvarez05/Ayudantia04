public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteriaPrueba = agregarCafeteria("cafeggedon","montt 231", "@cafeggedon");
        cafeteriaPrueba.agregarCafe("moccha",20,150,"mediano");
        cafeteriaPrueba.agregarCafe("latte",15,100,"pequeño");
        cafeteriaPrueba.agregarCafe("latte",20,200,"grande");
        cafeteriaPrueba.buscarCafe("mediano");
        cafeteriaPrueba.buscarCafe("chico");
        mostrarCafes(cafeteriaPrueba);
        cafeteriaPrueba.removerCafe(1);
        mostrarCafes(cafeteriaPrueba);
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