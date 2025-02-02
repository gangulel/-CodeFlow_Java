class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class Manager extends Employee{
    String depatment;

    Manager(String name,int salary,String depatment){
        super(name,salary);
        this.depatment=depatment;
    }
}
class Manager_level2 extends Manager{
    String level;

    Manager_level2(String name,int salary,String depatment,String level){
        super(name,salary,depatment);
        this.level=level;
    }
}
public class Main {
    public static void main(String[] args){
        Employee e1=new Employee("john",5000);
        Manager m1=new Manager("jane",6000,"HR");
        Manager_level2 m2=new Manager_level2("james",7000,"IT","Senior");
        System.out.println(m2.level);
    }
}