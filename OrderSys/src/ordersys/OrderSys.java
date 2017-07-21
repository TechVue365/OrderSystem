/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersys;
import java.util.Scanner;
/**
 *
 * @author Andrew Leo
 */
public class OrderSys {

   

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
    Scanner order = new Scanner(System.in);
    Scanner bevchoice = new Scanner(System.in);
    customer cust1 = new customer();
    System.out.println("WHAT WOULD YOU LIKE TO EAT?");
    String order1 = order.nextLine();
    String orders;  
    orders = order1;
    cust1.order=order1;  //order1 stores var to order
    cust1.OrderNo(1);
    //New Beverage
     System.out.println("Choose Your Beverage");
        System.out.println("Number 1 is COLA");
        System.out.println("Number 2 is FANTA");
        System.out.println("Number 3 is SPRITE");
      int bevchoice1 = bevchoice.nextInt();
      
      System.out.println("Your Order No. is "+cust1.getOrderNo());
     switch(bevchoice1){
         case 1: System.out.println("Your beverage is Cola");
         break;
         case 2: System.out.println("Your beverage is Fanta");
         break;
         case 3: System.out.println("Your beverage is Sprite");
                 
     } 
     System.out.println("Your Order is " + cust1.getOrder());

    }
    
}
