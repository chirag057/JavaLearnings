package OOPS;

// Inherit class properties from one to another
// Increases re-use ability
// 4 Types --> Single level , multi level , hierarchical , Hybrid
// Multiple inheritance not done


class Shape {  // Base class / Parent class
  public  void area()
  {
      System.out.println("Displays area");
  }

}

class Triangle extends Shape{  // Single level
    public  void area(int l , int h)
    {
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{  // Multilevel
    public  void area(int l , int h)
    {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{   //  hierarchical
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}





public class inheritance {
    public static void main(String[] args) {


    }
}
