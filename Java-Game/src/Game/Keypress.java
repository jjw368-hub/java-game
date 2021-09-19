package Game;

import java.util.Scanner;

public class Keypress {
    Scanner scannerObj = new Scanner(System.in);
    public String GetInput() {
        return scannerObj.nextLine();
    }
}