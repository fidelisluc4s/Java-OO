import java.util.Scanner;
import java.util.ArrayList;
public class Principal
{
    public static void main(String args[]){
        Scanner le = new Scanner(System.in);
        TipoTriangulo triangulo = new TipoTriangulo();
        
        System.out.println("Informe o ladoA do triangulo");
        triangulo.setLadoA(le.nextDouble());
        System.out.println("Informe o ladoB do triangulo");
        triangulo.setLadoB(le.nextDouble());
        System.out.println("Informe o ladoC do triangulo");
        triangulo.setLadoC(le.nextDouble());
        
        triangulo.tipoTri();
        
        String tipoTri = triangulo.tipoTri();
        
        System.out.println("O triângulo é " +tipoTri);
        
        
        
        
    }
}
