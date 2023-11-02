

public class Apartamento extends Imovel
{
    private int numeroQuartos;
    
    public Apartamento(){
        super(0,0,"");
    }
    
    public Apartamento(int numero, int metro, String proprietario,
    int numeroQuartos){
        super(numero,metro,proprietario);
        this.numeroQuartos = numeroQuartos;
        this.numeroQuartos = 10;
    }
    
    @Override
    public double valorVenal(){
        return (metrosQuadrados * 1000) + (500 * numeroQuartos);
        // return super.valorVenal() + (500 * numeroQuartos);
    }
    
    public void setNumeroQuartos(int numeroQuartos){
        this.numeroQuartos = numeroQuartos;
    }
    public int getNumeroQuartos(){
        return numeroQuartos;
    }
    
}
