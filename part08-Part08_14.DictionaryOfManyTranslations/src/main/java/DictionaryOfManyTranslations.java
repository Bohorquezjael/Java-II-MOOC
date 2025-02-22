import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> traduction = new HashMap<>();
    
    public void add(String word, String translation){
         this.traduction.putIfAbsent(word, new ArrayList<>());
         this.traduction.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.traduction.containsKey(word))
            return this.traduction.get(word);
        else
            return new ArrayList<String>();
    }
    
    public void remove(String word){
        this.traduction.remove(word);
    }
}
