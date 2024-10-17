public enum StatusPedido {
    PROCESSANDO(1),
    ENVIADO(2),
    ENTREGUE(3),
    CANCELADO(4);

    private int codigo;

    StatusPedido(int codigo){
        this.codigo = codigo;
    }

    public double getCodigo(){
        return codigo;
    }
}
