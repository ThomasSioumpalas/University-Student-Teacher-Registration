public class Student extends UniversityPerson {

    private String majorBranch;
    private int yearStudy;


    public Student(String name, String lastName, String majorBranch, int yearStudy) {
        super(name, lastName);
        this.majorBranch = majorBranch;
        this.yearStudy = yearStudy;
    }

    public String getmB() {
        return majorBranch;
    }

    public void setmB(String mB) {
        this.majorBranch = majorBranch;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }
}
