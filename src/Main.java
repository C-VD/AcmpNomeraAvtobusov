import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = getInputTxtScanner();
        if(sc == null){
            return;
        }
        int nNumbers = sc.nextInt();
        sc.nextLine();
        String number;
        for (int i = 0; i < nNumbers; i++) {
            number = sc.nextLine();
            if(isValidNumber(number)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }

    static boolean isValidNumber(String number){
        String validLetter = "[ABCEHKMOPTXY]";
        if(number.matches(validLetter + "[0-9]" + "[0-9]" + "[0-9]" + validLetter + validLetter)){
            return true;
        }
        return false;
    }
    static Scanner getInputTxtScanner(){
        // Just for ACMP
        String inputFileName = "INPUT.TXT";
        try{
            Scanner sc = new Scanner(new File(inputFileName));
            return sc;
        }
        catch(Exception e){
            System.out.println("Не удалось открыть " + inputFileName);
            return null;
        }
    }

}