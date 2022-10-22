package tareaprog2;

class Comprador{
    private Moneda moneda;
    private int bebida;
    
    public Comprador(Moneda coin, int cualBebida, Expendedor maquina){
        moneda=coin;
        bebida = cualBebida;
    }
    public int cuantoVuelto(){
      return 1;  
    }
    public String queBebiste(){
        return "a";
    }
}
