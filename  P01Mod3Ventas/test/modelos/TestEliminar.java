
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestEliminar {
    
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "";
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Eliminar(codigo);
        assertEquals(expResult, result);
        
    }
    
}
