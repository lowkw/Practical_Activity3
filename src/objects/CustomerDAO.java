package objects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {

    public static void updateCustomerMobile(int id, String mobile) {
        String updateSQL = String.format("UPDATE customer SET `Mobile` = '%s' WHERE Id = '%d';", mobile, id);
        int count = DBUtil.executeUpdate(updateSQL);

        if (count == 0) {
            System.out.println("Error. Failed to update customer record !!!");
        } else {
            System.out.println("Customer updated.");
        }
    }

    public static void insertCustomer(int id, String name, String email, String mobile) {
        String insertSQL = String.format("INSERT INTO customer (Id, Name, Email, Mobile) VALUES ('%d','%s','%s','%s');", id, name, email, mobile);
        int count = DBUtil.executeUpdate(insertSQL);

        if (count == 0) {
            System.out.println("Error. Failed to add customer record !!!");
        } else {
            System.out.println("A new customer record added.");
        }
    }

    public static void deleteCustomer(int id) {
        String deleteSQL = String.format("DELETE FROM customer where Id= '%d';", id);
        int count = DBUtil.executeUpdate(deleteSQL);

        if (count == 0) {
            System.out.println("Error. Failed to delete customer record !!!");
        } else {
            System.out.println("Customer record deleted.");
        }
    }

    public static CustomerModel searchCustomerById(int id) {
        String query = String.format("SELECT * FROM customer WHERE Id= '%d';", id);
        CustomerModel customer = null;

        try {
            ResultSet rs = DBUtil.executeQuery(query);

            if (rs.next()) {
                customer = new CustomerModel(rs.getInt("Id"), rs.getString("Name"), rs.getString("Email"), rs.getString("Mobile"));
            } else {
                return customer;
            }
        } catch (SQLException ex) {
            System.out.println("SQL Exception on executeQuery: " + ex.getMessage());
        }

        return customer;
    }

    public static ArrayList<CustomerModel> getAllCustomers() {
        String query = "SELECT * FROM customer;";
        ArrayList<CustomerModel> cusmodl = new ArrayList<>();

        try {
            ResultSet rs = DBUtil.executeQuery(query);

            while (rs.next()) {
                CustomerModel customer = new CustomerModel(rs.getInt("Id"), rs.getString("Name"), rs.getString("Email"), rs.getString("Mobile"));
                cusmodl.add(customer);
            }
        } catch (SQLException ex) {
            System.out.println("SQL Exception on executeQuery" + ex.getMessage());
        }
        return cusmodl;
    }
}
