
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestModificar {
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = null;
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Modificar(venta);
        assertEquals(expResult, result);
        
    }
    
}
