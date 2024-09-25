package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 

        double tipAmount = cost*(.01*percent);
        tipAmount = Math.round(tipAmount*100.0)/100.0; //I learned this from https://stackoverflow.com/questions/11832914/how-to-round-to-at-most-2-decimal-places-if-necessary

        double costPerPerson = cost / people;
        costPerPerson = Math.round(costPerPerson*100.0)/100.0;

        double tipPerPerson = tipAmount / people;
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;

        double totalCostPerPerson = ((cost+tipAmount)/people)-.000001;
        totalCostPerPerson = Math.round(totalCostPerPerson*100.0)/100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: " + percent + "%");
        result.append("\n");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("\n");
        result.append("Total Bill with tip: " + "$" + (cost + tipAmount));
        result.append("\n");
        result.append("Per person cost before tip: " + "$" + costPerPerson);
        result.append("\n");
        result.append("Tip per person: " + "$" + tipPerPerson);
        result.append("\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson);
        result.append("\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        //Your scanner object and while loop should go here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an item name or type '-1' to finish: ");
        String character = scan.nextLine();

        if(!"-1".equals(character)){
            items += character; //adding the food item to the item variable, and then spacing it out using \n.
            items += "\n";
        }
    
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (!"-1".equals(character)) //Learned "equals" line from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java/513839#513839. 
        {
            System.out.print("Enter an item name or type '-1' to finish: ");
            character = scan.nextLine();
            if(!"-1".equals(character)){
                items += character; 
                items+= "\n";
            }
        }
    
        
    
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
