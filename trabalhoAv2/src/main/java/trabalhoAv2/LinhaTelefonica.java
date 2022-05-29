package trabalhoAv2;

public abstract class LinhaTelefonica implements Consumo{
    private int qtdMinutosGastos;
    private String numero;
    private Cliente cliente;
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void setQtdMinutosGastos(int qtdMinutosGastos) {
        this.qtdMinutosGastos = qtdMinutosGastos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public LinhaTelefonica(int qtdMinutosGastos, String numero){
        setQtdMinutosGastos(qtdMinutosGastos);
        setNumero(numero);
    }
    
    @Override
    public abstract double calcular();
}
