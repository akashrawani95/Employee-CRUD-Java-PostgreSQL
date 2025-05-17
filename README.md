Employee-CRUD-Java-PostgreSQL
A simple Java application that performs CRUD (Create, Read, Update, Delete) operations on an Employee table using JDBC and PostgreSQL. The project includes user input through the console, connection management using JDBC, and interaction with a PostgreSQL database for storing employee details like ID, name, age, and salary.





# Employee-CRUD-Java-PostgreSQL

This is a basic console-based Java application that performs CRUD operations on an `Employee` table using **JDBC** and **PostgreSQL**.

## 🛠️ Technologies Used
- Java (Core)
- JDBC
- PostgreSQL
- pgAdmin (for database UI)

## 📋 Features
- Add employee details to the database
- View employee records (to be added)
- Update and delete employee records (optional future work)
- Simple JDBC code for beginners

## 🧾 Database Table: employee

| Column Name | Data Type         |
|-------------|-------------------|
| id          | integer (Primary Key) |
| name        | varchar            |
| age         | integer            |
| salary   |	double precision           |

## 🔌 How to Run
1. Make sure PostgreSQL is running.
2. Create the `employee` table as shown above.
3. Update the DB credentials in `Employee_Service.java`.
4. Run the `Employee_Driver.java` class.

---
