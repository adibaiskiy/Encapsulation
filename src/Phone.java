public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phonesUserName;
    private Contact[] contacts;

    public Phone(String brand, String model, int price, String phonesUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUserName = phonesUserName;
        this.contacts = contacts;
    }
    public String getBrand(){
        return brand;
    }public void setBrand(String brand){
        this.brand = brand;

    }

    public String getModel(){
        return model;
    }public void setModel(String model){
        this.model = model;
    }

    public int getPrice(){
        return price;
    }public void setPrice(int price){
           this.price = price;
        }

    public String getPhonesUserName() {
        return phonesUserName;
    }
    public void setPhonesUserName(String phonesUserName) {
        this.phonesUserName = phonesUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }
    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    public void getContactCount(){

    }
}

