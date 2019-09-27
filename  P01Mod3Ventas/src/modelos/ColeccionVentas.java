package modelos;

import java.util.ArrayList;

public class ColeccionVentas {

    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<Venta>();
    }

    public ArrayList<Venta> Listar() {
        return this.base;
    }

    public boolean Agregar(Venta venta) {
        return this.base.add(venta);
    }

    public boolean Modificar(Venta venta) {

        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                return true;
            }

        }
        return false;
    }

    public boolean Eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean SubTotal(String codigo) {

        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                System.out.println(" el subtotal de la venta es "+this.base.get(i).getCodigo()+" es:");
                System.out.println(this.base.get(i).getPrecio()*this.base.get(i).getCantidad());
                return true;
            }

        }
        return false;
    }
    
    
    /*public int subTotal(String codigo){
        
    for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                return this.base.get(i).getPrecio()* this.base.get(i).getCantidad();
                
            }
        }
        return 0;
    }*/
    

}

