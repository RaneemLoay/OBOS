/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author DELL
 */
public class creditcardStrategy implements paymentStrategy {

    @Override
    public void pay(double price) {
    System.out.println("payed with credit card total = "+ price);   
    }

}