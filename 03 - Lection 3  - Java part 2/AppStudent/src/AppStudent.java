import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppStudent {

    public static void main(String[] args) {
        Student.toArrayList();
//        System.out.println(Student.getStudList()); //Выводит List объектов Student
        Average.average(Student.getStudList()); //Cреднее арифметическое по возрасту студентов
//        LetterFiltering.letterFilter(Student.getStudList(), "S");//Фильтрует всех студентов, чья фамилия начинается на определенную букву
//        Collections.sort(Student.getStudList());
//        System.out.println(Student.getStudList()); //Метод сортировки коллекции по одному из полей (ID DESC)
    }
}

/*
Done 1. Реализовать метод сортировки коллекции по одному из полей (например, возраст)
Done 2. Реализовать метод, который выберет (отфильтрует) всех студентов, чья фамилия начинается на определенную букву (метод возращает лист подходящих объетов)
Done 3. Реализовать метод, который посчитает среднее арифметическое по возрасту студентов (метод возращает средний арифметический возраст студентов)
4. Реализовать метод, который преобразует лист студентов в мапу <id студента - студент> (метод возвращает Map) - опционально
5. Из Map предыдущего пункта отобрать (отфильтровать) студентов, id которых больше 100 (метод возвращает Map) - опциональн
 */
