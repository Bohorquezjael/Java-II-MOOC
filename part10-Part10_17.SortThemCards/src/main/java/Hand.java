import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public List<Card> getCards(){
        return this.cards;
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
    
    public void print(){
        this.cards.forEach(System.out::println);
    }
    
    public void sortBySuit(){
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.cards.stream().mapToInt(card -> card.getValue()).sum() - hand.getCards().stream().mapToInt(card -> card.getValue()).sum();
    }
}
