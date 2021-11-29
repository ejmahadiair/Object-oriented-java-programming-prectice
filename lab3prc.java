

class car{
    String b_name,clr;
    float f_capacity;
    void setCarDetails(String brand_name,String color,float fulecapacity){
         b_name=brand_name;
         clr=color;
         f_capacity=fulecapacity;
    }
    void getCarData(){
        System.out.println(b_name+"\n"+clr+"\n"+f_capacity);
    }
}

class calculateArea{
    float w,h;
    void setWandH(int wide,int hight){
        w=wide;
        h=hight;
    }
    void getarea(){
        float area=(w*h);
        System.out.println("Area = "+area);
    }
}



public class lab3prc {
    public static void main(String[] args) {
        car myCar=new car();
        myCar.setCarDetails("Tsla", "Silver", 0);
        myCar.getCarData();

        calculateArea clc=new calculateArea();
        clc.setWandH(5, 2);
        clc.getarea();

    }
}
