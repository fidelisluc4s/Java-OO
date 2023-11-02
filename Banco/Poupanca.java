


public class Poupanca extends Conta
{
    //private double limitePoupanca;
    
    
    public void rendimento(double taxaJuros){
       if(taxaJuros >= 0 && taxaJuros <= 1) 
        //saldo *= (1+taxaJuros);
        depositar(saldo * (taxaJuros) );
    }
    
    /*public double getlimitePoupanca(){
        return limitePoupanca;
    }
    
    public void setlimitePoupanca(double limitePoupanca){
        this.limitePoupanca = limitePoupanca;
    }*/
    
    
}