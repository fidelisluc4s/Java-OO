import java.util.ArrayList;

public class TipoTriangulo
{
    private double ladoA, ladoB, ladoC;
    private double isosceles, equilatero, escaleno;
    private ArrayList<Integer> triList = new ArrayList<>();
    
    public void TipoTriangulo(){ 
        ArrayList<Integer> triList = new ArrayList<>();
    }

    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }

    public double getLadoA(){
        return ladoA;
    }

    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }

    public double getLadoB(){
        return ladoB;
    }

    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }

    public double getLadoC(){
        return ladoC;
    }

    public void setIsosceles(double isosceles){
        this.isosceles = isosceles;
    }

    public double getIsosceles(){
        return isosceles;
    }

    public void setEquilatero(double equilatero){
        this.equilatero = equilatero;
    }

    public double getEquilatero(){
        return equilatero;
    }

    public void setEscaleno(double escaleno){
        this.escaleno = escaleno;
    }

    public double getEscaleno(){
        return escaleno;
    }
    
    public ArrayList<Integer> getTriList() {
        return triList;
    }
    
    public void addTri(double tri){
        triList.add( triList );
    }

    public void tipoTri(double ladoA, double ladoB,double ladoC){
        if(ladoA == ladoB && ladoB == ladoC){
            triList.add(tri);
        }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            triList.add(tri);
        }else{
            triList.add(tri);
        }

    }
}
