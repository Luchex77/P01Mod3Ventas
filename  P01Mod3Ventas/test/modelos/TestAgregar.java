
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestAgregar {
    
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = null;
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = true;
        boolean result = instance.Agregar(venta);
        assertEquals(expResult, result);
        
    }

    
}
