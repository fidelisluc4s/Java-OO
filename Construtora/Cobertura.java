
public class Cobertura extends Imovel
{
    private boolean duplex, triplex;
    
    public Cobertura(){
        super(0,0,"");
    }
    
    public Cobertura(boolean duplex, boolean triplex){
        super(0,0,"");
        this.duplex = duplex;
        this.triplex = triplex;
    }
    
    @Override
    public double valorVenal(){
         return super.valorVenal() * (duplex?2:1) * (triplex?3:1);
    }
    
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
    public boolean getDuplex(){
        return duplex;
    }
    
    public void setTriplex(boolean triplex){
        this.triplex = triplex;
    }
    public boolean getTriplex(){
        return triplex;
    }
}
