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
        System.out.println("Address Book");
    }

}
