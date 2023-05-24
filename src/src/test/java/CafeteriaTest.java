import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {
    @BeforeEach
    public void setUptest() {

    }
    @AfterEach
    public void tearDownTest(){

    }

    @Test
    void agregarCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Pequeño,4);
        assertEquals(2,cafeteriaTest.getCafesALaVenta().size());

    }

    @Test
    void agregarTrabajador() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaTest.agregarTrabajador("Tomas", Trabajador.Tipo.Cocinero,450000);
        assertEquals(2,cafeteriaTest.getTrabajadores().size());
    }

    @Test
    void agregarCliente() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCliente("a");
        cafeteriaTest.agregarCliente("b");
        assertEquals(2,cafeteriaTest.getClientes().size());
    }


    @Test
    void agregarTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        assertEquals(2,cafeteriaTest.getTesALaVenta().size());
    }

    @Test
    void agregarQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        assertEquals(2,cafeteriaTest.getQuequesALaVenta().size());
    }

    @Test
    void removerCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Pequeño,4);
        assertEquals(2,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.removerCafe(0);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
    }

    @Test
    void removerTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        assertEquals(2,cafeteriaTest.getTesALaVenta().size());
        cafeteriaTest.removerTe(0);
        assertEquals(1,cafeteriaTest.getTesALaVenta().size());
    }

    @Test
    void removerQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        assertEquals(2,cafeteriaTest.getQuequesALaVenta().size());
        cafeteriaTest.removerQueque(0);
        assertEquals(1,cafeteriaTest.getQuequesALaVenta().size());
    }

    @Test
    void despedirTrabajador() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaTest.agregarTrabajador("Tomas", Trabajador.Tipo.Cocinero,450000);
        assertEquals(2,cafeteriaTest.getTrabajadores().size());
        cafeteriaTest.despedirTrabajador(0);
        assertEquals(1,cafeteriaTest.getTrabajadores().size());
    }
    @Test
    void borrarCliente(){
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCliente("a");
        cafeteriaTest.agregarCliente("b");
        assertEquals(2,cafeteriaTest.getClientes().size());
        cafeteriaTest.borrarCliente(0);
        assertEquals(1,cafeteriaTest.getClientes().size());
    }


}