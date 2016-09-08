package phoneNumberDecode;

import java.util.Scanner;

/**
 *
 * @author dom
 */
public class PhoneNumberDecode {

    /**
     * @param args the command line arguments
     */
    public static String calcPhoneNumber(String number) {
        if (number.length() != 12) {
            return "Error";
        }
        //TODO:  napisać konwersję
        char[] numberChar = number.toUpperCase().toCharArray();
        
        for (int i = 0; i < numberChar.length; i++) {
           char temp = numberChar[i];
            switch (temp) {
                case 'A':
                case 'B':
                case 'C':
                    numberChar[i] = '2';
                    break;
                case 'D':
                case 'E':
                case 'F':
                    numberChar[i] = '3';
                    break;
                case 'G':
                case 'H':
                case 'I':
                    numberChar[i] = '4';
                    break;
                case 'J':
                case 'K':
                case 'L':
                    numberChar[i] = '5';
                    break;
                case 'M':
                case 'N':
                case 'O':
                    numberChar[i] = '6';
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    numberChar[i] = '7';
                    break;
                case 'T':
                case 'U':
                case 'V':
                    numberChar[i] = '8';
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    numberChar[i] = '9';
                    break;

            }

        }
        
        return new String(numberChar);
    }

    public static void main(String[] args) {
        System.out.println("Podaj numer telefonu w postaci mnemonicznej:");
        Scanner sc = new Scanner(System.in);
        String numerWejsciowy = sc.nextLine();
        String numerKoncowy = calcPhoneNumber(numerWejsciowy);
        System.out.println(numerKoncowy);
    }

}
