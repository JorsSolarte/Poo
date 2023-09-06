
package exersice;

public class Persona {
    String firstName;
    String lastName;
    String document;
    
 //Cinstructor

    public Persona(String firstName, String lastName, String document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocument(String document) {
        this.document = document;
    }
  
    }


