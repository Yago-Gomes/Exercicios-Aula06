import java.util.Scanner;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 09/03/21 08:19 PM
 * @category View
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Livro livro = new Livro();

        System.out.println("Nome do cliente:");
        cliente.setNomeCliente(scanner.nextLine());

        System.out.println("CPF do cliente:");
        cliente.setCpfCliente(scanner.nextLine());

        System.out.println("Email do cliente:");
        cliente.setEmailCliente(scanner.nextLine());

        System.out.println("Idade do cliente");
        cliente.setIdadeCliente(Integer.parseInt(scanner.nextLine()));

        System.out.println("Nome do livro:");
        livro.setNomeLivro(scanner.nextLine());

        System.out.println("Autor do livro:");
        livro.setNomeAutor(scanner.nextLine());

        System.out.println("Ano lancamento:");
        livro.setAnoLancamento(scanner.nextInt());

        System.out.println("Preco do livro:");
        livro.setPreco(scanner.nextDouble());

        System.out.println(cliente);

        System.out.println(livro);
    }
}
