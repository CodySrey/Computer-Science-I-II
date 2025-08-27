public class Person{

private String first;
private String last;
private boolean isStressed;
private int creditScore;

public String getFirst(){ return first; }
public void setFirst(String first){ this.first = first;}

public void talk(){
   System.out.println("Hello");
}
public void cry(){
   System.out.println("Wah...");
}
public Person(String first, String last){
   this.first = first;
   this.last = last;
}
public String toString(){
   return "I'm " + first + " " + last;
}
}
