public class University {
    private String name;
    private String location;
    private int establishedYear;

    public University(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }


    public String getInfoUniversity() {
        return String.format("""
                        Name: %s
                        Location: %s
                        establishedYear: %d
                        """,name, location, establishedYear);
    }
}
