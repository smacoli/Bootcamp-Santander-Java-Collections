package main.set;

public class Guest {
    private String guestName;
    private int invitationCode;

    public Guest(String guestName, int invitationCode) {
        this.guestName = guestName;
        this.invitationCode = invitationCode;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestName='" + guestName + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}
