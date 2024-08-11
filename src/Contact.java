public class Contact {
    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;

    }
    public String getInfo(){
        return String.format("""
                Contact Name: %s
                Phone Number: %s
                """,contactName,phoneNumber);
    }


}
