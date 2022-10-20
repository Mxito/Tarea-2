
package tareaprog2;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> D;
    public Deposito(){
      D = new ArrayList<>();
    }
    public void addBebida(Bebida a){
        D.add(a);
    }
    public Bebida getBebida(Moneda m, int precio, int vuelto) throws customException{
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
