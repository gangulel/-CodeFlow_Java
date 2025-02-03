class student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Main{
    public static void main(String[] args){
        student s = new student();
        s.setName("John");
        System.out.println(s.getName());
    }
}