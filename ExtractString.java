/*  1.
Write a Java Applications to extract a portion of a character string and print the extracted string.
 */
import java.util.*;

public class ExtractString {
    public static void main(String[] args) {

        String str,substr;
        int len ,start,exc ,end;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the String : ");
        str=in.nextLine();
        len=str.length();

        System.out.println("Enter the Starting  Index : ");
        start=in.nextInt();
        start=start-1;

        if(len<0 || start>len){
            System.out.println("Invailld Index");
            System.exit(0);
        }

        System.out.println("Enter the Number of Characters Extact : ");
        exc=in.nextInt();
        end=start+exc;

        if(end>len || end<=0){
            System.out.println("Invaild Number of Characters Extact");
            System.exit(0);
        }

        substr=str.substring(start,end);
        System.out.println("Extrated String is :  "+substr);
    }
}