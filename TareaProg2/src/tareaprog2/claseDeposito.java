
package tareaprog2;
import java.util.ArrayList;

class Deposito{
    private ArrayList <Bebida> d;
    private final int precio;
    private final int vuelto;
    public Deposito(){
      d = new ArrayList <Bebida>();
      precio = 1000;
      vuelto = 0;
    }
    public void addBebida(Bebida a){
        d.add(a);
    }
    public Bebida getBebida(Moneda m){
        if(d.size() ==0){
            return null;
        }
        return d.remove(0);
    }
}
