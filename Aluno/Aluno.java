

public class Aluno
{
    //atributos
    String nome;
    double nota;
    
    //método Construtor
    public Aluno(String nomeAluno, double notaAluno){
        nome = nomeAluno;
        nota = notaAluno;
    }
    
    //método
    public boolean estaAprovado(){        
        return (nota >= 7);       
    }
sad    
}