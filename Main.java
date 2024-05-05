import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student s01 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12",
                "333-322-222", new Date(2006, 7, 26));
        //student get the indexNumber automatically assigned

        Student s02 = new Student("Paul", "Doe", "pae@wp.pl", "Warsaw, Zlota 21",
                "223-342-222", new Date(2005, 9, 26));


        Study it = new Study("IT", "AAA", 7, 5);
        // 7 is the number of semesters, 5 - number of possible ITN's before being allowed to be promoted to next semester
        s01.enrollStudent(it);
        // we assign the student to the first semester by default
        s01.addGrade(5, "PGO");
        s01.addGrade(2, "APBD");
        s01.displayInformationAboutStudent();


        s02.enrollStudent(it);
        s02.addGrade(5, "PPZ");
        s02.displayInformationAboutStudent();

        s01.setITNNumber(10);
        s02.setITNNumber(2);

        Students students = new Students();
        students.addStudent(s01);
        students.addStudent(s02);

//We try to promote students - this method should go through all our students and run the promoteToNextSemester() method on each student.
//Remember to check whether a student is not already on the last semester - then we can set student's status = "Graduate".
//Remember to check whether the student didn't exceed the number of ITN's allowed on specific studies.
        students.promoteAllStudents();
//We check the current semester for each student
        students.displayInfoAboutAllStudents();
//To check if students promote to next semester:
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
    }
}

