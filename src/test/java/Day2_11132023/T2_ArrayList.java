package Day2_11132023;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.CheckedOutputStream;

public class T2_ArrayList {
    public static void main(String[] args) {
       //declare an arraylist variable
        ArrayList <String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");//index 0
        countries.add("INDIA");//index 1
        countries.add("PAKISTAN");//index 2
        countries.add("BANGLADESH");//index 3
        //print out USA
        System.out.println("The first country is " + countries.get(0));
        //print out the total size of the arraylist
        System.out.println("The total size countries arraylist is " + countries.size());
        //add another print
        countries.add("CANADA");
        //print the new size of the arraylist
        System.out.println("The new size of countries arraylist is " + countries);
        //declare an integer arraylist
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //add values to student grades
        studentGrades.add(90);
        studentGrades.add(80);
        studentGrades.add(20);
        //print out the last students grade
        System.out.println("The third student grade is " + studentGrades.get(2));

    }//end of main
}// end of class
