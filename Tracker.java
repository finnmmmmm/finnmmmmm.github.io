import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Tracker {

    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        ArrayList<String> breakfastItems = new ArrayList<String>();
        ArrayList<Integer> breakfastProtein = new ArrayList<Integer>();

        System.out.println("What did you eat for breakfast? ");
        String breakfast = input.nextLine();
        System.out.println("What was the total protein content of breakfast? ");
        Integer breakfastProteinContent = input.nextInt();
        breakfastItems.add(breakfast);
        breakfastProtein.add(breakfastProteinContent);



    }

}