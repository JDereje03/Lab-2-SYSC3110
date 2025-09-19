import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddies.add(buddy);
        }
    }

    public void removeBuddy(String name){
        buddies.removeIf(buddy -> buddy.getName().equals(name));
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Carleton street", "1234567890");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy("Homer");
    }

}
