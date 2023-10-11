package main.set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestList;

    public GuestSet() {
        this.guestList = new HashSet<>();
    }

    public void addGuest(String name, int code){
        guestList.add(new Guest(name, code));
    }

    public void removeGuestByCode(int code){
        Guest guestToRemove = null;
        for (Guest g : guestList){
            if (g.getInvitationCode() == code){
                guestToRemove = g;
                break;
            }
        }
        guestList.remove(guestToRemove);
    }

    public int totalGuests(){
        return guestList.size();
    }

    public void showGuestList(){
        System.out.println(guestList);
    }

    public static void main(String[] args) {
        GuestSet guestSet = new GuestSet();

        guestSet.addGuest("Suzana P M Oliveira", 202011);
        guestSet.addGuest("Gabriela M R Peixoto", 202012);
        guestSet.addGuest("Thomas O D Pires", 202013);
        guestSet.addGuest("Caleb E Mata", 202014);
        guestSet.addGuest("Tatiane S Batista", 202015);

        System.out.println("Total of guests: " + guestSet.totalGuests());

        guestSet.removeGuestByCode(202014);

        System.out.println("Total of guests after remove 1 guest: " + guestSet.totalGuests());

        guestSet.showGuestList();
    }
}
