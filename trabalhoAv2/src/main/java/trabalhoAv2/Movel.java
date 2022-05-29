package trabalhoAv2;

public class Movel extends LinhaTelefonica{
    private boolean planoDadosHabilitado;

    public boolean getPlanoDadosHabilitado() {
        return planoDadosHabilitado;
    }

    public void setPlanoDadosHabilitado(boolean planoDadosHabilitado) {
        this.planoDadosHabilitado = planoDadosHabilitado;
    }
    
    public Movel(int qtdMinutosGastos, String numero, boolean planoDadosHabilitado){
        super(qtdMinutosGastos, numero);
        setPlanoDadosHabilitado(planoDadosHabilitado);
    }
    
    @Override
    public double calcular(){
        if(getPlanoDadosHabilitado() == true){
            return (0.20 * getQtdMinutosGastos()) + 40;
        }
        else{
            return 0.20 * getQtdMinutosGastos();
        }
    }
    
    @Override
    public String toString(){
        return "\n------------- Linha Móvel -------------" + "\nPlano de dados habilitado: "
                + this.planoDadosHabilitado + "\nMinutos Gastos: " + getQtdMinutosGastos() + 
                "\nNúmero: " + getNumero() +"\nValor a pagar: " + calcular();
    }
}
