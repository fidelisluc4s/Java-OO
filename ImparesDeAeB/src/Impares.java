import java.util.ArrayList;

public class Impares{


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
<<<<<<< HEAD
    } 

    public ArrayList<Integer> getNumerosImpares() {
        return numerosImpares;
    }
=======
    }    
>>>>>>> b98e4b5c93ebf15813c61ce84943e0dcf0ba0162

    public void addImpares(int num){
        numerosImpares.add( num );
    }

<<<<<<< HEAD
    
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
=======
    public void obterNumerosImpares(){

        if(numeroA  > numeroB){
            for(int i = numeroA; i <= numeroB; i++){
            if(i % 2 != 0){
                numerosImpares.add(i);
            }
        }
        }else if(numeroB > numeroA){
            for(int i = numeroB; i <= numeroA; i++){
            if(i % 2 != 0){
                numerosImpares.add(i);
            }
        }else
            break;           
    }
    
    }
}
>>>>>>> b98e4b5c93ebf15813c61ce84943e0dcf0ba0162
