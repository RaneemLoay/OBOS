/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author DELL
 */
public class pay {

    private calculateOrder claculate_order ;
    public pay(calculateOrder c) {
       claculate_order = c;
    }

    public void paymentOperation(String paymentmethod){
        if(paymentmethod.equals("Cash")){
             claculate_order.payTotal(new cashStrategy());
        }
        else if (paymentmethod.equals("PayPal")){
          claculate_order.payTotal(new paypalStrategy());
        }
        else {
            claculate_order.payTotal(new creditcardStrategy());
        }
    }
    
}
  
