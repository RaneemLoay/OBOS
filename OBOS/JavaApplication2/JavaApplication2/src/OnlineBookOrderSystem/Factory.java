/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author tarik
 */
public class Factory {
    
   public Dashboard GetDashBoard(String Type){
        
       if(Type.equalsIgnoreCase("admin")){
          new AdminForm().setVisible(true);
       }
       else  {
         new Home().setVisible(true);
        
       }
       return null;
        
    }
}
