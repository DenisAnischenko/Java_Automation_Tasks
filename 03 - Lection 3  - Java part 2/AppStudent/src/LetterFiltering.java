import java.util.ArrayList;
import java.util.List;

//2. Реализовать метод, который выберет (отфильтрует) всех студентов, чья фамилия начинается на определенную букву (метод возращает лист подходящих объетов)

public class LetterFiltering {
    public static void letterFilter(List<Student> studList, String letter) {
        List<String> firstLetterList = new ArrayList<>();
        String toLowerCaseLetter = letter.toLowerCase();
        for (int i = 0; i < studList.size(); i++) {
            String toLowerCaseName = studList.get(i).getName().toLowerCase();
            if (toLowerCaseName.startsWith(toLowerCaseLetter)) {
                firstLetterList.add(studList.get(i).getName());
            }
        }
        System.out.println(firstLetterList);
    }
}
//char firstLetter = studList.get(i).getName().charAt(0); не работает блять!