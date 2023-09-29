public class App {
    public static void main(String[] args) {
        // Criando um objeto da classe Aluno
        Aluno aluno1 = new Aluno("João", 8.5);

        // Chamando o método estaAprovado() do objeto aluno1
        boolean aprovado = aluno1.estaAprovado();

        // Exibindo o resultado
        if (aprovado) {
            System.out.println(aluno1.nome + " está aprovado!");
        } else {
            System.out.println(aluno1.nome + " está reprovado!");
        }
    }
}
