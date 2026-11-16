/*
name:sammuel ubaldo
  course/section/year:BSIT NETSEC 1-1
  */

import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("jomar: ");
        String name = input.nextLine();

        System.out.print("blue: ");
        String color = input.nextLine();

        System.out.print("cat: ");
        String animal = input.nextLine();

        System.out.print("adobo: ");
        String food = input.nextLine();

        
        System.out.println("I had a dream that " + name + " ate a " 
                + color + " " + animal + " and said it tasted like " 
                + food + "!");

        input.close();
    }
}
