
package tareaprog2;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> D;
    private final int precio;
    private int vuelto;
    public Deposito(){
      D = new ArrayList<>();
      precio = 1000;
      vuelto = 0;
    }
    public void addBebida(Bebida a){
        D.add(a);
    }
    public Bebida getBebida(Moneda m) throws customException{
        if(D.isEmpty()){
            return null;
        }
        if(m.getValor() < precio){
            throw new customException("PagoInsuficienteException");
        }else{
            vuelto = m.getValor() - precio;
            return D.remove(0);
        }
    }
}
