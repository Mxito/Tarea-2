package tareaprog2;

class Comprador{
    private DepositoMonedas m;
    private Bebida bebida;
    private int vuelto;
    public Comprador(Moneda coin, int cualBebida, Expendedor maquina) throws customException{
        m = new DepositoMonedas();
        m.addMoneda(coin);
        bebida = maquina.comprarBebida(m.removeMoneda(), cualBebida);
        vuelto = maquina.valorVuelto(cualBebida);
        for(int i = vuelto; i > 0; i-=100){
            m.addMoneda(maquina.getVuelto());
        }
    }
    public String beber(){
        return "Bebiendo: "+bebida.tipoBebida()+"\n";
    }
    public void cuantoVuelto(){
        int cont = 0;
        while(vuelto > 0){
            vuelto -=100;
            System.out.println(m.elemento(cont));
            cont ++;
        }
        if(vuelto == 0){
            System.out.println("null");
        }
    }
}
