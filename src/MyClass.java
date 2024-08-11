public class MyClass {

    String name;
    String surName;
    int age;
    String[] courses;
    String favoriteFood;

    public MyClass(String name, String surName, int age, String[] courses, String favoriteFood){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.courses = courses;
        this.favoriteFood = favoriteFood;
    }

    public MyClass(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    // Метод для вывода информации
    public void systemInfo(){
        System.out.println("Name: " + name);
        System.out.println("surName: " + surName);
        System.out.println("age: " + age);
        System.out.println("Courses: ");
        if (courses != null) {
            for (String course : courses) {
                System.out.print(course + " ");
            }
        } else {
            System.out.println("No courses specified");
        }
        System.out.println();

        System.out.println("Favorite Food: " + favoriteFood);
    }
}
