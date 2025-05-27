package oop_concepts;

public class ClassAndObject {

    String name;// fields
    String purpose;// fields

    ClassAndObject(String name, String purpose) { // constactor
        this.name = name;
        this.purpose = purpose;
    }

    public static void main(String[] args) {

        ClassAndObject co_1 = new ClassAndObject("Makka zamzam laundry service", "Laundry Service");// object create 1
        ClassAndObject co_2 = new ClassAndObject("Zorg IT Group", "Software company");// object create 2

        System.out.println("Website name: " + co_1.name + "," + "Purpose: " + co_1.purpose); // print object value
                System.out.println("Website name: " + co_2.name + "," + "Purpose: " + co_2.purpose); // print object value

    }
}
