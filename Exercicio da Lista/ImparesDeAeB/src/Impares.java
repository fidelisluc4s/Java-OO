import java.util.ArrayList;

public class Impares{

    private int numeroA, numeroB;
    private ArrayList<Integer> numerosImpares = new ArrayList<>();

    public Impares(){       

    }

    public void setNumeroA(int numeroA){
        this.numeroA = numeroA;
    }

    public int getNumeroA(){
        return numeroA;
    }

    public void setNumeroB(int numeroB){
        this.numeroB = numeroB;
    }

    public int getNumeroB(){
        return numeroB;
    } 

    public ArrayList<Integer> getNumerosImpares() {
        return numerosImpares;
    }

    public void addImpares(int num){
        numerosImpares.add( num );
    }

    
    public void obterNumerosImpares() {
        if (numeroA > numeroB) {
            for (int i = numeroB; i <= numeroA; i++) {
                if (i % 2 != 0) {
                    numerosImpares.add(i);
                }
            }
        } else if (numeroB > numeroA) {
            for (int i = numeroA; i <= numeroB; i++) {
                if (i % 2 != 0) {
                    numerosImpares.add(i);
                }
            }
        }
    }
}