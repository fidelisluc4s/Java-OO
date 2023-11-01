import java.util.ArrayList;


public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    
    public Condominio(){
        this("","");      
    }
    
    public Condominio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        despesas = new ArrayList<>();
    }
    
    public double valorCondominio(int mesAno){
        return 0;
    }
    
    public void pagarCondominio(Imovel imovel, int mesAno){
        
    }
    
    public String relatorio(){
        return "";
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    
}
