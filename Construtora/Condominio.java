import java.util.ArrayList;




public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Pagamento> pagamento;
    
    
    public Condominio(){
        this("","");      
    }
    
    public Condominio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        despesas = new ArrayList<>();
        imoveis = new ArrayList<>();
        pagamento = new ArrayList<>();
    }
    
    public double valorCondominio(int mesAno){
        double total = 0;
        for(Despesa d : despesas){
            if(d.getMesAno() == mesAno){
                total += d.getValor();
            }
        }
        return total/imoveis.size();
    }
    
   public void pagarCondominio(Imovel imovel, int mesAno){
         
        Pagamento p = new Pagamento(mesAno, valorCondominio(mesAno), imovel, this );
        
        /*Pagamento p = new Pagamento();
        p.setMesAno( mesAno );
        p.setValor( valorCondominio (mesAno) );
        p.setImovel( imovel );
        p.setCondominio( this );*/
        
    }
    
    private int totalPago(int mesAno){
        int totPago = 0;
        for(Pagamento p : pagamento){
            if (p.getMesAno() == mesAno){
                //totPago += ;
            }
            
        }
        return totPago;
    }
    
    public String relatorio(){
        int mes = 12023;
        String resultado = "";       
        
        
        resultado += "Mes : "+mes+" - 2023";
        int totPago = totalPago( Integer.parseInt( mes+"2023" ) );
        double vc = valorCondominio(Integer.parseInt( mes+ "2023" ));
        
        resultado += imoveis.size()+" apartamentos ( "+totPago+" pagos - "+(imoveis.size()-totPago)+
        " nao pagos )";        
        resultado += " Valor arrecadado : R$ "+(totPago*vc) +" R$ "+((imoveis.size() - totPago) * vc);
        
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
        this.imoveis.add( imoveis );
    }
    
    public ArrayList<Imovel> getImoveis(){
        return imoveis;
    }
    
    public void addPagamento(Pagamento paga){
        this.pagamento.add( paga );
    }
    
    public ArrayList<Pagamento> getPagamento(){
        return pagamento;
    }
}
