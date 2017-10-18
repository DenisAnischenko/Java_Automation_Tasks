import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Student[] studentList = getStudents();
        int[] marks = getRandomMarks(studentList);
        System.out.println(getAverage(marks));
    }

    private static Student[] getStudents() {
        Student[] studentList = new Student[5];
        studentList[0] = new Student("Name_1","lastName_1");
        studentList[1] = new Student("Name_2","lastName_2");
        studentList[2] = new Student("Name_3","lastName_3");
        studentList[3] = new Student("Name_4","lastName_4");
        studentList[4] = new Student("Name_5","lastName_5");
        return studentList;
    }

    private static int[] getRandomMarks(Student[] studentList) {
        int[] marks = new int[studentList.length];
        for (int i = 0; i< marks.length; i++) {
            Random rand = new Random();
            int mark = rand.nextInt(5) + 1;
            System.out.println(mark);
            marks[i] = mark;
        }
        return marks;
    }

    private static double getAverage(int[] marks) {
        double sum = 0f;
        for (int m : marks) {
            sum += m;
        }
        return sum/marks.length;
    }
}