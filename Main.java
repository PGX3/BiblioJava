import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Este arrayList só aceitará objetos do tipo Book <Book>
        ArrayList<Book> collection = new ArrayList<>();

        collection.add(new Book("Dom Casmurro", "Machado de Assis", 1899));
        collection.add(new Book("O cortiço", "Aluísio Azevedo", 1890));

        for (Book book : collection) {
            book.InfoShow();
        };

        System.out.println("=== OPERAÇÕES ===\n");
        collection.get(0).toLoan();// empresta Dom Casmurro
        collection.get(0).toLoan(); // tenta emprestar de novo
        collection.get(0).bookReturn();  // devolve Dom Casmurro
        collection.get(0).bookReturn();  // tenta devolver de novo

        System.out.println("\n=== ACERVO ATUALIZADO ===\n");
        for (Book book : collection) {
            book.InfoShow();
        }
    }

}
