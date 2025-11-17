import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick what you want: \n1)Add teacher \n2)Add student \n3)Display");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Give Teacher's name :");
            String teacherName = scanner.next();
            System.out.println("Give Teacher's last name :");
            String teacherLastName = scanner.next();
            System.out.println("Give Teacher's class room :");
            String teacherClass = scanner.next();
            System.out.println("Give Teacher's subjet they teach :");
            String teacherSubject = scanner.next();
            Teacher teacher = new Teacher(teacherName, teacherLastName, teacherClass, teacherSubject);
            String teacherString = teacher.getName()+" "+
                    teacher.getLastName()+" "+
                    teacher.getClassRoom() + " "+
                    teacher.getSubject();
            List<String> newAdds = List.of(teacherString);
            Services.saveToFile(newAdds);


        } else if (userChoice == 2) {
            System.out.println("Give Student's name :");
            String studentName = scanner.next();
            System.out.println("Give Student's last name :");
            String studentLastName = scanner.next();
            System.out.println("Give Student's major Branch :");
            String studentMajor = scanner.next();
            System.out.println("Give Student's year of study :");
            int studentYear = scanner.nextInt();
            Student student = new Student(studentName, studentLastName, studentMajor, studentYear);
            String studentString = student.getName() + " " +
                    student.getLastName() + " " +
                    student.getmB() + " " +
                    student.getYearStudy();
            List<String> newAdds = List.of(studentString);
            Services.saveToFile(newAdds);

        }else {
            Services.displayFile();

        }


    }

}
