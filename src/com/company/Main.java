package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner appScanner = new Scanner(System.in);

        String fruits[] = new String[5];
        fruits[0] = "apple";
        fruits[1] = "avocado";
        fruits[2] = "banana";
        fruits[3] = "kiwi";
        fruits[4] = "orange";

        System.out.println(Arrays.toString(fruits));

        System.out.println("Which fruit would you like to get the index of");
        String searchFruit = appScanner.nextLine();
        String searchedFruit = searchFruit.toLowerCase().trim();
        int result = Arrays.binarySearch(fruits, searchedFruit);
        System.out.println("The index of " + searchedFruit + " is: " + result);

        HashMap<String, String> userA = new HashMap<>();
        userA.put("firstname", "John");
        userA.put("lastname", "Smith");

        HashMap<String, String> userB = new HashMap<>();
        userB.put("firstname", "Jane");
        userB.put("lastname", "Doe");

        System.out.println("user A:");
        System.out.println(userA);
        System.out.println("user B:");
        System.out.println(userA);

        ArrayList<HashMap<String, String>> Users = new ArrayList<HashMap<String, String>>();

        Users.add(userA);
        Users.add(userB);

        System.out.println(Users);

        System.out.println("What user id would you like to view the details?");
        int searchID = appScanner.nextInt();
        if(searchID <= Users.size()) {
            searchID -= 1;
            System.out.println(Users.get(searchID));
        } else {
            System.out.println("User not available.");

        }
    }
}
