/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author DELL
 */
public class globalValue {
    
    private static globalValue global=null;
    private int user_id;
    private int book_id_review;
    private int order_id_payment;

    public int getOrder_id_payment() {
        return order_id_payment;
    }

    public void setOrder_id_payment(int order_id_payment) {
        this.order_id_payment = order_id_payment;
    }
    private boolean logedin = false;

    public boolean isLogedin() {
        return logedin;
    }

    public void setLogedin(boolean logedin) {
        this.logedin = logedin;
    }
    public int getBook_id_review() {
        return book_id_review;
    }

    public void setBook_id_review(int book_id_review) {
        this.book_id_review = book_id_review;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
         this.user_id = user_id;
    }
     
    private globalValue(){         
    }
    
    public static globalValue getInstance(){
        if(global == null){
               global= new globalValue();
        }
         return global;
        
     
    }
    
}
