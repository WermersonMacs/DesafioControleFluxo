# Desafio: Controle de Fluxo - Contagem com Validação

Este projeto tem como objetivo praticar a lógica de controle de fluxo, utilizando a estrutura `for`, além de implementar uma exceção personalizada em Java. O sistema recebe dois parâmetros inteiros via terminal e imprime uma contagem entre o primeiro e o segundo número, com a validação de que o segundo número deve ser maior que o primeiro.

## Funcionalidade

1. O programa solicita ao usuário dois números inteiros.
2. O sistema valida se o segundo número é maior que o primeiro.
3. Se o segundo número for maior, o programa faz uma contagem entre o primeiro e o segundo número e imprime a mensagem: `Imprimindo o número X`.
4. Caso o primeiro número seja maior que o segundo, o sistema lança a exceção personalizada `ParametrosInvalidosException` com a mensagem de erro: "O segundo parâmetro deve ser maior que o primeiro".

## Exceção Personalizada

A classe `ParametrosInvalidosException` é uma exceção personalizada que é lançada quando a validação dos parâmetros falha. A exceção é usada para fornecer uma mensagem clara sobre o erro ocorrido.

### Exemplo de uso da exceção:
- **Entrada inválida**: O primeiro número é maior que o segundo.
- **Mensagem de erro**: "Erro: O segundo parâmetro deve ser maior que o primeiro."

## Como Executar

1. Clone este repositório para sua máquina local:

    ```bash
    git clone https://github.com/WermersonMacs/DesafioControleFluxo
    ```

2. Abra o projeto na sua IDE preferida (por exemplo, IntelliJ IDEA).

3. Compile e execute o código.

4. O programa pedirá para você inserir dois números inteiros no terminal. O programa validará os números e, se a validação passar, imprimirá a contagem. Caso contrário, a exceção será lançada.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal para o desenvolvimento deste projeto.
- **Git**: Sistema de controle de versão utilizado para gerenciar o código-fonte.
- **IntelliJ IDEA**: IDE recomendada para o desenvolvimento do projeto.

## Contribuições

Se desejar contribuir com melhorias ou sugestões, fique à vontade para abrir um pull request!

---

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
