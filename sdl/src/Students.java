import java.time.LocalDate;

public class Students {
//    Майн класста 20 стунденттин обектисин тузуп, маанилерин толтурунуз.
//    Праметирине студенттердин массивин алган эки метод тузунуз. Биринчи метод 2000-жылдaн кийин торолгон студенттерди
//    кайтарсын, экинчи метод 2000-жылга чейин торолгон студенттерди кайтарсын
//    Параметирине стринг тибинде ат алып ошол аттагы студенттерди кайтарган метод туз
//    Праметирине студенттердин массивин алган эки метод тузунуз. Биринчи метод эн жашы кичине студентти кайтарсын.
//    Экинчи метод эн жашы чон студентти кайтарсын.
//    Бардык студенттердин жаштарын кайтарган метод тузунуз
//    Параметирине курстун атын алып ошол курста окуган бардык студенттерди кайтарган метод туз.
//    Параметирине соз алып. Ошол создон же тамгадан башталган аттагы студенттерди кайтарган метод тузунуз.
//    removeStudentsBetweenDates(Student[]students, LocalDate startDate, LocalDate endDate); деген метод тузyнуз.Ошол
//    жылдардын арасында торолгон бардык студенттерди очуруп калган студенттерди кайтарган метод тузунуз
    private String name;
    private String surName;
    private LocalDate birthDate;
    private String[] courses;
    public Students(){}

    public Students(String name, String surName, LocalDate birthDate, String[] courses) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String[] getCourses() {
        return courses;
    }
}


