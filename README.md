
# 📘 Attendance Management System (Java + JDBC)

A simple and modular Attendance Management System built using Java, OOP principles, JDBC, and MySQL.
This project allows you to manage students, record attendance, and view attendance reports using a menu-driven console interface.

---

## 📝 Overview
This project demonstrates:
- Core Java programming
- Object-Oriented Programming concepts
- Database connectivity using JDBC
- CRUD operations
- Layered architecture (DAO → Service → Main)
- MySQL relational database schema

The system supports:
✔ Add New Student  
✔ View All Students  
✔ Mark Attendance (Present/Absent)  
✔ View Attendance History for Each Student

---

## 🏗️ Project Structure
AttendanceManagementSystem/
│── src/
│   ├── dao/
│   │   ├── DBConnection.java
│   │   ├── StudentDAO.java
│   │   └── AttendanceDAO.java
│   ├── model/
│   │   ├── Student.java
│   │   └── Attendance.java
│   ├── service/
│   │   └── AttendanceService.java
│   └── Main.java
│
│── resources/
│   └── db.properties
│
│── docs/
│   └── presentation.pdf
│
│── attendance.sql
│── README.md
└── pom.xml (if using Maven)

---

## 🗄️ Database Schema (MySQL)

Create Database:
CREATE DATABASE attendance_db;
USE attendance_db;

Students Table:
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    course VARCHAR(100)
);

Attendance Table:
CREATE TABLE attendance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    date DATE,
    status VARCHAR(10),
    FOREIGN KEY(student_id) REFERENCES students(student_id)
);

---

## 🔧 JDBC Configuration (db.properties)
db.url=jdbc:mysql://localhost:3306/attendance_db  
db.username=root  
db.password=your_password  
db.driver=com.mysql.cj.jdbc.Driver

---

## ▶️ How to Run the Project

1. Clone the Repository  
git clone https://github.com/yourusername/AttendanceManagementSystem.git  
cd AttendanceManagementSystem

2. Configure the Database  
Run SQL file:  
mysql -u root -p attendance_db < attendance.sql  
Update db.properties with your credentials

3. Add MySQL Connector  
If using Maven:  
(Dependency in pom.xml)  
mysql-connector-j version 8.0.33  

If not using Maven:  
Download JAR and add to classpath manually

4. Run the Program  
javac Main.java  
java Main  
(or run from IDE like IntelliJ, Eclipse, NetBeans)

---

## 📸 Sample Output
===== Attendance Management System =====  
1. Add Student  
2. View Students  
3. Mark Attendance  
4. View Attendance  
5. Exit  
Enter choice:

---

## 💡 Features
- Simple CLI-based UI  
- Structured using OOP (Model–DAO–Service pattern)  
- Clean and modular code  
- Functional CRUD operations  
- Easy to extend (GUI/Servlet version possible)

---

## 🛠️ Technologies Used
- Java  
- JDBC  
- MySQL  
- Maven (optional)  
- OOP Concepts  
- SQL

---

## 📂 Documentation
Project presentation available at:  
/docs/presentation.pdf

---

## 👥 Team Members
AMANDEEP SINGH BHATIA – 24scse1011218 
YASH MISHRA – 24scse1010914 
YASH VARDHAN SINGH RANA – 24scse1010490  

---

## 📄 License
This project is for educational purposes only.
