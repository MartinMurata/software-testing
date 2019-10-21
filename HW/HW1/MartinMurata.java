import java.lang.String;
public class MartinMurata{
    private String firstname = "Martin";
    private String lastname = "Murata";
    private int id_no = 26068062;
    private String uci_netid = "mpmurata";

    public String getFullName() {
        return firstname + " " + lastname;
    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public String getUCInetID() {
        return uci_netid;
    }
    public int getStudentNumber() {
        return id_no;
    }
    public String getRotatedFullName(int shift) {
        String fullname = new String(this.getFullName());
        // System.out.println("SHIFT");
        int len = fullname.length();
        char shifted_String[] = new char[len];
        for(int i = 0;i < len;i++){
            if(shift>0)
                shifted_String[(i + shift) % len] = fullname.charAt(i);
            else
                shifted_String[(((i + shift) % len) + len) % len] = fullname.charAt(i);
        }
        return new String(shifted_String);
    }
}   