public class Book {
    private String title;
    private int ageRecomendation;
    
    public Book(String bookTitle, int ageGroup) {
        this.title = bookTitle;
        this.ageRecomendation = ageGroup;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.ageRecomendation;
    }
    
    @Override
    public String toString() {
        return (title + " (recommended for " + ageRecomendation + " year-olds or older)");
    }
}