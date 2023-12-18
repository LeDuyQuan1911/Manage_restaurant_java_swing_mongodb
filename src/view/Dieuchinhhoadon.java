/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author kevin
 */
public class Dieuchinhhoadon extends javax.swing.JFrame {
      private String billID;
     private Adminqualyhoadon adminqualyhoadon;



    
   public Dieuchinhhoadon(String billID1) {
    initComponents();
    this.billID = billID1;
    this.adminqualyhoadon = adminqualyhoadon; // Store the reference
    loadBillDetails(billID);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id_Bill");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Số bàn", "Tên Món Ăn", "Số lượng", "Giá", "Date", "Tình Trạng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Tổng Tiền :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Xác nhận sửa hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    // TODO add your handling code here:
    String enteredBillID = jTextField2.getText().trim(); // Trim to remove leading/trailing spaces

    // Check if enteredBillID is not empty
    if (!enteredBillID.isEmpty()) {
        // Parse the enteredBillID to ObjectId
        ObjectId objectId;
        try {
            objectId = new ObjectId(enteredBillID);

            // Load bill details directly with the enteredBillID
            loadBillDetails(enteredBillID);
        } catch (IllegalArgumentException e) {
            // Handle invalid ObjectId (optional)
            System.err.println("Invalid ObjectId format: " + enteredBillID);
            // You may want to show a message dialog to inform the user about the invalid input
            JOptionPane.showMessageDialog(this, "Invalid ObjectId format: " + enteredBillID, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // Iterate over the table rows and update the quantities in the database
    for (int row = 0; row < jTable1.getRowCount(); row++) {
        int tableNumber = (int) jTable1.getValueAt(row, 0);
        String foodName = (String) jTable1.getValueAt(row, 1);
        // Parse the quantity value as an integer
        int newQuantity = Integer.parseInt(jTable1.getValueAt(row, 2).toString());

        // Update the quantity in the database
        updateQuantityInDatabase(tableNumber, foodName, newQuantity);
    }

    JOptionPane.showMessageDialog(null, "Hóa đơn đã được cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
 // Call the refresh method in Adminqualihoadon
    Adminqualyhoadon adminqualihoadon = new Adminqualyhoadon();
    adminqualihoadon.refreshTableData();

    // Close the current frame
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
        
private void loadBillDetails(String billID) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing data

    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> billCollection = database.getCollection("bill");

        // Find the bill document by its _id
        Bson filter = Filters.eq("_id", new ObjectId(billID));
        Document billDocument = billCollection.find(filter).first();

        if (billDocument != null) {
            // Extract necessary information from the billDocument and populate the table
            int tableNumber = billDocument.getInteger("table_number");
            jTextField2.setText(billID); // Set the bill ID in the text field

            // Get the order array and iterate over each item to add rows to the table
            List<Document> orderList = (List<Document>) billDocument.get("order");
            for (Document orderItem : orderList) {
                int foodId = orderItem.getInteger("foodId");
                int quantity = orderItem.getInteger("quantity");

                // Add a row to the table model
                model.addRow(new Object[]{tableNumber, getFoodNameById(foodId), quantity, getPriceById(foodId), "", billDocument.getString("payment_status")});
            }

            // Set the total price in the JTextField
            jTextField1.setText(String.valueOf(billDocument.getEmbedded(List.of("bill", "total_price"), Integer.class)));

            // Get the index of the last row added to the table
            int rowIndex = model.getRowCount() - 1;

            // Set the date in the table (assuming date column is at index 4)
            Document billInfo = billDocument.get("bill", Document.class);
            if (billInfo != null) {
                Object billDate = billInfo.get("bill_date");
                String formattedDate = (billDate != null) ? billDate.toString() : ""; // Check for null
                model.setValueAt(formattedDate, rowIndex, 4);
            } else {
                System.out.println("Bill information not found for ID: " + billID);
            }
        } else {
            System.out.println("Bill not found for ID: " + billID);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading bill details. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


private String getFoodNameById(int foodId) {
    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> foodCollection = database.getCollection("food");

        // Find the food document by its foodId
        Bson filter = Filters.eq("foodId", foodId);
        Document foodDocument = foodCollection.find(filter).first();

        if (foodDocument != null) {
            // Extract the foodName from the foodDocument
            return foodDocument.getString("foodName");
        } else {
            System.out.println("Food not found for ID: " + foodId);
            return "Unknown Food";
        }
    } catch (Exception e) {
        e.printStackTrace();
        return "Unknown Food";
    }
}
private void updateQuantityInDatabase(int tableNumber, String foodName, int newQuantity) {
    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> billCollection = database.getCollection("bill");

        // Find the bill document by its _id and the foodName in the order
        Bson filter = Filters.and(
                Filters.eq("_id", new ObjectId(billID)),
                Filters.eq("table_number", tableNumber),
                Filters.elemMatch("order", Filters.eq("foodId", getFoodIdByName(foodName)))
        );

        // Update the quantity in the order array
        Bson update = new Document("$set", new Document("order.$.quantity", newQuantity));

        // Perform the update operation
        billCollection.updateOne(filter, update);

        // Update the total price based on the new quantity
        updateTotalPrice(billID);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating quantity in the database. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void updateTotalPrice(String billID) {
    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> billCollection = database.getCollection("bill");

        // Find the bill document by its _id
        Bson filter = Filters.eq("_id", new ObjectId(billID));
        Document billDocument = billCollection.find(filter).first();

        if (billDocument != null) {
            // Update the total price based on the updated quantities
            List<Document> orderList = (List<Document>) billDocument.get("order");
            int newTotalPrice = orderList.stream()
                    .mapToInt(orderItem -> {
                        int foodId = orderItem.getInteger("foodId");
                        int quantity = orderItem.getInteger("quantity");
                        return getPriceById(foodId) * quantity;
                    })
                    .sum();

            // Update the total price in the bill document
            Bson updateTotalPrice = new Document("$set", new Document("bill.total_price", newTotalPrice));
            billCollection.updateOne(filter, updateTotalPrice);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating total price in the database. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private int getFoodIdByName(String foodName) {
    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> foodCollection = database.getCollection("food");

        // Find the food document by its foodName
        Bson filter = Filters.eq("foodName", foodName);
        Document foodDocument = foodCollection.find(filter).first();

        if (foodDocument != null) {
            // Extract the foodId from the foodDocument
            return foodDocument.getInteger("foodId");
        } else {
            System.out.println("Food not found for name: " + foodName);
            return -1; // Return a default value or handle the case where food is not found
        }
    } catch (Exception e) {
        e.printStackTrace();
        return -1; // Return a default value or handle the exception
    }
}

private int getPriceById(int foodId) {
      try (MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/test")) {
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> foodCollection = database.getCollection("food");

        // Find the food document by its foodId
        Bson filter = Filters.eq("foodId", foodId);
        Document foodDocument = foodCollection.find(filter).first();

        if (foodDocument != null) {
            // Extract the price from the foodDocument
            Object priceObject = foodDocument.get("price");
            
            if (priceObject instanceof Integer) {
                return (int) priceObject;
            } else if (priceObject instanceof String) {
                // Try parsing the String to an Integer
                try {
                    return Integer.parseInt((String) priceObject);
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing price: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Food not found for ID: " + foodId);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return 0; // Default to 0 in case of an exception or if price is not found
}
  



public static void main(String args[]) {
    /* Create and display the form */
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            // Replace "yourBillIDValue" with the actual bill ID value you want to pass
            String billID = "";
            new Dieuchinhhoadon(billID).setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}