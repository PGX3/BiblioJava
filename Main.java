import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Dom Casmurro", "Machado de Assis", 1899));
        library.addBook(new Book("O Cortiço", "Aluísio Azevedo", 1890));
        library.addBook(new Book("1984", "George Orwell", 1949));

        int option = -1;

    }

}
