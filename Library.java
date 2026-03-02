import java.util.ArrayList;

public class Library {
    
    ArrayList<Book> collection = new ArrayList<>();

    public void addBook(Book book){
        collection.add(book);
        System.out.println("Livro: " +book.title+ " adicionado ao acervo");
    }

    public void listBooks(){
        if (collection.isEmpty()) {
            System.out.println("Lista está vazia");
            return;
        }

        System.out.println("\n=== ACERVO ===\n");

        for (int i = 0; i < collection.size(); i++) {
            System.out.println("[ " + i +" ]";);
            collection.get(i).InfoShow();
        
        }

    }

    public void returnBook(int index){
        if (index < 0 || index >= collection.size()) {
            System.out.println("Escolha inválida");
            return;
        }
        collection.get(index).toLoan();

    }

    public class 

}
