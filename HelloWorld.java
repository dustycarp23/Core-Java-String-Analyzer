import java.util.Scanner;

public class String Operations {

    public static void main(String[] Arya) {
        Scanner scanner = new Scanner(System.in);
        // We define the base string with extra spaces to demonstrate trim()
        String baseString = "   Hello Dear, How are you doing   ";
        String workingString = baseString.trim(); // We use this for most ops
        
        int choice;

        do {
            System.out.println("\n==========================================");
            System.out.println("   CURRENT STRING: \"" + baseString + "\"");
            System.out.println("==========================================");
            System.out.println("Select an operation:");
            System.out.println("1.  Length (Count characters)");
            System.out.println("2.  Trim Spaces (Remove side spaces)");
            System.out.println("3.  CharAt (Get character at index)");
            System.out.println("4.  Substring (Extract part of string)");
            System.out.println("5.  Replace Character (e.g., 'e' -> 'a')");
            System.out.println("6.  Replace Word (e.g., 'Dear' -> 'Friend')");
            System.out.println("7.  Equals (Check exact match)");
            System.out.println("8.  EqualsIgnoreCase (Check case-insensitive)");
            System.out.println("9.  IndexOf (Find first position of char)");
            System.out.println("10. LastIndexOf (Find last position of char)");
            System.out.println("11. Concat (Join new text)");
            System.out.println("12. ToUpperCase (Convert to CAPITALS)");
            System.out.println("13. ToLowerCase (Convert to small letters)");
            System.out.println("14. Reverse (Flip the string)");
            System.out.println("15. Contains (Check if word exists)");
            System.out.println("0.  EXIT");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Length
                    System.out.println("Result: " + baseString.length());
                    break;

                case 2: // Trim
                    System.out.println("Result: \"" + baseString.trim() + "\"");
                    break;

                case 3: // CharAt
                    System.out.print("Enter index (0-" + (workingString.length()-1) + "): ");
                    int index = scanner.nextInt();
                    if(index >= 0 && index < workingString.length()) {
                        System.out.println("Result: " + workingString.charAt(index));
                    } else {
                        System.out.println("Error: Index out of bounds.");
                    }
                    break;

                case 4: // Substring
                    System.out.println("Result (First 5 chars): " + workingString.substring(0, 5));
                    break;

                case 5: // Replace Char
                    System.out.println("Result: " + workingString.replace('e', 'a'));
                    break;

                case 6: // Replace Word
                    System.out.println("Result: " + workingString.replace("Dear", "Friend"));
                    break;

                case 7: // Equals
                    System.out.print("Enter string to compare: ");
                    String comp1 = scanner.nextLine();
                    System.out.println("Result: " + workingString.equals(comp1));
                    break;

                case 8: // EqualsIgnoreCase
                    System.out.print("Enter string to compare (case ignored): ");
                    String comp2 = scanner.nextLine();
                    System.out.println("Result: " + workingString.equalsIgnoreCase(comp2));
                    break;

                case 9: // IndexOf
                    System.out.print("Enter character to find: ");
                    String searchChar = scanner.nextLine();
                    if(searchChar.length() > 0)
                        System.out.println("Result: " + workingString.indexOf(searchChar.charAt(0)));
                    break;

                case 10: // LastIndexOf
                    System.out.print("Enter character to find last occurrence: ");
                    String lastChar = scanner.nextLine();
                    if(lastChar.length() > 0)
                        System.out.println("Result: " + workingString.lastIndexOf(lastChar.charAt(0)));
                    break;

                case 11: // Concat
                    System.out.print("Enter text to join: ");
                    String joinText = scanner.nextLine();
                    System.out.println("Result: " + workingString.concat(" " + joinText));
                    break;

                case 12: // ToUpperCase
                    System.out.println("Result: " + workingString.toUpperCase());
                    break;

                case 13: // ToLowerCase
                    System.out.println("Result: " + workingString.toLowerCase());
                    break;

                case 14: // Reverse
                    StringBuilder sb = new StringBuilder(workingString);
                    System.out.println("Result: " + sb.reverse().toString());
                    break;
                
                case 15: // Contains
                    System.out.println("Result (Contains 'How'): " + workingString.contains("Done"));
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            if(choice != 0) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }

        } while (choice != 0);
        
        scanner.close();
    }

}
