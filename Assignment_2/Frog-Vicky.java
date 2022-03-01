import java.util.Scanner;
class vicky {
    public static void main(String args[]){
        //user input of vicky's distance 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter distance of Vicky the frog: ");
        int dist = myObj.nextInt();

        //Variable initialization 
        int a = 0, b = 0, c = 0; 
        int size = 0;
        int time = 0;
        int temp = dist; 

        //Loop to get values to determine time that taken to jump 5m, 3m, 1m
        while(temp > 0){

            if(temp >= 5){
                temp = temp - 5;
                a = a + 1;
            }
            else if(temp >= 3) {
                temp = temp - 3;
                b = b + 2; 
            }
            else if(temp >= 1){
                temp = temp - 1; 
                c= c + 3;
            }
        }

        //Total time that taken to jump according to user input distance of vickey the frog
        int totalT = a+b+c; 
        System.out.println("Time: "+totalT); 
    }
}