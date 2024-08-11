public class Car {
    private String model;
    private String manufacturer;
    private int year;


    public Car(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }

//
//    public String getModel() {
//        return model;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }


    public String getInfoCar() {
        return String.format("""
                Model: %s
                Manufacturer: %s
                Year: %s
                """, model, manufacturer, year);
    }
}
