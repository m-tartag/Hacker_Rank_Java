package org.hacker.solutions;

public class Practice {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Practice(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public String fullName() {
        return firstName + ' ' + lastName;
    }

    public String ageCalc() {
        return "Age: " + (2020 - birthYear);
    }

    public String setGreeting() {
        if (this.firstName == "Matt") {
            return "Access Granted";
        } else {
            return "Access Denied";
        }
    }
}

class Run {

     public static void main(String[] args) {
         Practice person = new Practice("Matt", "Tartaglia", 1988);
         System.out.println(person.fullName());
         System.out.println(person.ageCalc());
         System.out.println(person.setGreeting());
     }
 }
