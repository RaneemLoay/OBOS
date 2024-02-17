/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author DELL
 */
public class bookObject {
    
    private int id;
    private int available_units;
    private String status;
    private float price;

    public int getId() {
        return id;
    }

    public bookObject(int id, int available_units, String status, float price) {
        this.id = id;
        this.available_units = available_units;
        this.status = status;
        this.price = price;
    }


    public int getAvailable_units() {
        return available_units;
    }


    public String getStatus() {
        return status;
    }

    public float getPrice() {
        return price;
    }
 
}
