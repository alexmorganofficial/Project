public class NewYearPartyTest {
    public static void main(String[] args) {
        NewYearParty party = new NewYearParty(5);
        
        party.addGuest(new PartyGuest("Alice", true));
        party.addGuest(new PartyGuest("Bob", false));
        party.addGuest(new Alumni("Charlie", true, 22, "Government"));
        party.addGuest(new Alumni("Denise", false, 21, "Econ"));
        party.addGuest(new Alumni("Elvis", true, 23, "Computer Science"));
        party.addGuest(new Alumni("Falcon", true, 26, "Biology"));
        
        System.out.println(party);
        
        System.out.println("\nUpdate rsvp status");
        party.rsvp("George", true);
        party.rsvp("Bob", true);
        
        System.out.println(party);
    }
}