
public class Principal {
    public static void main(String args[]) {

        for (int i = 0; i <= 2; i++) {

            Aluno aluno;

            aluno = new Aluno("Zezin");

            System.out.println("Nome: " + aluno.getNome());

            aluno.setNota(4);

            if (aluno.estaAprovado()) {
                System.out.println(aluno.getNome() + " você está aprovado, Parabéns!");
            } else {
                System.out.println(aluno.getNome() + " você está reprovado, Estude mais!");
            }
        }
    }
}
