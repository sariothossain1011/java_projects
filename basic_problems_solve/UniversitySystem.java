
abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void performRole();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println("Attending classes and submitting assignments.");
    }
}

class Teacher extends Person {
    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println("Teaching classes and evaluating students.");
    }
}

class Admin extends Person {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println("Managing schedules and maintaining records.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Student("Raihan", 101);
        people[1] = new Teacher("Farzana", 202);
        people[2] = new Admin("Mahfuz", 303);

        for (Person p : people) {
            p.displayInfo();
            p.performRole();  // Polymorphism: different behavior for each subclass
            System.out.println();
        }
    }
}
