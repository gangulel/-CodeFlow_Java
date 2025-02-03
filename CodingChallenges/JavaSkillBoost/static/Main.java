class Student{
    String name;
    static String school="aloysius";
    int age;
    static int count=0;

    Student(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }

    void PrintInfor(){
        System.out.println(this.name);
        System.out.println(this.school);
        System.out.println(this.age);
    }
}
public class Main {
    public static void main(String[] args){
        Student s1=new Student("john",12);
        s1.PrintInfor();
        System.out.println(Student.count);
    }

}