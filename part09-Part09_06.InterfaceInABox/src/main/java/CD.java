public class CD implements Packable {

    private int yearPublication;
    private String name;
    private String artist;
    private double weight;
    
    public CD(String artist, String name, int yearPublication){
        this.artist = artist;
        this.name = name;
        this.yearPublication = yearPublication;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.yearPublication + ")";
    }
    
    
}
