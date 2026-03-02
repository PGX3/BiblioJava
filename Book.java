public class Book {

    String title;
    String author; 
    int year; 
    boolean available;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }


    public void InfoShow() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Ano: " + year);
        System.out.println("Disponível: " + (available ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }

    public void toLoan(){
        if (available) {
            available = false;
            System.out.println("Livro: " +title+ " foi emprestado com sucesso");
        }else{
            System.out.println("Livro: " +title+ " não está disponível");
        }
    }

    public void bookReturn(){
        if (!available) {
            available = true;
            System.out.println("Livro: " +title+ " foi devolvido com sucesso");

        }else{
            System.out.println("Livro: " +title+ " já está disponível");
        }
    }
}
