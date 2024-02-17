/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class checkoutFacade {
    
    private pay pay; 
    private bookObject book;
    private paymentSQL sql;
    private int orderID;
    public checkoutFacade(calculateOrder c ) {
        pay = new pay(c);       
         sql = new paymentSQL();
        orderID = globalValue.getInstance().getOrder_id_payment();
        c.booksPrice=sql.selectPriceSQl(orderID);
    }
    public void CheckOutUsingFacade( String paymentMethod,float total){      
        sql.updateBookSQL(orderID);
        sql.updateOrderSQL(orderID, total);
        pay.paymentOperation(paymentMethod);
          JOptionPane.showMessageDialog(null, "Check Out Successfully");
    }
    
}
