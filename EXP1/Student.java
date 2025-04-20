package JavaExperiments;
class Student {
   
    private String name;
    private int age;
    private String department;

   
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
    }

    
    public void setAge(int age) {
        this.age = age;
    }
}

public class exp1main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("AcLovin", 25, "Mechanical Engg.");

       
        student1.displayDetails();
        student2.displayDetails();

      
        student1.setAge(21);
        System.out.println("\nAfter updating age:");
        student1.displayDetails();
    }
}
