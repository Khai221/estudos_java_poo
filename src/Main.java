public class Main {
    public static void main(String[] args) {
        // Você pode criar instâncias da classe Aluno aqui
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.curso = "Ciência da Computação";
        aluno1.idade = 20;

        // Chamar métodos da classe Aluno
        aluno1.assistirAula();
        aluno1.fazerProva();
        aluno1.calcularNota();
    }

    // Classe Aluno
    public static class Aluno {
        // Atributos da classe Aluno
        String nome;
        String curso;
        int idade;

        // Métodos
        void assistirAula() {
            // Definição do método
        }

        void fazerProva() {
            // Definição do método
        }

        void calcularNota() {
            // Definição do método
        }
    }
}