
package tareaprog2;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> D;
    private int vuelto;
    public Deposito(){
      D = new ArrayList<>();
      vuelto = 0;
    }
    public void addBebida(Bebida a){
        D.add(a);
    }
    public Bebida getBebida(Moneda m, int precio) throws customException{
        if(D.isEmpty()){
            vuelto = m.getValor();
            throw new customException("NoHayBebidaException");
        }
        if(m.getValor() < precio){
            vuelto = m.getValor();
            throw new customException("PagoInsuficienteException");
        }else{
            vuelto = m.getValor() - precio;
            return D.remove(0);
        }
    }
    public int darVuelto(){
        return vuelto;
    }
}
