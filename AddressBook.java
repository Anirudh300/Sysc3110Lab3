import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddyInfos = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddy){
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfos.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        BuddyInfo buddy = new BuddyInfo("Ben", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);


    }
}
