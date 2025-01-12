# 🌐📚 Distributed JEE Application with EJB and JPA

This project demonstrates the implementation of a distributed Java EE application using EJB3, JPA, and MySQL. The goal is to create a modular and scalable system that manages student data with full CRUD operations.

---

## 🎯 Objective

To practice and implement a distributed JEE application by leveraging **EJB3**, **JPA**, and **WildFly**. The application performs CRUD operations on student data stored in a MySQL database.

---

## 🚀 Features

- **Distributed Architecture**: EJB Session Beans for modular and reusable components.
- **CRUD Operations**: Full management of student data (create, read, update, delete).
- **Database Integration**: Persistent storage with JPA and MySQL.
- **Dynamic Web Application**: Servlet-based frontend consuming remote EJB methods.
- **Standards-Compliant**: Built with Jakarta EE standards, ensuring portability and scalability.

---

## 🛠️ Tools & Technologies

| Technology      | Purpose                          |
|------------------|----------------------------------|
| **EJB3**        | Business logic with Session Beans |
| **JPA**         | Database persistence layer       |
| **MySQL**       | Relational database management   |
| **WildFly**     | Application server               |
| **IntelliJ IDEA** | Development environment         |
| **Maven**       | Dependency management and build  |

---

## 📂 Project Structure

```plaintext
src/
├── ejb/
│   ├── META-INF/
│   │   ├── persistence.xml          # Persistence configuration
│   ├── com.example.ejb/
│   │   ├── Etudiant.java            # JPA Entity for students
│   │   ├── EtudiantSessionBean.java # EJB Session Bean for CRUD
│   │   ├── EtudiantRemote.java      # Remote interface
├── web/
│   ├── WEB-INF/
│   │   ├── web.xml                  # Web application configuration
│   ├── com.example.web/
│   │   ├── AddStudentServlet.java   # Servlet for adding a student
│   │   ├── ViewStudentServlet.java  # Servlet for viewing students
│   │   ├── UpdateStudentServlet.java # Servlet for updating a student
│   │   ├── DeleteStudentServlet.java # Servlet for deleting a student


```

## ⚙️ Setup & Installation
Prerequisites :
- **Java 11+ installed.**
- **Maven for project management.**
- **MySQL with a database named Getudiants.**


## Steps to Run

- **Clone the Repository:**
```bash
git clone https://github.com/YourUsername/Distributed-JEE-Application.git
cd Distributed-JEE-Application
Set Up the Database:
```


- **Create a MySQL database:**
  
CREATE DATABASE Getudiants;
Update persistence.xml with your MySQL credentials:

```bash
<property name="hibernate.connection.username" value="your-username" />
<property name="hibernate.connection.password" value="your-password" />
Deploy the EJB Module:
```

# **Package the EJB project using Maven:**
```bash
mvn clean package
```

- **Deploy the EJB JAR to your WildFly server:**

Deploy the Web Module
Package the web project using Maven:
```bash
mvn clean package
```

- **Deploy the WAR file to WildFly:**
Access the Application:

Open your browser and navigate to the web application:
```bash
http://localhost:8080/your-webapp-context
```
