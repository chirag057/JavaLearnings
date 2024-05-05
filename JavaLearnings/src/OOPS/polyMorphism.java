package OOPS;

//Polymorphism ---> Many Forms         same name , different factors

// 1) function Overloading 2) Function Overriding
//1) Compile Time 2) Run Time(Inheritance)

 class  Student1
{
    String name;
    int age;
     
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(int age, String name)
    {
        System.out.println(age + " " + name);
    }
    
}



public class polyMorphism {
    public static void main(String[] args)
    {
     Student1 s1 = new Student1();
     s1.name="Hire achy";
     s1.age =24;

     s1.printInfo(s1.age);
     s1.printInfo(s1.name);
     s1.printInfo(s1.age,s1.name);
     
    }
}
