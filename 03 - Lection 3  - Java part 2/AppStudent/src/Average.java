//3. Реализовать метод, который посчитает среднее арифметическое по возрасту студентов (метод возращает средний арифметический возраст студентов)

import java.util.ArrayList;
import java.util.List;

public class Average {

    public static void average(List<Student> studList) {
        int arrayListSum = 0;
        for (int i = 0; i < studList.size(); i++) {
            arrayListSum += studList.get(i).getAge();
        }
        int resultAver = arrayListSum / studList.size();
        System.out.println(resultAver);
    }
}
