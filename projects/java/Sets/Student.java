package projects.java.Sets;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    void setLastName(String lastName) {this.lastName = lastName;}

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Student student = (Student) obj;
        return Objects.equals(firstName, student.firstName) && 
        Objects.equals(lastName, student.lastName);
    }

    
}
