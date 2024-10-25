package escola;

public class FuncoesUteis {

    // Método que verifica se o CPF tem exatamente 11 dígitos
    public static boolean verificarCpf(String cpf) {
        return cpf != null && cpf.length() == 11; // CPF é válido se tiver 11 caracteres
    }

    // Método para calcular o IMC (peso dividido pela altura ao quadrado)
    public static double calcularIMC(double peso, double altura) {
        if (altura > 0) {
            return peso / (altura * altura); // Cálculo do IMC
        } else {
            return 0.0; // Retorna 0 se a altura for inválida
        }
    }

    // Avalia o aluno com base em sua nota e frequência
    public static String avaliarAluno(Aluno aluno) {
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado"; // Aprovado se >= 5 e presença >= 75%
        } else {
            return "Reprovado"; // Reprovado caso contrário
        }
    }
}