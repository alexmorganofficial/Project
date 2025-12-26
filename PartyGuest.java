/**
 * Represents a single person who may attend the New Year's Eve party.
 * Each guest has a name and an RSVP status.
 */
public class PartyGuest {
    private String name;
    private boolean isRsvp;

    /**
     * Creates a new party guest.
     *
     * @param name   the guest’s name
     * @param isRsvp whether the guest has RSVP’d
     */
    public PartyGuest(String name, boolean isRsvp) {
        this.name = name;
        this.isRsvp = isRsvp;
    }

    /**
     * Updates the guest’s name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Updates the guest’s RSVP status.
     *
     * @param isRsvp true if RSVP’d, false otherwise
     */
    public void setRsvp(boolean isRsvp) {
        this.isRsvp = isRsvp;
    }

    /**
     * Returns the guest’s name.
     *
     * @return the guest name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns whether the guest has RSVP’d.
     *
     * @return true if RSVP’d, false otherwise
     */
    public boolean getRsvp() {
        return isRsvp;
    }

    /**
     * Returns a simple text version of the guest.
     * This is just the guest’s name.
     *
     * @return the guest name
     */
    @Override
    public String toString() {
        return name;
    }
}