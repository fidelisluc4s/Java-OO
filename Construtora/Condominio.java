import java.util.ArrayList;


public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imovel;
    private ArrayList<Pagamento> pagamento;
    
    
    public Condominio(){
        this("","");      
    }
    
    public Condominio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        despesas = new ArrayList<>();
        imovel = new ArrayList<>();
        pagamento = new ArrayList<>();
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
    
    public void addDespesa(Despesa deps){
        this.despesas.add( deps );
    }
    
    public ArrayList<Despesa> getDespesas(){
        return despesas;
    }
    public void addImovel(Imovel imoveis){
        this.imovel.add( imoveis );
    }
    
    public ArrayList<Imovel> getImoveis(){
        return imovel;
    }
    
    public void addPagamento(Pagamento paga){
        this.pagamento.add( paga );
    }
    
    public ArrayList<Pagamento> getPagamento(){
        return pagamento;
    }
}
