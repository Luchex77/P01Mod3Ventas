
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestSubTotal {
    
    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        String codigo = "";
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.SubTotal(codigo);
        assertEquals(expResult, result);
        
    }
    
    
}
