import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
            
        Impares impares = new Impares();

        System.out.print("Digite o valor de A: ");        
        impares.setNumeroA(le.nextInt());

        System.out.print("Digite o valor de B: ");
        impares.setNumeroB(le.nextInt());

        impares.obterNumerosImpares();       
        
        ArrayList<Integer> numerosImpares = impares.getNumerosImpares();
        
        System.out.println("Números ímpares entre A e B :");
        for (int numero : numerosImpares) {
            System.out.print(" "+numero);
        }
    }
}
