package tareaprog2;
import java.util.ArrayList;
import java.util.Date;


public class TareaProg2 {
    
    public static void main(String[] args) throws customException {
        Expendedor exp = new Expendedor(4, 500);
        Moneda1000 Luca = new Moneda1000();
        Moneda500 Quina = new Moneda500();
        Moneda100 Gamba = new Moneda100();
        Comprador Mbappe = new Comprador(Luca, 1, exp);
        Comprador Benzema = new Comprador(Quina, 2, exp);
        Comprador Messi = new Comprador(Quina, 3, exp);
        System.out.print(Mbappe.beber());
        Mbappe.cuantoVuelto();
        System.out.print("\n"+Benzema.beber());
        Benzema.cuantoVuelto();
        System.out.print("\n"+Messi.beber());
        Messi.cuantoVuelto();
    }
}
