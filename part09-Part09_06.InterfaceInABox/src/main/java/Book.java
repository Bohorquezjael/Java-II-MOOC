public class Book implements Packable {

    private double weight;
    private String name;
    private String author;
    
    public Book(String author, String name, double weigth){
        this.author = author;
        this.name = name;
        this.weight = weigth;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
    
    
}
