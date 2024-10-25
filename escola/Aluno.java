package escola;

public class Aluno extends Pessoa {
    private double nota;
    private double percentualPresenca;

    // Construtor da classe Aluno que usa atributos de Pessoa e seus próprios
    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura); // Chama o construtor da classe mãe (Pessoa)
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // Métodos para acessar a nota e a presença do aluno
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }
}