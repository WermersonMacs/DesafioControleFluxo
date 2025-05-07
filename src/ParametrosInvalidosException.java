public class ParametrosInvalidosException extends Exception {
    // Construtor da classe, que chama o construtor da classe Exception
    // com uma mensagem de erro específica
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro"); // Passa a mensagem de erro para a classe pai (Exception)
    }
}
