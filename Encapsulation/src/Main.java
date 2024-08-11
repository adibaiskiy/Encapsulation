public class Main {
    public static void main(String[] args) {

        University[] universities = {
                new University("Кыргызский Государственный Университет", "Бишкек", 1950),
                new University("Алыкул Осмонов", "Нарын", 1976),
                new University("Лев Николаевич Толстой", "Ош", 1955)
        };

        School[] schools = {
                new School("Чынгыз Айтматов", "Dinara Taalaibekova", 830),
                new School("Академия наук", "Aibek Joha", 850),
                new School("PeakSoft House", "Esen Niyazov", 600)
        };

        Car[] cars = {
                new Car("Sonata", "Hyundai", 2020),
                new Car("Fit", "Honda", 2018),
                new Car("E60", "BMW", 2008)
        };

        Person[] persons = {
                new Person("Adilet", 30, "Development"),
                new Person("Bektur", 25, "Tester"),
                new Person("Atai", 35, "Engineer")
        };


        System.out.println("Universities:");
        for (University university : universities) {
            System.out.println(university.getInfoUniversity());
        }
        System.out.println("_____________________");

        System.out.println("Schools:");
        for (School school : schools) {
            System.out.println(school.getInfoSchool());
        }
        System.out.println("_____________________");

        System.out.println("Cars:");
        for (Car car : cars) {
            System.out.println(car.getInfoCar());
        }
        System.out.println("_____________________");

        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println(person.getInfoPerson());
        }
    }
}