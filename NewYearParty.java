public class NewYearParty{
    private PartyGuest[] guests;
    private int count;
    private int max;

    public NewYearParty(int maxAttendees){
        guests = new PartyGuest[maxAttendees];
        count = 0;
        this.max = maxAttendees;
    }
    
    public void addGuest(PartyGuest guest){
        if (count == guests.length){
            System.out.println("unable to accomodate " +  guest.getName() + "attendees is " + max + ".");
        }else{
            guests[count] = guest;
            count++;
            System.out.println("Added " + guest.getName() + ", rsvp: " + guest.getRsvp() + "." );
        }
    }
    
    public void rsvp(String name, boolean rsvpStatus){
        boolean found = false;

        for (int i = 0; i < count; i++) {
           if (guests[i].getName().equals(name)){
            guests[i].setRsvp(rsvpStatus);
            System.out.println("Set RSVP to " + rsvpStatus + " for " + name + ".");
            found = true;
            break;
           }
        }
        
        if(!found){
            System.out.println(name + "not found.");
        }
    }
    
    
    public void printGuests(boolean rsvpStatus){
        if(count == 0){
            System.out.println("NO ONE IN THE LIST");
            return;
        }

        if(rsvpStatus){
            System.out.println("Guests who have RSVP: \n");
        }else{
            System.out.println("Guests who do not have RSVP: \n");
        }

        for (int i = 0; i < count; i++) {
            if (guests[i].getRsvp() == rsvpStatus){
                System.out.println(guests[i]);
            }    
        }
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "NO ONE IN THE LIST";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("All Guests:\n");

        for (int i = 0; i < count; i++) {
            sb.append(guests[i]).append("\n");
        }

        return sb.toString();
    }

}