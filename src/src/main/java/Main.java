public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteriaPrueba = new Cafeteria("cafeggedon","montt 231", "@cafeggedon");
        cafeteriaPrueba.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano, 1300);
        cafeteriaPrueba.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño,1000);
        cafeteriaPrueba.agregarCafe("latte",20,200, Cafe.Tamaño.Grande,1600);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
        cafeteriaPrueba.removerCafe(1);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Grande);
        cafeteriaPrueba.buscarCafe(Cafe.Tamaño.Pequeño);
    }
}