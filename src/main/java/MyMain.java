import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        
        int ret = 0;
        int raw = Integer.parseInt(binary);
        int ed = raw;
        int exp = 0;

        while (ed > 0){

            if (ed % 2 == 0){
                exp++;
            }
            else{
                ret += (int)(Math.pow(2,exp));
                exp++;
            }
            ed /= 10;

        }
        return ret;

        // REPLACE WITH YOUR CODE HERE
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format.");
        String binary = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(binary));
        scan.close();
        
    }
}
