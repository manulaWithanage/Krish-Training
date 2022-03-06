import java.util.Scanner;

public class numOccurence {

    static void countOccur(char alph, String word, int size){
        int count=0;
        for(int i=0; i<size; i++)
        {
            if(word.charAt(i) == alph)
            count++;
        }
  
        System.out.println("The Character '"+alph+"' appears "+count+" times.");
    }

    
    public static void main(String args[]){
        System.out.println("Enter a word: ");
        //Get scanner class to get input 
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int size = word.length();

        // String[] splWord = word.split("");
        // int size = splWord.length; 

        

        char charArray[] = word.toCharArray();
        int size = charArray.length;
        int temp = 0;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(charArray[i]>charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
            }
         }
      }
      for(int i = 0 ; i<size ; i++){
              String = word.charAt(i);
            countOccur(cWord, word, size);
        }
    }
}
