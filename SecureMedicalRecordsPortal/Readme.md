# 🩺 Secure Medical Records Portal

A Spring Boot-based RESTful web application designed for managing patient medical records. This project provides a secure and scalable backend service for storing, retrieving, and managing patient data with full CRUD operations.

![Java](https://img.shields.io/badge/Java-11-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-orange)
![Status](https://img.shields.io/badge/Status-Completed-success)

---

## 📸 Output Screenshots

| Add Patient | Get All Patients |
|-------------|------------------|
| ![Add Patient](https://github.com/mpranav38/-Secure-Medical-Records-Portal/blob/main/SecureMedicalRecordsPortal/Output%20screenshots/Screenshot%202025-04-19%20130747.png) | ![Get All](https://github.com/mpranav38/-Secure-Medical-Records-Portal/blob/main/SecureMedicalRecordsPortal/Output%20screenshots/Screenshot%202025-04-19%20130556.png) |

For all screenshots 👉 [View Full Output Folder](https://github.com/mpranav38/-Secure-Medical-Records-Portal/tree/main/SecureMedicalRecordsPortal/Output%20screenshots)

---

## 🚀 Features

- Create, read, update, and delete (CRUD) patient records
- RESTful API endpoints with JSON responses
- JPA & Hibernate-based persistence
- Database auto-creation on startup
- Integration-ready backend service for frontend/mobile clients

---

## 🛠️ Technologies Used

- **Java 11**
- **Spring Boot 3.2**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **Postman (for API testing)**

---

## 📂 Project Structure

```
SecureMedicalRecordsPortal
├── controller
│   └── PatientController.java
├── model
│   └── Patient.java
├── repository
│   └── PatientRepository.java
├── service
│   └── PatientService.java
├── resources
│   └── application.properties
└── SecureMedicalRecordsPortalApplication.java
```

---

## ⚙️ How to Run

1. Clone this repo:
   ```bash
   git clone https://github.com/mpranav38/-Secure-Medical-Records-Portal.git
   cd SecureMedicalRecordsPortal
   ```

2. Create the MySQL database:
   ```sql
   CREATE DATABASE medicaldb;
   ```

3. Update `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/medicaldb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```

4. Run the app:
   ```bash
   mvn spring-boot:run
   ```

5. Test endpoints (e.g., with Postman):
   - `GET /api/patients`
   - `POST /api/patients`
   - `PUT /api/patients/{id}`
   - `DELETE /api/patients/{id}`

---

## 📌 API Example

**POST** `/api/patients`
```json
{
  "name": "Alice Johnson",
  "age": 34,
  "gender": "Female",
  "diagnosis": "Asthma"
}
```

---

## ✨ Future Enhancements

- 🔐 JWT-based login & role access (admin, doctor, patient)
- 📊 Swagger API documentation
- 🖥️ React or Angular frontend
- 🐳 Docker container support

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

**Author:** Pranav Murali  
**GitHub:** [mpranav38](https://github.com/mpranav38)


