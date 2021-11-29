

class triangle{
    int h,w;
    void setHW(int hight,int wide){
        h=hight;
        w=wide;
    }
    void getHW(){
        float area=(w*h)/2;
        System.out.println("Area ="+area);
    }
}



public class lab3prc2 {
    public static void main(String[] args) {
        triangle myTriangle=new triangle();
        myTriangle.setHW(10, 20);
        myTriangle.getHW();
    }
}
