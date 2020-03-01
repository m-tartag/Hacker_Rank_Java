package org.hacker.solutions;

public class Practice {

    public String firstName;
    public String lastName;
    private int birthYear;

    public Practice(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    int ageCalc() {
        return 2020 - birthYear;
    }
}

class Run {

     public static void main(String[] args) {
         Practice person = new Practice("Matt", "Tartaglia", 1988);
         System.out.println(person.firstName);
         System.out.println(person.lastName);
         System.out.println(person.ageCalc());
     }
 }
