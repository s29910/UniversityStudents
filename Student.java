import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private int ITNNumber;
    private String name;
    private String lname;
    private Date birthDate;
    private String email;
    private String address;
    private String phoneNumber;
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private List<Grade> grades;
    private Study assignedStudy;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setITNNumber(int itns) {
        this.ITNNumber = itns;
    }

    private String status;

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {

        this.currentSemester = currentSemester;
    }

    private int currentSemester;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("No name is provided");
        }
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        if (lname.isEmpty()) {
            throw new IllegalArgumentException("No last name is provided");
        }
        this.lname = lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("No birth is provided");
        }
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            throw new IllegalArgumentException("No email is provided");
        }
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("No address is provided");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("No phone number is provided");
        }
        this.phoneNumber = phoneNumber;
    }


    public String getIndexNumber() {
        return indexNumber;
    }


    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        if (grades == null || grades.size() == 0) {
            throw new IllegalArgumentException("No grades is provided");
        }
        this.grades = grades;
    }


    public Student(String name, String lname, String email, String address, String phoneNumber,
                   Date birthDate) {
        setName(name);
        setLname(lname);
        setEmail(email);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setBirthDate(birthDate);
        this.indexNumber = "s" + nextIndexNumber++;
        this.status = "candidate";
        this.grades = new ArrayList<Grade>();

    }

    public void enrollStudent(Study study) {
        assignedStudy = study;
        currentSemester = 1;
        status = "student";
    }

    public void promoteToNextSemester() {
        if (assignedStudy.getMaxNumOfITN() > ITNNumber) {
            System.out.println("ITN number is exceeded");

        } else {
            if (currentSemester == assignedStudy.getNumberOfSemester()) {
                status = "graduaded";
            } else {
                currentSemester++;
            }
        }
    }

    public void displayInformationAboutStudent() {
        System.out.println("-----------------");
        System.out.println("index number: " + getIndexNumber());
        System.out.println("name: " + getName());
        System.out.println("last name: " + getLname());
        System.out.println("email: " + getEmail());
        System.out.println("address: " + getAddress());
        System.out.println("phone: " + getPhoneNumber());
        System.out.println("birth date: " + getBirthDate());
        System.out.println("current semester: " + getCurrentSemester());
        System.out.println("status: " + getStatus());
        for (Grade g : getGrades()) {
            g.Display();
        }
        System.out.println();
    }

    public void addGrade(int grade, String nameOfSubject) {
        Grade g = new Grade(grade, nameOfSubject);
        grades.add(g);
    }
}
