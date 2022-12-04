
package maincontact;

import java.util.Comparator;

public class Contact implements Comparator <Contact>{
    private String socialSecurityNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    
    public Contact(String socialSecurityNumber, String firstName, String lastName, String phoneNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return socialSecurityNumber + "\t" + firstName + "\t" + lastName + "\t" + phoneNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int compareTo(Contact o) {
        return Integer.parseInt(this.lastName) - Integer.parseInt(o.lastName);
    }

    @Override
    public int compare(Contact o1, Contact o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
