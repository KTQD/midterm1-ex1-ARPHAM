public class Book extends Item{
        String author;
        int numberOfPages;
        String genre;
    Book (String name, String description, String iD, float price, String author, int numberOfPages,String genre) {
        super(name, description, iD, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
}
