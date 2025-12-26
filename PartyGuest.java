public class PartyGuest{
    private String name;
    private boolean rsvp;

    public PartyGuest(String name, boolean rsvp){
        this.name = name;
        this.rsvp = rsvp;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setRsvp (boolean rsvp){
        this.rsvp = rsvp;
    }

    public String getName() {return name;}
    public boolean getRsvp() {return rsvp;}
    
    @Override
    public String toString() {
        return name;
    }
}
