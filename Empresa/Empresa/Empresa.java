
import java.util.ArrayList;
public class Empresa
{
    private String nome;
    private ArrayList<Funcionario> funcionarios;//lista 

    //Construtor
    public Empresa(String nome){
        this.nome = nome;
        funcionarios = new ArrayList<>(); //lista
    }

    //Métodos
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public double folhaPagamento(){
        double salTotal = 0;
        for(int i = 0; i<= funcionarios.size(); i++){
            Funcionario f = funcionarios.get(i);
            salTotal += f.salarioLiquido();
        }
        return salTotal;
    }

    public void addFuncionario(Funcionario func){
        this.funcionarios.add( func );
    }

    public void removeFuncionario(int idx){
        if(idx >= 0 && idx < funcionarios.size()){
            this.funcionarios.remove( idx );
        }
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
}
