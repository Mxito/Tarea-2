
package tareaprog2;

class moneda{
    private final int valor;
    public moneda(int n){
        valor = n;
    }
    public int getValor(){
        return valor;
    }
}

class moneda100 extends moneda{
    public moneda100(){
        super(100);
    }
}

class moneda500 extends moneda{
    public moneda500(){
        super(500);
    }
}

class moneda1000 extends moneda{
    public moneda1000(){
        super(1000);
    }
}

