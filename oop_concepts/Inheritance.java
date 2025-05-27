package oop_concepts;

class Teacher {
    private String name;
    private String designation;
    private String universityName;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getSalary() {
        return salary;
    }

    void does() {
        System.out.println("Teacher");
    }
}

class Subject extends Teacher {
    String subject = "Discreate mathematics";

}

public class Inheritance {
    public static void main(String[] args) {

        Subject sub = new Subject();
        sub.setName("Md. Rafsan Jani");
        sub.setDesignation("Lecturer");
        sub.setUniversityName("SEU");
        sub.setSalary(300000);

        System.out.println("Name: " + sub.getName());
        System.out.println("Subject: " + sub.subject);
        System.out.println("Designation: " + sub.getDesignation());
        System.out.println("University Name: " + sub.getUniversityName());
        System.out.println("Salary: " + sub.getSalary());

    }
}
