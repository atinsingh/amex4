import exceptions.ContactNameException;
import exceptions.ContactPhoneFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact [] contacts = new Contact[5];
        int i = 0;
        while (i<5) {
            String defaultPhone = "";
           try {
               System.out.println("Please enter your name");
               String name = scanner.nextLine();
               if (name.length() < 3) {
                   throw new ContactNameException("User name should be minimum 3 chars");
               }
               System.out.println("Please enter your phone");
               String phoneInput = scanner.nextLine();
               if (!phoneInput.matches("[0-9]+")) {
                   throw new ContactPhoneFormatException("Phone number should have only digit");
               }
               Contact contact = new Contact(name, phoneInput);
               contacts[i] = contact;
               i++;
           }catch (ContactNameException ex) {
               System.out.println(ex.getMessage());
           }
           catch (ContactPhoneFormatException ex){
               System.out.println(ex.getMessage());
           }catch (Exception ex){
               System.out.println(ex.getMessage());
           }

        }
    }
}
