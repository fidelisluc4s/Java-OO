
public class Aluno {
    // atributos
    String nome;
    double nota;

    // método Construtor
    public Aluno(String nomeAluno, double notaAluno) {
        nome = nomeAluno;
        nota = notaAluno;
    }

    public Aluno(String nomeAluno) {
        nome = nomeAluno;
        nota = 0;
    }

    // método
    public boolean estaAprovado() {
        return (nota >= 7);
    }

    // Método de Acesso get(consultar) set(receber)
    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.equals("")) {
            nome = novoNome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNota(double novaNota) {
        if (novaNota >= 0 && novaNota <= 10) {
            nota = novaNota;
        }
    }

    public double getNota() {
        return nota;
    }

}