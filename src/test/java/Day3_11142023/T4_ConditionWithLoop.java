package Day3_11142023;

public class T4_ConditionWithLoop {
    public static void main(String[] args) {
        String[] fruitBasket = new String[]{"Grape", "Orange", "Apple", "Mango"};
        //pick out only apple from the basket / array
        //start the for loop because we need to check everything in the basket / array
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i] == "Apple") {
                // == (double equal sign) means its a comparison operator
                // = (single equal sign) assigns a value to variable
                System.out.println("An Apple a day keeps the defects away");
            }//end of if clause
            else if (fruitBasket[i] == "Grape") {
                System.out.println("My fruit is " + fruitBasket[i]);
            }//end of else if
        }//end of for loop
    }//end of main
}//end of class
