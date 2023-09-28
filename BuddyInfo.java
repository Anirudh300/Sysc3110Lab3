
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {

        name = getName();
        address = getAddress();
        phoneNumber = getPhoneNumber();

    }

    public BuddyInfo(String name, String address, String phoneNumber) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo info = new BuddyInfo();
        info.setName("Addy");
        System.out.println("Hello " + info.getName());
    }


}

