//added line test
package phoneNumberDecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


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
        
        Map <Character, Character> slownik = new HashMap<>();
        slownik.put('A','2');
        slownik.put('B','2');
        slownik.put('C','2');
        slownik.put('D','3');
        slownik.put('E','3');
        slownik.put('F','3');
        slownik.put('G','4');
        slownik.put('H','4');
        slownik.put('I','4');
        slownik.put('J','5');
        slownik.put('K','5');
        slownik.put('L','5');
        slownik.put('M','6');
        slownik.put('N','6');
        slownik.put('O','6');
        slownik.put('P','7');
        slownik.put('Q','7');
        slownik.put('R','7');
        slownik.put('S','7');
        slownik.put('T','8');
        slownik.put('U','8');
        slownik.put('V','8');
        slownik.put('W','9');
        slownik.put('X','9');
        slownik.put('Y','9');
        slownik.put('Z','9');
 
        
        for (int i = 0; i < numberChar.length; i++) {
           char temp = numberChar[i];
           if (slownik.containsKey(numberChar[i])){
                   numberChar[i]=slownik.get(temp);
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
