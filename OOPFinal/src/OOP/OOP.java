// Main class
package OOP;

import java.util.*;
import java.util.regex.*;

public class OOP {

    public static void main(String[] args) {
        Toda T = new Toda();
        Vehicle V = new Vehicle();
        Owner O = new Owner();
//instantiation to display ang naa sa uban 1
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("|==========| Transportation Registration System |==========|");
            System.out.println("1. Register");
            System.out.println("2. Display Toda Information");
            System.out.println("3. Display Owner Information");
            System.out.println("4. Display Vehicle Information");
            System.out.println("5. Search Information");
            System.out.println("6. Exit");
            System.out.println("|=========================================================|");

            System.out.print("Enter A Number: ");

            if (sc.hasNextInt()) {
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        OUTER:
                        while (true) {
                            System.out.println("===============1=========| Register |========================");
                            System.out.println("A.Toda       B.Owner         C.Vehicle         D.Back");
                            System.out.println("=============================================================");
                            System.out.print("Enter A Letter: ");
                            char input = sc.next().charAt(0);
                            char choice = Character.toUpperCase(input);
                            switch (choice) {
                                case 'A':
                                    T.register();
                                    System.out.println();
                                    break;

                                case 'B':
                                    O.register();
                                    System.out.println();
                                    break;

                                case 'C':
                                    V.register();
                                    System.out.println();
                                    break;
                                case 'D':
                                    System.out.println("Proceed!");
                                    break OUTER;
                                default:
                                    System.out.println("Please Enter Letters A-D");
                                    sc.nextLine();
                                    break;
                            }
                        }
                        break;

                    case 2:
//formating
                        System.out.println("===========================================================| List Of Toda |==========================================================");
                        System.out.printf("%-30s %-31s %-30s %-30s %-30s", "Name Of Toda", "Phone Number", "Email", "Contact Person", "Address");
                        System.out.println();
                        T.read();
                        System.out.println();
                        System.out.println("=====================================================================================================================================");

                        break;
                    case 3:

                        System.out.println("=====================================================================| List Of Owner |===================================================================");
                        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s", "ID", "First Name", "Last Name", "Gender", "Date Of Birth", "Address");
                        System.out.println();
                        O.read();
                        System.out.println();
                        System.out.println("=========================================================================================================================================================");

                        break;
                    case 4:

                        System.out.println("=========================================================================| List Of Vehicle |========================================================================");
                        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s", "Body Number", "Engine Number", "Body Color", "Registration Date", "Owner's ID", "Vehicle Type","firstname");
                        System.out.println();
                        V.read();
                        System.out.println();
                        System.out.println("====================================================================================================================================================================");

                        break;
                    case 5:
                        OUTER:

                        while (true) {
                            System.out.println("===================| Search Information |===================");
                            System.out.println("A.Toda       B.Owner         C.Vehicle         D.Back");
                            System.out.println("=============================================================");
                            System.out.print("Enter A Letter: ");
                            char input = sc.next().charAt(0);
                            char choice = Character.toUpperCase(input);

                            switch (choice) {
                                case 'A':
                                    T.search();
                                    break;

                                case 'B':
                                    O.search();
                                    break;

                                case 'C':
                                    V.search();
                                    break;

                                case 'D':
                                    System.out.println("Proceed!");
                                    break OUTER;

                                default:
                                    System.out.println("Please Enter Letters A-D");
                                    sc.nextLine();
                                    break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Thank You For Using Our System...");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Please Enter Numbers From 1-6");
                        System.out.println();
                        break;

                }

            } else {
                System.out.println("!Please Enter an Integer!");
                System.out.println();
                sc.next();
            }

        } while (option != 6);

    }

    public static boolean validateDateFormat(String dateString) {
        String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(dateString);
        return matcher.matches();
    }
    
     
}
