package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department : " + this.department);
    }

    private String setDepartment() {
        System.out.println("Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Relevant Department Code : ");
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

}
