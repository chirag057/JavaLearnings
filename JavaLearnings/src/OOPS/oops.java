package OOPS;

class  Student  // class
{
    int age;
    String name; // objects

    public void printInfo(int age)
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }

//    Student(String name , int age) // This is a constructor
//    {
//          this.name= name;
//          this.age=age;
//    }
    // copy constructors they are to be created in java they copy value from one and add in another
     Student(Student s2){
        this.name=s2.name;
        this.age= s2.age;

     }
     Student(){}
}

public class oops {
    public static void main(String[] args)
    {
//        System.out.println("Hello");
//        Student s1 = new Student("Chirag",22);
//        s1.age=24;
//        s1.name="Chirag";

        Student s1 = new Student(); // this will throw and error so empty constructor should be created
        s1.age=24;
        s1.name="Raghu";
        s1.printInfo(s1.age);

        Student s2 = new Student(s1);  // Copy Constructors
        s2.printInfo(s1.age);

    }
}


