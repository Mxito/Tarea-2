package tareaprog2;

class Comprador{
    private Moneda moneda;
    private int bebida;
    
    public Comprador(Moneda coin, int cualBebida){
        moneda=coin;
        bebida = cualBebida;
    }
    public void comprarBebida(){
        
    }
    public int cuantoVuelto(){
      return 1;  
    }
    public String queBebiste(){
        return "a";
    }
}
