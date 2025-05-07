import java.util.Scanner; // Importa a classe Scanner para ler dados digitados pelo usuário

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in); // Cria um Scanner chamado "terminal" para ler entradas do teclado

        System.out.println("Digite o primeiro parâmetro:"); // Pede ao usuário o primeiro número
        int parametroUm = terminal.nextInt(); // Lê o primeiro número digitado

        System.out.println("Digite o segundo parâmetro:"); // Pede ao usuário o segundo número
        int parametroDois = terminal.nextInt(); // Lê o segundo número digitado

        try {
            // Tenta executar o metodo contar com os dois parâmetros
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception){
            // Caso a exceção personalizada seja lançada, imprime a mensagem de erro
            System.out.println("Erro: "+ exception.getMessage());
        }

        terminal.close(); // Fecha o Scanner para liberar o recurso
    }

    // Metodo que realiza a contagem entre dois números
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // Valida se parametroDois é menor ou igual ao parametroUm e lança a exceção personalizada se for
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }

        // Calcula quantos números devem ser impressos
        int contagem = parametroDois - parametroUm;

        // Faz a contagem e imprime os números de 1 até o valor da contagem
        for (int i = 1; i<=contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
