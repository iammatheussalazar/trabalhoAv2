package trabalhoAv2;

public class Fixa extends LinhaTelefonica{
    int franquia = 30;
    
    public Fixa(int qtdMinutosGastos, String numero){
        super(qtdMinutosGastos, numero);
    }
    
    @Override
    public double calcular(){
        if(getQtdMinutosGastos() <= franquia){
            return 45;
        }
        else{
            return 45 + calcular(getQtdMinutosGastos() - franquia);
        }
    }
    
    public double calcular(int minutosExcedentes){
        return 0.05 * minutosExcedentes;
    }
    
    @Override
    public String toString(){
        return "\n------------- Linha Fixa -------------" + "\nMinutos Gastos: " + 
                getQtdMinutosGastos() + "\nNúmero: " + 
                getNumero() + "\nValor a pagar: " + calcular();
    }
}
