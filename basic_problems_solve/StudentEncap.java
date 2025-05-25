class  Student {
    private String name;
    private int rollNo;
    private double gpa;

     Student(String name, int rollNo, double gpa) {
        this.name = name;
        this.rollNo = rollNo;
        setGpa(gpa); // Uses the setter for validation
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }
}

public class StudentEncap {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Ali", 101, 3.5);
            System.out.println("Name: " + s1.getName());
            System.out.println("Roll No: " + s1.getRollNo());
            System.out.println("GPA: " + s1.getGpa());

            // Test invalid GPA to trigger exception
            s1.setGpa(3.8); // This will throw the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}