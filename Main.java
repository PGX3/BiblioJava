
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Dom Casmurro", "Machado de Assis", 1899));
        library.addBook(new Book("O Cortiço", "Aluísio Azevedo", 1890));
        library.addBook(new Book("1984", "George Orwell", 1949));

        int option = -1;

        while(option != 4){

            System.out.println("\n=== BIBLIOTECA ===");
            System.out.println("1. Listar livros");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            switch (option){
                case 1: 
                    library.listBooks();
                break;

                case 2:
                    library.listBooks();
                    System.out.print("Digite o número do livro: ");
                    int loanIndex = scanner.nextInt();
                    library.loanBook(loanIndex);
                break;
                case 3:
                    library.listBooks();
                    System.out.print("Digite o número do livro: ");
                    int returnIndex = scanner.nextInt();
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();

    }

}
