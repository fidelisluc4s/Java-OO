import java.util.ArrayList;
public class RH
{
    private String nome;
    private ArrayList<Funcionario> empregados;
    private ArrayList<Motorista> motorista;
    
    public double totalSindicato(){
        double total = 0;
        for(Funcionario f : empregados){
            if(f instanceof iSindicato){
                total += ((iSindicato)f).contribuicaoSindical();
            }
        }
        return total;
    }

    public RH(){

    }
    public RH(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    

    

}
