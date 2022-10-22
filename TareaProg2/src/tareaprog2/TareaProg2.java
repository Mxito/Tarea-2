package tareaprog2;
import java.util.ArrayList;
import java.util.Date;


public class TareaProg2 {
    
    public static void main(String[] args) throws customException {
        Expendedor exp = new Expendedor(4, 500);
        Moneda500 escudo = new Moneda500();
        Moneda500 rublos = new Moneda500();
        Comprador mbappe = new Comprador(escudo, 1, exp);
        System.out.println(mbappe.beber());
        mbappe.cuantoVuelto();
    }
}
