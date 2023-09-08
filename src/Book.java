
public class Book {
    private String name, author, publisher, ownerOfBook;

    public Book(String name, String author, String publisher, String ownerOfBook){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.ownerOfBook = ownerOfBook;
    }
    private static class Sample extends Book{
        private int numberOfTypos, weight, cost;
        private Sample(String name, String author, String publisher, String ownerOfBook, int numberOfTypos, int weight, int cost){
            super(name, author, publisher, ownerOfBook);
            this.numberOfTypos = numberOfTypos;
            this.weight = weight;
            this.cost = cost;
        }
        public int getCost() {
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }
        public int getNumberOfTypos() {
            return numberOfTypos;
        }
        public void setNumberOfTypos(int numberOfTypos) {
            this.numberOfTypos = numberOfTypos;
        }
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public  String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getOwnerOfBook(){
        return ownerOfBook;
    }
    public void setOwnerOfBook(String ownerOfBook) {
        this.ownerOfBook = ownerOfBook;
    }
    public static void main(String[]args) {
        Sample Roman = new Sample("The Hounds of Baskerville", "Arthur Conan Doyle", " The Strand Magazine", "Loise", 21, 20, 2000);

        System.out.println("Название книги - " + Roman.getName());

        Roman.setName("Love in Hell");

        System.out.println("Новое название книги - " + Roman.getName());
    }
}

