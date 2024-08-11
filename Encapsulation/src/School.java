public class School {
    private String name;
    private String principal;
    private int numberOfStudents;


    public School(String name, String principal, int numberOfStudents) {
        this.name = name;
        this.principal = principal;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getPrincipal() {
        return principal;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getInfoSchool() {
        return String.format("""
                Name: %s
                Principal: %s
                Number Of Students: %d
                """, name, principal, numberOfStudents);
    }
}
