public class Alumni extends PartyGuest{
    private int graduationYear;
    private String department;

    public Alumni (String name,boolean rsvp,int graduationYear,String department){
        super(name, rsvp);
        this.graduationYear = graduationYear;
        this.department = department;
    }

    public void setGraduationYear(int graduationYear){
        this.graduationYear = graduationYear;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getGraduationYear(){return graduationYear;}
    public String department(){return department;}

    @Override
    public String toString() {
        return graduationYear + department;
    }
}