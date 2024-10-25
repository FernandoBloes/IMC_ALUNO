package escola;

public class Pessoa {
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    // Construtor da classe Pessoa para inicializar os atributos
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos para acessar os atributos da pessoa
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}