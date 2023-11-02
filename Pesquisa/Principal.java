import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){
        Scanner le = new Scanner(System.in);
        
        System.out.println("## Data de Pesquisa: ");
        Pesquisa pesq = new Pesquisa( le.nextLine() );
        
        while (true){
            Entrevistado e = new Entrevistado();
            System.out.println("## idade : ");
            e.setIdade(le.nextInt() );
            System.out.println("## altura : ");
            e.setAltura(le.nextDouble() );
            System.out.println("## Sexo (M/F): ");
            e.setSexo(le.next().toUpperCase().charAt(0) );
            System.out.println("## Cor dos Olhos (1 - VERDE | 2 - CASTANHO | 3 - AZUL): ");
            //e.setCorOlhos(le.next().toUpperCase() );
            int esc = le.nextInt();
            if(esc == 1) {e.setCorOlhos("VERDE") ; } else
            if (esc == 2) { e.setCorOlhos("CASTANHO");} else
            {e.setCorOlhos("AZUL");}
            
            System.out.println("## Cor dos Cabelos (1 - LOIRO, | 2 - CASTANHO | 3 - PRETO): ");
            //e.setCorOlhos(le.next().toUpperCase() );
            esc = le.nextInt();
            if(esc == 1) {e.setcorCabelos( ETipoCorCabelo.LOIRO ) ; } else
            if (esc == 2) { e.setcorCabelos( ETipoCorCabelo.CASTANHO);} else
            {e.setcorCabelos(ETipoCorCabelo.PRETO);}
            
            pesq.AdicionaEntrevistado ( e );
            System.out.print("### Deseja Sair? (S | N)");
            if (le.next().equalsIgnoreCase("S")){
                break;
            }            
        }
        
        System.out.print("####### RESULTADOS #######");
        System.out.print("# a) mais alto: " +pesq.getEntrevistadoMaiorAltura().getAltura() );
        System.out.print("# a) mais baixo: " +pesq.getEntrevistadoMenorAltura().getAltura() );
        System.out.print("# b) Hoemn mais Velho: " +pesq.getHomenMaisVelho().getIdade() );
        System.out.print("# b) Mulher mais Velha: " +pesq.getMulherMaisVelha().getIdade() );
        System.out.print("# c) Media de altura das Mulheres: " +pesq.getMediaAlturaMulheres() );
        System.out.print("# d) numero de Homens: " +pesq.getQuantidadeHomens() );
        System.out.print("# e) % de homens: " +pesq.getQuantidadeHomens() );
        System.out.print("# e) % de mulheres: " +pesq.getPercentualHomens() );
        System.out.print("# e) % de homens: " +pesq.getPercentualMulheres() );
        System.out.print("# f) Feminino de 18 ate 35 anos olhos verdes e loiras: " +pesq.getPercentualPerfil() );
        
    }
}







