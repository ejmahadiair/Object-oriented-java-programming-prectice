import java.io.Console;
import java.util.Scanner;

class car{
    String brand;
    public car(){
        this.brand="ford";
    }
    public String getcarbrand(){
        return brand;
    }
}

class person{
    String name;
    public person(){
        this.name="Mahadi";
    }
    public String getPname(){
        return name;
    }
}

class calculator{
    int sum,sub,multiply,div;
    public calculator(int a,int b){
        this.sum=a+b;
        this.sub=a-b;
        this.multiply=a*b;
        this.div=a/b;
        System.out.println("Sum is = "+sum+"\nSub is = "+sub+"\nMultiply is = "+multiply+"\nDiv is = "+div);
    }
}

// construtor overloading 

class calculatearea{
    double area;
    
    // Rectangle area
    public calculatearea(int h,int w){
        this.area=h*w;
        System.out.println("Rectangle area is = "+area);
    }
    // Square area 
    public calculatearea(int n){        
        this.area=n*n;
        System.out.println("Square area  is = "+area);
    }
    
}


public class lab4{
    // Scanner sn= new Scanner(System.in);
    public static void main(String[] args) {
        car ford=new car();
        System.out.println(ford.getcarbrand());
        person p1=new person();
        
        System.out.println(p1.name);

        calculator clc=new calculator(10,2);

        // for area
        calculatearea recarea=new calculatearea(2,5);
        calculatearea sqrarea=new calculatearea(2);
        
    }
}