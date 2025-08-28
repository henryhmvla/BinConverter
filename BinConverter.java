import java.util.Scanner;


public class BinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 127 to convert to binary.");
        int number = sc.nextInt();
        int remainder = 0;
        int result, result2, result3, result4 = 0;


        //Calculation starts here.
        result = number/8; //divide number by 8 and set equal to the result
        int number2 = number;
        if( result > 0 ){
            //print 1 on the same line.
            System.out.print("1");
            number2 = number-8;
            //get the remainder by setting the remainder to number-8
            
            
            //number will become the remainder
            
        } 
        else {
            //print 0
            System.out.print("0");
        }
        int number3 = number;
        result2 = number2/4;
        
        if( result2 > 0){
            System.out.print("1");
            number3 = number2 - 4;

            
        }
        else {
            System.out.print("0");
        }

        int number4;
        result3 = number3/2;
        number4 = number;
        //repeat the steps above 3 more times with the divisions of 4, 2, and 1.
        
        if (result3 > 0) {
            System.out.print("1");
            number4 = number3 - 2;
        }
        else {
            System.out.print("0");
        }        
        
        result4 = number4/1;
        if (result4 > 0) {
            System.out.print("1");
            
        }
        else {
            System.out.print("0");
        }

        if (result5 > 0) {
            System.out.println("1");
        }
        //Can you optimize this so the remainder variable doesn't get used?
        //Can you implement a loop?




    }
}
