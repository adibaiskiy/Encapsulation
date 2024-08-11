class Person {
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getInfoPerson() {
        return String.format("""
                Name: %s
                Age: %d
                Occupation: %s
                """, name ,age, occupation);
    }
}
