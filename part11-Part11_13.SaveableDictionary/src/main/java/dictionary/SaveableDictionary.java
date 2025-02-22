package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    
    public boolean load(){
        try {
            Files.lines(Paths.get(this.file))
                            .map(line -> line.split(":"))
                            .forEach(parts -> this.dictionary.put(parts[0], parts[1]));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(new File(file))){
            this.dictionary.keySet()
                            .stream()
                            .forEach(traduction -> writer.println(traduction + ":" + dictionary.get(traduction)));
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        final String[]  traduction = {null};
        if(this.dictionary.containsKey(word)){
            traduction[0] = this.dictionary.get(word);
        }else{
            this.dictionary.forEach((key, element) -> {
                if(word.equals(element)){
                    traduction[0] = key;
                }
            });
        }
        return traduction[0];
    }
    
    public void delete(String word){
        if(this.dictionary.containsKey(word))
            this.dictionary.remove(word);
        else
            this.dictionary.remove(this.translate(word));
    }
}
