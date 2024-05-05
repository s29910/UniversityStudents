import java.util.ArrayList;
import java.util.List;

public class Students {

    public Students() {
        allStudents = new ArrayList<Student>();
    }

    private List<Student> allStudents;

    public void promoteAllStudents() {
        for (Student s : allStudents) {
            s.promoteToNextSemester();
        }

    }

    public void displayInfoAboutAllStudents() {
        for (Student s : allStudents) {
            s.displayInformationAboutStudent();
        }

    }

    public void addStudent(Student student) {
        allStudents.add(student);

    }
}