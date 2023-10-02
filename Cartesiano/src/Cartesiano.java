
public class Cartesiano
{
    private double distanciaAeB;
    private double pontoXA, pontoXB, pontoYA, pontoYB;
    
    //Construtor
    public Cartesiano(){        
    }    
    public double getPontoXA(double pontoXA){
        return pontoXA;
    }

    public void setPontoXA(double pontoXA){
        this.pontoXA = pontoXA;
    }
    
    
     public void setPontoXB(double pontoXB){
        this.pontoXB = pontoXB;
    }
    
    public void setPontoYA(double pontoYA){
        this.pontoYA = pontoYA;
    }
    
    public void setPontoYB(double pontoYB){
        this.pontoYB = pontoYB;
    }
    
    public double calculandoDistanciaAeB(double pontoXA,double pontoXB,
    double pontoYA, double pontoYB){
        return distanciaAeB =  Math.pow((pontoXB - pontoXA), 2) 
        + Math.pow((pontoYB - pontoYA), 2);
    }
}
