import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int value =  c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if(value == 0){
            return c1.compareTo(c2);
        }
        return value;
    }
}