/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
import java.time.LocalDate;
public class retirement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int age, retire_age, current_year, years_left;
        current_year = date.getYear(); //get date from system
        System.out.println("What is your current age?");
        age = sc.nextInt();
        System.out.println("At what age would you like to retire?");
        retire_age = sc.nextInt();
        years_left = retire_age-age;
        System.out.println(String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.",(years_left),current_year,(current_year+years_left)));

    }
}