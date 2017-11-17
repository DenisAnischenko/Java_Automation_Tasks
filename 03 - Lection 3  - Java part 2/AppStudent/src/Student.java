import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private static List<Student> studList;

    public static void toArrayList() {
        studList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student studObj = new Student();
            studObj.setId(i);
            studObj.setName("StudName" + i);
            studObj.setLastName("StudLastName" + i);
            studObj.setAge(i);
            studList.add(studObj);
        }
    }

    public static List<Student> getStudList() {
        return studList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student std) {
        return std.getId() - id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
