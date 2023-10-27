import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){

        Scanner le = new Scanner(System.in);
        
        Empresa emp = new Empresa("");

        Funcionario func = new Funcionario();
        
        emp.addFuncionario(func);
        func = null;
        
        emp.getFuncionarios().get(0).setNome("adgw");

        System.out.println("Informe seu nome: ");
        func.setNome( le.nextLine() );
    }
}
