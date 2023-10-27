
public class Funcionario
{
    //Atributos
    private String nome;
    private double salarioBase, totalVendas;
    private int numeroFilhos;
    private boolean usaValeTransporte, trabalhoNoite, ehVendedor;
    private Empresa empresa;

    //Relacionamento 
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public double inss(){
        return salarioBase * 0.87;
    }

    public double bonusFamilia(){
        if(numeroFilhos <= 3){
            return numeroFilhos * 50;
        }else{
            return 150;
        }
    }

    public double descontoValeTransporte(){
        if(usaValeTransporte){
            return salarioBase * 0.03;
        }else{
            return 0;
        }
    }

    public double recebeAdicionalNoturno(){
        if(ehVendedor){
            return totalVendas * 0.02;
        }
        return 0;
    }

    public double percentualVendas(){
        if(ehVendedor){
            return totalVendas * 0.02;
        }
        return 0;
    }
    //Coesão

    public double salarioLiquido(){                 
        double salario = salarioBase - inss() + bonusFamilia() -
            descontoValeTransporte() + recebeAdicionalNoturno() + 
            percentualVendas();

        return salario;
    }

    //Construtor
    public Funcionario(){
    }

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas(){
        return totalVendas;
    }

    public void setNumeroFilhos(int numeroFilhos){
        if(numeroFilhos >= 0){
            this.numeroFilhos = numeroFilhos;
        }
    }

    public int getNumeroFilhos(){
        return numeroFilhos;
    }

    public void setUsaValeTransporte(boolean usaValeTransporte){
        this.usaValeTransporte = usaValeTransporte;
    }

    public boolean getUsaValeTransporte(){
        return usaValeTransporte;
    }

    public void setTrabalhoNoite(boolean trabalhoNoite){
        this.trabalhoNoite = trabalhoNoite;
    }

    public boolean getTrabalhoNoite(){
        return trabalhoNoite;
    }

    public void setEhVendedor(boolean ehVendedor){
        this.ehVendedor = ehVendedor;
    }

    public boolean getEhVendedor(){
        return ehVendedor;
    }
}

