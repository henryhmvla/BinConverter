import java.util.Scanner;


public class BinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 15 to convert to binary.");
        int number = sc.nextInt();
        int remainder = 0;
        int result = 0;


        //Calculation starts here.
        result = number/8; //divide number by 8 and set equal to the result
        if( result > 0 ){
            //print 1 on the same line.
            System.out.print("1");
            //get the remainder by setting the remainder to number-8
            int number2
            number2 = number - 8;
            //number will become the remainder
            
        } 
        else {
            //print 0
            System.out.print("0");
        }

        result2 = number2/4
        if( result2 > 0){
            System.out.print("1");

            int number3
            number3 = number2 - 4
        }
        else {
            System.out.print("0");
        }
        //repeat the steps above 3 more times with the divisions of 4, 2, and 1.
        if (result3 > 0) {
            System.out.println("1")
        }        }
        //Can you optimize this so the remainder variable doesn't get used?
        //Can you implement a loop?




    }
}
