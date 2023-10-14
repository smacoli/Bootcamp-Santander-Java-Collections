package main.set.BasicOperations;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInvitationCode() == guest.getInvitationCode() && Objects.equals(getGuestName(), guest.getGuestName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGuestName(), getInvitationCode());
    }
}
