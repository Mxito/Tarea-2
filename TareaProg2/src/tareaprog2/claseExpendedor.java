
package tareaprog2;
import java.util.ArrayList;

class Expendedor {
    private ArrayList<Deposito> D;
    private int precio;
    private int vuelto;
    public Expendedor(int n, int price){
        precio = price;
        vuelto = 0;
        D = new ArrayList<>(3);
        for(int i = 0; i < n; i++){
            D.get(0).addBebida(new Fanta(1000+i));
            D.get(1).addBebida(new Sprite(2000+i));
            D.get(2).addBebida(new CocaCola(3000+i));
        }
    }
    public Bebida comprarBebida(Moneda m, int numero) throws customException{
        if (m == null){
            throw new customException("PagoIncorrectoException");
        }
        if(numero == 1){
            if(D.isEmpty()){
               vuelto = m.getValor();
               throw new customException("NoHayBebidaException");
            }
            return D.get(0).getBebida(m, precio, vuelto);
        }
        if(numero == 2){
            if(D.isEmpty()){
               vuelto = m.getValor();
               throw new customException("NoHayBebidaException");
            }
            return D.get(1).getBebida(m, precio, vuelto);
        }
        if(numero == 3){
            if(D.isEmpty()){
               vuelto = m.getValor();
               throw new customException("NoHayBebidaException");
            }
            return D.get(3).getBebida(m, precio, vuelto);
        }
        throw new customException("NoHayBebidaException");
    }
    public Moneda getVuelto(){
        if(vuelto > 0){
            vuelto -= 100;
            return new Moneda100();
        }
        return null;
    }
}
