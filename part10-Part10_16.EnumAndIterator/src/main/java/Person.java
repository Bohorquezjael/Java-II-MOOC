public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education ed){
        this.name = name;
        this.education = ed;
    }
    
    public Education getEducation(){
        return this.education;
    }
    
    public String toString(){
        return this.name + ", " + this.education;
    }
}
