
/* 3. Write a Java Program to create an Exception called payout-of-bounds and throw the
exception*/

import java.util.*;
class PayOutOfBoundsException extends Exception  {
    public PayOutOfBoundsException(String s)   {
        super(s);
    }
}
public class Exception3{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Salary: ");
        int esal = in.nextInt();
        try {
            if (esal < 3000 || esal > 10000) {
                throw new PayOutOfBoundsException("Salary must be 3000 to 10000");
            }
            System.out.println("The given salary of Employee is " + esal);
        } catch (PayOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}