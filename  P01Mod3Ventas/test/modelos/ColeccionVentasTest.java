
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> expResult = null;
        ArrayList<Venta> result = instance.Listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class ColeccionVentas.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = null;
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Agregar(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class ColeccionVentas.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = null;
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Modificar(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class ColeccionVentas.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "";
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubTotal method, of class ColeccionVentas.
     */
    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        String codigo = "";
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.SubTotal(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
