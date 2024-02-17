/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class paymentSQL {

    connect_database con = connect_database.getInstance();

    public ArrayList<bookPrice> selectPriceSQl(int order_id) {
        ArrayList<bookPrice> booksPrice = new ArrayList<bookPrice>();
        try {
            ResultSet rs = con.retrivedata("select b.price from book b join orders_books ob on ob.book_id = b.id and ob.order_id ='"
                    + order_id + "'");
            while (rs.next()) {
                Float price = rs.getFloat(1);
                booksPrice.add(new bookPrice(price));
            }
        } catch (SQLException ex) {
            Logger.getLogger(paymentSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booksPrice;
    }

    public void updateBookSQL(int order_id) {
        try {
            ResultSet rs = con.retrivedata("SELECT b.id, b.available_units, b.status FROM book b JOIN orders_books ob WHERE ob.book_id = b.id AND ob.order_id = '" + order_id + "'");

            ArrayList<Object[]> updates = new ArrayList<>();

            while (rs.next()) {
                int book_id = rs.getInt(1);
                int book_units = rs.getInt(2);
                String book_status = rs.getString(3);

                book_units--;

                if (book_units == 0) {
                    book_status = "OutOfStock";
                }

                // Store data for update in an Object array
                Object[] updateData = {book_id, book_units, book_status};
                updates.add(updateData);
            }

            // Now iterate over the collected data and perform updates
            for (Object[] update : updates) {
                int bookId = (int) update[0];
                int bookUnits = (int) update[1];
                String bookStatus = (String) update[2];

                con.queurydata("UPDATE book SET available_units = '" + bookUnits + "', status = '" + bookStatus + "' WHERE id = '" + bookId + "'");
            }

        } catch (SQLException ex) {
            Logger.getLogger(paymentSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateOrderSQL(int order_id, float total) {
        try {
            con.queurydata("UPDATE `order` SET status = 'pending', totalPrice = '" + total + "' WHERE id = '" + order_id + "'");
        } catch (SQLException ex) {
            Logger.getLogger(paymentSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
