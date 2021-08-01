package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "kevinlinro.com";

    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //method for ask department
        this.department = setDepartment();

        //method for return random password
        this.password = randomPassword(defaultPasswordLength);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }

    //Ask department
    private String setDepartment() {
        System.out.println("HEllo " + firstName + " Please enter your Department Code\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Relevant Department Code : ");
        Scanner dept = new Scanner(System.in);
        int deptChoise = dept.nextInt();
        if (deptChoise == 1) {
            return "Sales";
        } else if (deptChoise == 2) {
            return "Dev";
        } else if (deptChoise == 3) {
            return "Acct";
        } else {
            return "";
        }

    }

    //generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "INFO : \n" +
                "DISPLAY NAME : " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL : " + email + "\n" +
                "EMAIL PASSWORD : " + password + "\n" +
                "MAILBOX CAPACITY : " + mailboxCapacity + "mb";
    }

}
