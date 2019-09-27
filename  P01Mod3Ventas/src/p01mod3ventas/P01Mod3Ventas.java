
package p01mod3ventas;

import java.util.ArrayList;
import java.util.ArrayList;
import modelos.ColeccionVentas;
import modelos.Venta;

public class P01Mod3Ventas {

    public static void main(String[] args) {
        
        ColeccionVentas lista=new ColeccionVentas();
        Venta venta;
        String codigo = null;
        
        venta =new Venta("Codigo_1", 1200, 2);
        lista.Agregar(venta);        
        venta =new Venta("Codigo_2", 26000, 1);
        lista.Agregar(venta);        
        venta =new Venta("Codigo_3", 800, 2);
        lista.Agregar(venta);        
        ListarVentas(lista.Listar());
               
        
        
        
        System.out.println("******************************");  
        System.out.println("Modificar precio y cantidad en el codigo_2 de la venta");
        venta =new Venta("Codigo_2", 25000,2);
        lista.Modificar(venta); 
        ListarVentas(lista.Listar());
        
        System.out.println("******************************");  
        System.out.println("Eliminar el codigo_3 de la venta");
        codigo = "Codigo_3";
        lista.Eliminar(codigo);
        ListarVentas(lista.Listar());
        
    }

        
           
    
    public static void ListarVentas(ArrayList<Venta> lista){
        for(Venta obj:lista){
            System.out.println("Codigo : "+obj.getCodigo());
            System.out.println("Precio : "+obj.getPrecio());
            System.out.println("Cantidad : "+obj.getCantidad());
            System.out.println("------------------------");
        }
    }
    
    
}
