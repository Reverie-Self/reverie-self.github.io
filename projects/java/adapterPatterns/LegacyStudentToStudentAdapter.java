
package projects.java.adapterPatterns;
public class LegacyStudentToStudentAdapter implements IStudent {
    private ILegacyStudent legacyStudent;
 
    
    public LegacyStudentToStudentAdapter(ILegacyStudent student) {
        this.legacyStudent = student;
    }

    public int getId() {
        return Integer.parseInt(legacyStudent.getId());
    }

    public void setId(int id) {
        legacyStudent.setId(String.valueOf(id));
    }

    public String getFirstName() {
        return legacyStudent.getFullName().split(" ")[0];
    }

    public void setFirstName(String firstName) {
        String lastName = getLastName();
        legacyStudent.setFullName(firstName + " " + lastName);
    }

    public String getLastName() {
        return legacyStudent.getFullName().split(" ")[1];
    }

    public void setLastName(String lastName) {
        String firstName = getFirstName();
        legacyStudent.setFullName(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        System.out.println("Test the adapter here");
        // Legacy => Student //
        //  Test Legacy pull and Normal Student Pull then build bridge //
        LegacyStudent legacyStudent = new LegacyStudent();
        legacyStudent.setId("123456");
        legacyStudent.setFullName("John Doe");
        System.out.println("Legacy Student ID: " + legacyStudent.getId());
        System.out.println("Legacy Student Full Name: " + legacyStudent.getFullName());
        LegacyStudentToStudentAdapter adapter = new LegacyStudentToStudentAdapter(legacyStudent);
        System.out.println("Student ID: " + adapter.getId());
        System.out.println("Student First Name: " + adapter.getFirstName());
        System.out.println("Student Last Name: " + adapter.getLastName());

    }
}