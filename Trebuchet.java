import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Trebuchet {

    public static void main(String args[]) {
        int sum = 0;
        String concatNum = "";
        String concatDigit = "";
        int digitValue = 0;

        try {

            File doc = new File("/home/motellers/Desktop/CLASS 10 PAPERS/Computer/kodeh/test-proj/src/Sample.txt");
            Scanner input = new Scanner(doc);

            while (input.hasNextLine()) {
                concatNum = new String();
                concatDigit = new String();
                String data = input.nextLine();
                for (int i = 0; i < data.length(); i++) {
                    char a = data.charAt(i);
                    if (Character.isDigit(a) == true) {
                        digitValue = Character.getNumericValue(a);
                        concatNum = concatNum + "" + digitValue;

                    }
                }
                if (concatNum.length() == 1) {
                    concatNum += concatNum;
                }
                int firstDigit = Character.getNumericValue(concatNum.charAt(0)); // Get first digit
                int lastDigit = Character.getNumericValue(concatNum.charAt(concatNum.length() - 1)); // Get last digit 
                System.out.println("First Digit: " + firstDigit + " Last Digit: " + lastDigit);
                concatDigit = firstDigit + "" + lastDigit;
                sum = sum + Integer.valueOf(concatDigit);

            }
            System.out.println(sum);

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
