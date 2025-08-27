import java.io.Serializable;

public class Student extends Person implements Serialization{

private String major, classification;
private double gpa;

public void study(){
   System.out.println("Studying...");
}
public void takeTest(){
   System.out.println("Testing...");
}
public Student(String major, String classification, double gpa, String first, String last){
   super(first, last);
   this.major = major;
   this.classification = classification;
   this.gpa = gpa;
}
@Override
public void cry(){
   System.out.println("All crying together...");
}

@Override
public String toString(){
   return super.toString() + " and I'm a " + classification + " " + major + " major ";
}
}