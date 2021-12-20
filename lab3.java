import javax.management.relation.RoleResult;

class student{
    int s_Id;
    String S_name;
    void setIdandName(int id,String name){
        s_Id=id;
        S_name=name;
    }
    void getdisplay(){
        System.out.println(s_Id+" "+S_name);
    }
}
public class lab3{
    public static void main(String[] args) {
        student s=new student();
        s.S_name="Eftakhar Jaman";
        s.s_Id=191400038;
        System.out.println("Id = "+s.s_Id+" \n Name = "+s.S_name);

        student s1=new student();
        s1.setIdandName(191400038, "Eftakhar Jaman");
        s1.getdisplay();
    }
}