

public class Principal {   

    public static void main(String[] args) {
        // criando um objeto Aluno
        Aluno aluno1 = new Aluno("João", 8.5);

        // chamando o método estaAprovado
        boolean aprovado = aluno1.estaAprovado();

        // exibindo o resultado
        if (aprovado) {
            System.out.println(aluno1.nome + " está aprovado!");
        } else {
            System.out.println(aluno1.nome + " está reprovado!");
        }
    }
}