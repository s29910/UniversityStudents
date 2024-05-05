public class Grade {
    public int grade;
    public String nameOfSubject;

    public Grade(int grade, String nameOfSubject) {
        this.grade = grade;
        this.nameOfSubject = nameOfSubject;
    }

    public void Display() {
        System.out.println("=================");
        System.out.println("Grade:" + grade);
        System.out.println("NameOfSubject:" + nameOfSubject);
    }
}
