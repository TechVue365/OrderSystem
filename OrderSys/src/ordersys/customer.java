/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersys;

/**
 *
 * @author Andrew Leo
 */

public class customer {
    public int order_no;
    public String order;
    
   public customer(){
       
       order_no=1;
    }
  
     public void OrderNo(int changeorderno){
        order_no=order_no+changeorderno;
    }
   
 public int getOrderNo(){
        return order_no;
    }
 
  public String getOrder(){
        return order;
    }
    }
   
