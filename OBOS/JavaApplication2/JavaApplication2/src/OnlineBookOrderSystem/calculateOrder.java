/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class calculateOrder {
    
    ArrayList<bookPrice> booksPrice ;

    public calculateOrder() {
        this.booksPrice=new ArrayList<bookPrice>();
    }

     public double calcTotalPrice() 
     {
         double sum=0;
         for(bookPrice c:booksPrice)
         {
             sum+=c.getPrice();
         }
         return sum;
     }

     public void payTotal(paymentStrategy p)
     {
         double amount=calcTotalPrice();
         p.pay(amount);
     }
    
}
