public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteriaPrueba = new Cafeteria("cafeggedon","montt 231", "@cafeggedon");
        cafeteriaPrueba.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano, 1300);
        cafeteriaPrueba.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño,1000);
        cafeteriaPrueba.agregarCafe("latte",20,200, Cafe.Tamaño.Grande,1600);
        System.out.println(cafeteriaPrueba.toString());
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.mostrarCafes();
        cafeteriaPrueba.removerCafe(1);
        cafeteriaPrueba.mostrarCafes();
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Grande);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaPrueba.agregarTrabajador("Tomas", Trabajador.Tipo.Cocinero,450000);
        cafeteriaPrueba.mostrarTrabajadores();
        cafeteriaPrueba.despedirTrabajador(0);
        cafeteriaPrueba.mostrarTrabajadores();
        cafeteriaPrueba.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaPrueba.mostrarTes();
        Cliente clientePrueba= new Cliente("pedro");
        System.out.println(clientePrueba.toString());
        clientePrueba.comprarCafe(cafeteriaPrueba.getCafesALaVenta().get(1));
        clientePrueba.comprarTe(cafeteriaPrueba.getTesALaVenta().get(0));
        System.out.println(clientePrueba.toString());
    }

}