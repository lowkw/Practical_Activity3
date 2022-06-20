package customermanagement;

import java.util.ArrayList;
import objects.*;

public class CustomerManagement {

    public static void main(String[] args) {
        System.out.println("Creating smtbiz database. ");
        System.out.println("");
        CreateDatabase.createSmtbiz();

        System.out.println("List all customer records.");
        ArrayList<CustomerModel> customers = CustomerDAO.getAllCustomers();
        displayCustomer(customers);
        System.out.println("");

        System.out.println("Update mobile number of Bill Gates.");
        CustomerDAO.updateCustomerMobile(333333, "+1 8880888");
        customers = CustomerDAO.getAllCustomers();
        displayCustomer(customers);
        System.out.println("");

        System.out.println("Insert new customer Mark Zuckerberg.");
        CustomerDAO.insertCustomer(666666, "Mark Zuckerberg", "mark.zuckerberg@facebook.com", "+1 6660666");
        customers = CustomerDAO.getAllCustomers();
        displayCustomer(customers);
        System.out.println("");

        System.out.println("Query customer by Id \"555555\". ");
        CustomerModel customer = CustomerDAO.searchCustomerById(555555);
        if (customer != null) {
            System.out.printf("%6d %20s %30s %10s\n", customer.getId(), customer.getName(), customer.getEmail(), customer.getMobile());
            System.out.println("");
        } else {
            System.out.println("Customer Id 555555 record not found !");
            System.out.println("");
        }

        System.out.println("Query customer by Id \"777777\". ");
        customer = CustomerDAO.searchCustomerById(777777);
        if (customer != null) {
            System.out.printf("%6d %20s %30s %10s\n", customer.getId(), customer.getName(), customer.getEmail(), customer.getMobile());
            System.out.println("");
        } else {
            System.out.println("Customer Id 777777 record not found !");
            System.out.println("");
        }

        System.out.println("Delete customer Steve Jobs. ");
        CustomerDAO.deleteCustomer(111111);
        customers = CustomerDAO.getAllCustomers();
        displayCustomer(customers);
        System.out.println("");

        System.out.println("Again. Delete customer Steve Jobs. ");
        CustomerDAO.deleteCustomer(111111);
        customers = CustomerDAO.getAllCustomers();
        displayCustomer(customers);
        System.out.println("");
    }

    public static void displayCustomer(ArrayList<CustomerModel> customers) {
        if (customers.isEmpty()) {
            System.out.println("Error. No customers found !");
            return;
        }

        System.out.printf("%6s %20s %30s %10s\n ", "Id", "Name", "Email", "Mobile");
        System.out.print("----- ");
        System.out.print("-------------------- ");
        System.out.print("------------------------------ ");
        System.out.println("---------- ");
        for (CustomerModel cusmod : customers) {
            int id = cusmod.getId();
            String name = cusmod.getName();
            String email = cusmod.getEmail();
            String mobile = cusmod.getMobile();
            System.out.printf("%6d %20s %30s %10s\n", id, name, email, mobile);
        }
    }

}
