abstract class Employee{
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void work();
    abstract void salary();


}
class manager extends Employee{
    String department;

    manager(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    @Override
    void work(){
        System.out.println("Manager is working");
    }
    @Override
    void salary(){
        System.out.println("Manager's salary is 10000");
    }
 }
 public class Min{
        public static void main(String[] args){
            manager m = new manager("John", 30, "HR");
            m.work();
            m.salary();
        }
 }
    