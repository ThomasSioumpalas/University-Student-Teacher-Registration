public class Teacher extends UniversityPerson{


    private String classRoom;
    private String subject;

    public Teacher(String name, String lastName, String classRoom, String subject) {
        super(name, lastName);
        this.classRoom = classRoom;
        this.subject = subject;
    }


    public String getClassRoom() {
        return classRoom;
    }

    public String getSubject() {
        return subject;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
