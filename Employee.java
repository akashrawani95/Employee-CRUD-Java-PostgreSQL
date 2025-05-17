package Employee_CRUD;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String empClass;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmpClass() {
        return empClass;
    }

    public void setEmpClass(String empClass) {
        this.empClass = empClass;
    }
}
