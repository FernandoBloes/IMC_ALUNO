package escola;

public class Principal {
    public static void main(String[] args) {
        // Criação de objetos Pessoa e Aluno
        Pessoa pessoa = new Pessoa("Marcos", "12345678901", 85.0, 1.80); // Pessoa criada com nome, cpf, peso e altura
        Aluno aluno = new Aluno("Julia", "09876543212", 55.0, 1.65, 8.0, 90); // Aluno com atributos de Pessoa e nota e
                                                                              // presença

        // Testa a validade do CPF das duas pessoas
        System.out.println("CPF de Marcos é válido? " + FuncoesUteis.verificarCpf(pessoa.getCpf()));
        System.out.println("CPF de Julia é válido? " + FuncoesUteis.verificarCpf(aluno.getCpf()));

        // Calcula o IMC das duas pessoas
        double imcPessoa = FuncoesUteis.calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        double imcAluno = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC de Marcos: " + imcPessoa);
        System.out.println("IMC de Julia: " + imcAluno);

        // Avalia se o aluno foi aprovado ou reprovado
        String resultado = FuncoesUteis.avaliarAluno(aluno);
        System.out.println("Julia está: " + resultado);
    }
}