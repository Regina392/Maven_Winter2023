package Day3_11142023;

public class T3_MultipleConditions {
    public static void main(String[] args) {
        //declare some int values
        int a = 71;
        int b = 4;
        int c = 7;
        //start of the conditional statement
        if (a + b > c) {
            System.out.println("sum of a and b is greater than c");
        } else if (a + b < c) {
            System.out.println("sum of a and b is less than c");
        }   else {
            System.out.println("sum of a and b is equal to c");
        }//end of it else statements
    }//end of main
}//end of the class
