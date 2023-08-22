package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<int[]> intervalsList = new ArrayList<>();
        int startingInterval = 0;
        int endingInterval = 0;

        while(true){
            System.out.println("Enter new Intervals");
            try{
                String firstString = scanner.next();
                String lastString = scanner.next();

                int first = Integer.parseInt(firstString);
                int last = Integer.parseInt(lastString);
                intervalsList.add(new int[]{first,last});

            }catch(Exception e){
                System.out.println("You are an idiot");
                continue;
            }
            System.out.println("Your intervals are:");
            for(int[] arr: intervalsList){
                System.out.print("[" + arr[0] + "," + arr[1] + "] ");
            }
            System.out.println("\nWant a new Interval(Y/y)?");
            if(!scanner.next().equalsIgnoreCase("y")){
                break;
            }
        }


    }
}