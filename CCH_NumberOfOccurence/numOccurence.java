import java.util.Scanner;

public class numOccurence{
    public static void main(String args[]) {
 
        //Display user to get a word 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word : ");
        String str = scanner.nextLine();
 
        //String length
        int len = str.length();

        //calling method to count occurance 
        countOccur(str, len);

        
        
    }

    //Method to count occurance
    static void countOccur(String word, int size){
        int counter[] = new int[256];
        for (int i = 0; i < size; i++) {
            counter[(int) word.charAt(i)]++;
        }
        
        for (int j = 0; j< 256; j++) {
            if (counter[j] != 0) {
                System.out.println((char) j + " ----> " + counter[j]);
            }
        }
    }
}