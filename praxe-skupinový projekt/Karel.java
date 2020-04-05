
package karel;
import java.util.Scanner;

public class Karel {
        public static int cs = 1;
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        Karelfnc Kar = new Karelfnc(input);
        while (cs == 1){
            input = myObj.nextLine();
            Kar.input(input);
            Kar.dothing();
        }
    }
        
    
}
