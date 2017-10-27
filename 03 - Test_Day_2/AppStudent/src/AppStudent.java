import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppStudent {

    public static void main (String[] args) {
        List<Student> studList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student studObj = new Student();
            studObj.setId(i);
            studObj.setName("StudName" + i);
            studObj.setLastName("StudLastName" + i);
            studObj.setAge(i);
            studList.add(studObj);
        }
        System.out.println(studList); //Выводит List объектов Student
        Collections.sort(studList);
        System.out.println(studList); //Выводит отсортированный List объектов Student Desc
    }

    public static class Student implements Comparable<Student> {

        private int id;
        private String name;
        private String lastName;
        private int age;

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
}

/*
1. Реализовать метод сортировки коллекции по одному из полей (например, возраст)
2. Реализовать метод, который выберет (отфильтрует) всех студентов, чья фамилия начинается на определенную букву (метод возращает лист подходящих объетов)
3. Реализовать метод, который посчитает среднее арифметическое по возрасту студентов (метод возращает средний арифметический возраст студентов)
4. Реализовать метод, который преобразует лист студентов в мапу <id студента - студент> (метод возвращает Map) - опционально
5. Из Map предыдущего пункта отобрать (отфильтровать) студентов, id которых больше 100 (метод возвращает Map) - опциональн
 */

