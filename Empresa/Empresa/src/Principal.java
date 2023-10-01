import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){

        Scanner le = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Informe seu nome: ");
        func.setNome( le.nextLine() );
    }
}
