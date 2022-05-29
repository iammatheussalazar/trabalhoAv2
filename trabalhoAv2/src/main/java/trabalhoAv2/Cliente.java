package trabalhoAv2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    private List<LinhaTelefonica> listaLinhaTelefonica = new ArrayList();
    
    public void setListaLinhaTelefonica(List<LinhaTelefonica> listaLinhaTelefonica){
        this.listaLinhaTelefonica = listaLinhaTelefonica;
    }
    
    public List<LinhaTelefonica> getListaLinhaTelefonica(){
        return listaLinhaTelefonica;
    }
    
    public void adicionarLinhaTelefonica(LinhaTelefonica numero){
        listaLinhaTelefonica.add(numero);
    }
    
    public void removerLinhaTelefonica(LinhaTelefonica numero){
        listaLinhaTelefonica.remove(numero);
    }
    
    @Override
     public String toString() {
         String txt = "------------- Cliente -------------" + "\nNome: " + this.nome +
                 "\nEndereço: " + this.endereco;
         
         for(LinhaTelefonica telefone : listaLinhaTelefonica){
             txt = txt + telefone;
         }
             
         return txt;
     }
}
