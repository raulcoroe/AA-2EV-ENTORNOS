package application;

import domain.Cliente;
import domain.Gafa;
import domain.Optico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OpticaTest {

    @Test
    public void testCrearUsuario(){
        Cliente cliente = new Cliente("Raul", "Martin", 24, "25203664B", 250);
        assertEquals("Raul", cliente.getNombre());
        assertEquals("Martin", cliente.getApellido());
        assertEquals(24, cliente.getEdad());
        assertEquals("25203664B", cliente.getDni());
        assertEquals(250, cliente.getPresuspuesto());
    }

    @Test
    public void testIntroducirGafa(){
        Gafa gafa = new Gafa("1234", "Rojo", 54, 135, 225);
        assertEquals("1234", gafa.getModelo());
        assertEquals("Rojo", gafa.getColor());
        assertEquals(54, gafa.getCalibre());
        assertEquals(135, gafa.getLongitudVarilla());
        assertEquals(225, gafa.getPrecio());
    }

    @Test
    public void testIncorporarOptico(){
        Optico optico = new Optico("Raul", "Martin", 24, "25203664B", 1500);
        assertEquals("Raul", optico.getNombre());
        assertEquals("Martin", optico.getApellido());
        assertEquals(24, optico.getEdad());
        assertEquals("25203664B", optico.getDni());
        assertEquals(1500, optico.getSalario());
    }

    @Test
    public void testEqualsCliente(){
        Cliente cliente = new Cliente("Raul", "Martin", 24, "25203664B", 250);
        Cliente cliente2 = new Cliente("Raul", "Martin", 24, "25203664B", 250);
        Cliente cliente3 = new Cliente("OtroNombre", "Martin", 24, "25203664B", 250);
        assertSame(true, cliente.equals(cliente2));
        assertSame(false, cliente.equals(cliente3));
    }
}
