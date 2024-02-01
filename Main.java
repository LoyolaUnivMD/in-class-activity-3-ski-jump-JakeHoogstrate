// Programmer: Jake
// Course:  CS 212
// Due Date: 2/1/24
// Class Assignment 3
// Problem Statement: Calculate score for ski jump
// Data In: Type of jump and speed
// Data Out: Score

//Imports
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

class Main {
    public static void main(String[] args) {

    //Create objects
    Scanner input = new Scanner(System.in);
    NumberFormat myformat = NumberFormat.getInstance();

    //get inputs
    System.out.println("What size jump? normal/large");
    String jumpsize = input.next();
    System.out.println("What was your speed? (in m/s)");
    double speed = input.nextDouble();

    //calculations for normal jump height
    if (jumpsize.equals("normal")){
        int height = 46;
        int par = 90;
        double points_per_meter = 2;
        double time_in_air= Math.sqrt((2*height)/9.8);
        double distance = speed*time_in_air;
        double points = 60 + (distance - par)*points_per_meter;
        System.out.println("You traveled "+myformat.format(distance)+" meters.");
        System.out.println("You scored "+myformat.format(points)+" points.");
        if (points >=61) {
            System.out.println("Great job for doing better than par!");
        }else if (points <10){
                System.out.println("What happened??");
            }
            else{
                System.out.println("Sorry you didn't go very far");
            }

    }
    //calculations for large jump height
    if (jumpsize.equals("large")){
        int height = 70;
        int par = 120;
        double points_per_meter = 1.8;
        double time_in_air= Math.sqrt((2*height)/9.8);
        double distance = speed*time_in_air;
        double points = 60 + (distance - par)*points_per_meter;
        System.out.println("You traveled "+myformat.format(distance)+" meters.");
        System.out.println("You scored "+myformat.format(points)+" points.");
        if (points >=61) {
            System.out.println("Great job for doing better than par!");
        }else if (points <10){
                System.out.println("What happened??");
            }
            else{
                System.out.println("Sorry you didn't go very far");
            }
    }




    }}











