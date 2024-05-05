public class Study {
    private String name;
    private String describtion;
    private int numberOfSemester;
    private int maxNumOfITN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public int getNumberOfSemester() {
        return numberOfSemester;
    }

    public void setNumberOfSemester(int numberOfSemester) {
        this.numberOfSemester = numberOfSemester;
    }

    public int getMaxNumOfITN() {
        return maxNumOfITN;
    }

    public void setMaxNumOfITN(int maxNumOfITN) {
        this.maxNumOfITN = maxNumOfITN;
    }


    public Study(String name, String describtion, int numberOfSemester, int maxNumOfITN) {
        this.name = name;
        this.describtion = describtion;
        this.numberOfSemester = numberOfSemester;
        this.maxNumOfITN = maxNumOfITN;
    }

}
