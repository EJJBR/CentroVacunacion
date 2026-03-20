<div align="center">
  <h1>💉 SaluVax - Vaccination Center Management System</h1>
  <p>A comprehensive Java desktop application to streamline and manage the daily operations of a vaccination center.</p>

  <p>
    <img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
    <img src="https://img.shields.io/badge/Maven-C71A22?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
  </p>
</div>

---

## 📌 Overview

**SaluVax** was developed to digitize and optimize the workflows of a local vaccination center. Built with a focus on usability, security, and traceability, the system handles everything from role-based user authentication to patient vaccination histories, and real-time vaccine inventory administration. 

This project demonstrates foundational experience in **Object-Oriented Programming (OOP)**, **Relational Database Modeling**, and **Desktop UI/UX Design** using Java Swing.

## 🚀 Key Features

*   **Role-Based Access Control (RBAC):** Secure login system with customized dashboards and privileges for **Administrators**, **Medical Personnel**, and **Inventory Managers**.
*   **Patient Management:** Complete registration, search, and history tracking of vaccinated patients, including demographic data, specific vaccine batch numbers (lotes), and dosages applied.
*   **Inventory Control:** Real-time tracking of available (`vacunasdisponibles`) and used vaccines (`vacunasusadas`), guaranteeing precise stock levels and expiration date management.
*   **Modern User Interface:** Built using Java Swing with **FlatLaf** integration for a clean, modern, dark-mode compatible, and professional look. Date inputs are managed via `jcalendar`.
*   **Database Integration:** Robust data persistence using **MySQL** via JDBC (`mysql-connector-j`), featuring normalized tables and foreign key relationships.

## 🛠️ Tech Stack & Architecture

*   **Language:** Java 17
*   **UI Framework:** Java Swing + [FlatLaf](https://www.formdev.com/flatlaf/) + NetBeans AbsoluteLayout
*   **Database:** MySQL (MariaDB)
*   **Build Tool:** Apache Maven
*   **Architecture Pattern:** MVC-inspired desktop architecture with separation of concerns (`models`, `views`, `database`, `forms`).

## 📋 Database Schema Highlights
The system relies on a relational database design containing core entities such as:
- `usuarios`: Manages system access, authentication, and platform roles.
- `pacientevacunado`: Stores complete vaccination records and health details per patient.
- `vacunasdisponibles`: Operational inventory of the current stock of vaccines.
- `vacunasusadas`: Historical event log of applied vaccines for auditing.

## ⚙️ Setup & Installation

To run this project locally:

1. **Database Setup:**
   * Install and start a local MySQL Server (e.g., using XAMPP/WAMP).
   * Import the provided SQL dump: `BackUpCentroVacunacionPuntoDePartida.sql` to reconstruct the `centrovacunacion` database schema and mock data.
2. **Build and Run:**
   * Open the project in your preferred IDE (IntelliJ IDEA, Apache NetBeans, or Eclipse).
   * Resolve Maven dependencies automatically via `pom.xml`.
   * Run the main class: `com.mycompany.centrovacunacion.CentroVacunacion`.

---
*This project serves as a practical demonstration of full-stack desktop application development and database management.*
