import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Cartesiano cartesiano = new Cartesiano();
        Scanner le = new Scanner(System.in);

        System.out.println("Informe o XA: ");
        double pontoXA = le.nextDouble();
        cartesiano.setPontoXA(pontoXA);

        System.out.println("Informe o YA: ");
        double pontoYA = le.nextDouble();
        cartesiano.setPontoYA(pontoYA);

        System.out.println("Informe o XB: ");
        double pontoXB = le.nextDouble();
        cartesiano.setPontoXB(pontoXB);

        System.out.println("Informe o YB: ");
        double pontoYB = le.nextDouble();
        cartesiano.setPontoYB(pontoYB);

        
    }
}
