import java.util.Scanner;

class missingNumber {

    //Method to sort number series using bubble sort 
    static void bubSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String args[]){
        
        //Display to get number series from the user
        System.out.println("Use comma (,) to seperate the number series!!!");
        System.out.println("Enter number pattern:");
        //Get scanner class to get input 
        Scanner sc = new Scanner(System.in);
        String numpat = sc.next();

        //Split number series using the comma (,) to seperate
        String[] numList = numpat.split(","); 

        //Storing string number series in int variable
        int size = numList.length; 
        int [] numArr = new int [size];  
        for(int i=0; i<size; i++) {
            numArr[i] = Integer.parseInt(numList[i]);
         }

        //Apply bubble sorting to sort the number series 
        bubSort(numArr);

        
        int missNo = 0, count = 0; 
        int n = numArr[0]; 
        //Use a for loop to find the missing number by comparing the number pattern of (n = n+1)
        for(int i = 0 ; i<size ; i++){

            if(numArr[i] != n){
                missNo = n;
                count++;
            }           
            n = numArr[i] + 1;  
            
        }

        //Display if there is missing number 
        if (count == 1){
            System.out.println("Missing number: " + missNo);
        }
        else if (count > 1){
            System.out.println("There are many missing numbers within the number series.");
        }
        else {
            System.out.println("No missing number");
        }
            
    }
}