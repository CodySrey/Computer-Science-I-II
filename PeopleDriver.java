public class PeopleDriver{
   public static void main(String[] args){
   Person p = new Person("Bob", "Person");
   Student s = new Student("CS", "Freshman", 2.83, "Jill", "Myers");
   
   System.out.println(p);
   System.out.println(s);
   
   s.cry();
   
   Person somePerson = new Student("CS", "Sophmore", 3.12, "Bob", "Smith");
   System.out.println(somePerson);
   somePerson.talk();
   
   Person[] people = new Person[3];
   people[0] = new Person("Bob", "Jones");
   people[1] = new Student("Biology", "Senior", 2.22, "Jill", "Morgan");
   people[2] = new Student("Underwater", "Freshman", 4.0, "Aye", "Lmao");
   
   for(int i = 0; i < people.length; i++){
      System.out.println(i);
      people[i].cry();
   }
   }
}