package Assignment2.constructor;

public class Main {
    public static void main(String[] args) {
        // Creating Student object
        Student s1 = new Student();

        // Creating Commission object
        Commision emp = new Commision();
        emp.acceptDetails();        // Accept employee details
        emp.calculateCommission();  // Calculate and display commission
    }
}
