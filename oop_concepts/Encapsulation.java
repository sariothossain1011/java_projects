package oop_concepts;

public class Encapsulation {

    private String name;
    private double id;
    private double cgpa ;

    public void setName(String name){this.name = name;}
    public void setId(double id){this.id = id;}
    public void setCgpa(double cgpa){this.cgpa = cgpa;}

    public String getName(){return name;}
    public double getId(){return id;}
    public double getCgpa(){return cgpa;}
    

    public static void main(String[] args) {

        Encapsulation encap = new Encapsulation();

        encap.setName("Sariot Hossain");
        encap.setId(10092);
        encap.setCgpa(3.60);
        System.out.println("Name is : "+encap.getName());
        System.out.println("ID is : "+encap.getId());
        System.out.println("CGPA is : "+encap.getCgpa());


        
    }
}
