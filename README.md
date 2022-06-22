# Practical_Activity3
Business needs a customer management app. As a junior programmer, you are required to develop a Java program that allows customer management.
Your application will access a database named smtbiz on MySQL. This database has one table, customer.
o The customer table has 4 fields: Id, Name, Email and Mobile.
o When your application runs, there must be an option to create the database/table and 5 records.
 This option will be used when your program runs for the first time or when it needs to re-create the database.
 You are also required to provide your SQL statements for database creation in a text file. Name this file as smtbiz.sql.
o Your application must implement these features to do:
 Insert a new customer.
• No validity check is required. E.g. wrong format of email or mobile can be entered.
 Delete an existing customer.
 Search for a customer.
• A customer is searched by Id.
• If the customer is not found, the application shows a friendly message.
 Show all customers
• Display all customers.
 Update customer is not required for this task.
 Use the commit() method for database transaction integrity.
o Develop your application in MVC design pattern.
 For example, Model is the Customer objects from the database, View is your main application that provides UI and Control is another class (e.g. CustomerDAO) that acts as an interface between Model and View.
o Save your main class file as CustomerManagement.java.
