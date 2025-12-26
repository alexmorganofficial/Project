/**
 * Manages the guest list for the New Year's Eve party.
 * Uses an array to store guests and supports adding guests,
 * updating RSVP status, and printing the attendee list.
 */
public class NewYearParty {
    private final PartyGuest[] guests;
    private int count;
    private final int max;

    /**
     * Creates a new party with a fixed maximum number of attendees.
     *
     * @param maxAttendees the maximum number of guests allowed
     */
    public NewYearParty(int maxAttendees) {
        guests = new PartyGuest[maxAttendees];
        count = 0;
        this.max = maxAttendees;
    }

    /**
     * Adds a guest to the party if space is available.
     * Works for both PartyGuest and Alumni objects.
     *
     * @param guest the guest to add
     */
    public void addGuest(PartyGuest guest) {
        if (count == max) {
            System.out.println("Unable to accommodate " + guest + ", max attendees is " + max);
            return;
        }
        guests[count] = guest;
        count++;
        System.out.println("Added " + guest + ", rsvp: " + guest.getRsvp());
    }

    /**
     * Updates the RSVP status for a guest by name.
     * If the name does not exist, a message is printed.
     *
     * @param name        the guest’s name
     * @param rsvpStatus the new RSVP status
     */
    public void rsvp(String name, boolean rsvpStatus) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (guests[i].getName().equals(name)) {
                guests[i].setRsvp(rsvpStatus);
                System.out.println("Set RSVP to " + rsvpStatus + " for " + name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(name + " not found");
        }
    }

    /**
     * Prints a list of guests based on RSVP status.
     * This helper method is not required for the main output,
     * but can be useful for testing.
     *
     * @param rsvpStatus true to show RSVP’d guests, false otherwise
     */
    public void printGuests(boolean rsvpStatus) {
        if (count == 0) {
            System.out.println("NO ONE IN THE LIST");
            return;
        }

        if (rsvpStatus) {
            System.out.println("Guests who have RSVP: \n");
        } else {
            System.out.println("Guests who do not have RSVP: \n");
        }

        for (int i = 0; i < count; i++) {
            if (guests[i].getRsvp() == rsvpStatus) {
                System.out.println(guests[i]);
            }
        }
    }

    /**
     * Returns the full formatted guest list.
     * Guests are separated into RSVP’d and not-RSVP’d sections.
     * The guest array is only traversed once for efficiency.
     *
     * @return formatted party guest list
     */
    @Override
    public String toString() {
        StringBuilder yes = new StringBuilder();
        StringBuilder no = new StringBuilder();

        for (int i = 0; i < count; i++) {
            if (guests[i].getRsvp()) {
                yes.append("  ").append(guests[i]).append("\n");
            } else {
                no.append("  ").append(guests[i]).append("\n");
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("New Year's Eve Party attendees that have RSVP: \n");
        sb.append(yes);
        sb.append("\n");
        sb.append("New Year's Eve Party attendees that have NOT RSVP: \n");
        sb.append(no);

        return sb.toString();
    }
}