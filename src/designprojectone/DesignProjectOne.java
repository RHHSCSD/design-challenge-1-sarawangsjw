/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program:TechFairCostCalculator
*  Author:Sara Wang
*  Date: 
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*
*
*PROCESSING:
*
*
*
*OUTPUT:
*
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Output
*
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS

  //VARIABLES
    
  //CODE
        Scanner student = new Scanner(System.in);
        
        //Get number of students that chose arduino from user
        System.out.println("Enter number of students that chose the Arduino Project:");
        int stuArd = student.nextInt();    
        
        //Get number of students that chose raspberry from user
        System.out.println("Enter number of students that chose the Raspberry PI Project:");
        int stuRas = student.nextInt();
        
        //Get number of students that chose VR from user
        System.out.println("Enter number of students that chose the VR Project:");
        int stuVR = student.nextInt();
        
        //Add number of students that chose arduino, number of students that chose raspberry, number of students that chose VR to get total number of students
        int stuTot = stuArd + stuRas + stuVR;
              
        //Get fixed cost
        double costFix;
        //If total number of students is greater than 100, multiple total number of students by 50 to get fixed cost
        //If total number of students is less than 100, multiple total number of students by 50 and then multiple it by 0.95 to get fixed cost
        if (stuTot > 100) {
            costFix = (stuTot * 50) * 0.95; 
        } else {
            costFix = stuTot * 50;
        }
        
        //Get arduino cost
        double costArd;
        //If number of students that chose arduino is greater than 15, multiple number of students that chose arduino by 9 to get arduino cost
        //If number of students that chose arduino is less than 15, multiple number of students that chose arduino by 10 to get arudino cost
        if (stuArd > 15) {
            costArd = stuArd * 9;
        } else {
            costArd = stuArd * 10;
        }
        
        //Get raspberry cost
        double costRas;
        //If number of students that chose raspberry is greater than 20, multiple number of students that chose raspberry by 12 to get raspberry cost
        //If number of students that chose raspberry is less than 20, multiple number of students that chose raspberry by 15 to get raspberry cost
        if (stuRas > 20) {
            costRas = stuRas * 12;
        } else {
            costRas = stuRas * 15;
        }
        
        //Multiple number of students that chose VR by 20 to get VR cost
        double costVR = stuVR * 20;
        
        //Add fixed cost, arduino cost, raspberry pi cost, and VR cost to get total cost
        double costTot = costFix + costArd + costRas + costVR;
        //Divide total cost by total number of students to get individual cost
        double costInd = costTot/stuTot;
        
        System.out.println("Material cost for each student participating in the science fair:");
        System.out.println(costInd);
    }
    
}
