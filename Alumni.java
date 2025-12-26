/**
 * Represents an alumni guest attending the New Year's Eve party.
 * An Alumni is a PartyGuest with extra details such as graduation year
 * and academic department.
 */
public class Alumni extends PartyGuest {
    private int graduationYear;
    private String department;

    /**
     * Creates a new alumni guest.
     *
     * @param name            the alumni’s name
     * @param rsvp            RSVP status
     * @param graduationYear  two-digit graduation year (e.g., 23)
     * @param department      academic department
     */
    public Alumni(String name, boolean rsvp, int graduationYear, String department) {
        super(name, rsvp);
        this.graduationYear = graduationYear;
        this.department = department;
    }

    /**
     * Updates the graduation year.
     *
     * @param graduationYear the new graduation year
     */
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    /**
     * Updates the department.
     *
     * @param department the new department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns the graduation year.
     *
     * @return graduation year
     */
    public int getGraduationYear() {
        return graduationYear;
    }

    /**
     * Returns the department name.
     *
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Returns a readable description of the alumni guest.
     * Format: Name 'YY Department
     *
     * @return formatted alumni description
     */
    @Override
    public String toString() {
        return super.toString() + " '" + graduationYear + " " + department;
    }
}