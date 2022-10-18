
package deposito;

import java.util.ArrayList;

class Deposito{
    private ArrayList <Bebida> d;
    public Deposito(){
      d = new ArrayList <Bebida>();
    }
    public void addBebida(Bebida a){
        d.add(a);
    }
    public Bebida getBebida(){
        if(d.size() ==0){
            return null;
        }
        return d.remove(0);
    }
}

public class Deposito {

    
    public static void main(String[] args) {
        
    }
    
}
