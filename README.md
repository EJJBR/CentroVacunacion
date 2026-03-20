<div align="center">
  <h1>💉 SaluVax - Sistema de Gestión para Centro de Vacunación</h1>
  <p>Una aplicación de escritorio integral en Java para optimizar y administrar las operaciones diarias de un centro de vacunación.</p>

  <p>
    <img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
    <img src="https://img.shields.io/badge/Maven-C71A22?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
  </p>
</div>

---

## 📌 Descripción General

**SaluVax** fue desarrollado para digitalizar y optimizar los flujos de trabajo de un centro de vacunación local. Construido con un enfoque en la usabilidad, seguridad y trazabilidad, el sistema maneja desde la autenticación de usuarios basada en roles, hasta el historial de vacunación de pacientes y la administración del inventario de vacunas en tiempo real.

Este proyecto demuestra experiencia fundamental en **Programación Orientada a Objetos (POO)**, **Modelado de Bases de Datos Relacionales** y **Diseño de UI/UX para Escritorio** utilizando Java Swing.

## 🚀 Características Principales

*   **Control de Acceso Basado en Roles (RBAC):** Sistema de inicio de sesión seguro con paneles y privilegios personalizados para **Administradores**, **Personal Médico** y **Gestores de Inventario**.
*   **Gestión de Pacientes:** Registro completo, búsqueda y seguimiento del historial de pacientes vacunados, incluyendo datos demográficos, números de lote de vacunas específicas y dosis aplicadas.
*   **Control de Inventario:** Seguimiento en tiempo real de vacunas disponibles (`vacunasdisponibles`) y usadas (`vacunasusadas`), garantizando niveles de stock precisos y gestión de fechas de caducidad.
*   **Interfaz de Usuario Moderna:** Construida utilizando Java Swing con integración de **FlatLaf** para un aspecto limpio, moderno, alineado a las tendencias actuales y profesional. Las entradas de fecha se gestionan mediante `jcalendar`.
*   **Integración de Base de Datos:** Persistencia de datos robusta utilizando **MySQL** a través de JDBC (`mysql-connector-j`), presentando tablas normalizadas y relaciones de claves foráneas.

## 🛠️ Stack Tecnológico y Arquitectura

*   **Lenguaje:** Java 17
*   **Framework UI:** Java Swing + [FlatLaf](https://www.formdev.com/flatlaf/) + NetBeans AbsoluteLayout
*   **Base de Datos:** MySQL (MariaDB)
*   **Herramienta de Construcción:** Apache Maven
*   **Patrón de Arquitectura:** Arquitectura de escritorio inspirada en MVC con separación de responsabilidades (`models`, `views`, `database`, `forms`).

## 📋 Resumen del Esquema de Base de Datos
El sistema se basa en un diseño de base de datos relacional que contiene entidades centrales como:
- `usuarios`: Maneja el acceso al sistema, la autenticación y los roles de la plataforma.
- `pacientevacunado`: Almacena registros de vacunación completos y detalles de salud por paciente.
- `vacunasdisponibles`: Inventario operativo del stock actual de vacunas.
- `vacunasusadas`: Registro histórico de eventos de vacunas aplicadas para auditoría.

## ⚙️ Configuración e Instalación

Para ejecutar este proyecto localmente:

1. **Configuración de la Base de Datos:**
   * Instalar e iniciar un servidor MySQL local (por ejemplo, usando XAMPP/WAMP).
   * Importar el script SQL proporcionado en la raíz: `BackUpCentroVacunacionPuntoDePartida.sql` para reconstruir el esquema de la base de datos `centrovacunacion` y los datos de prueba.
2. **Compilación y Ejecución:**
   * Abrir el proyecto en el IDE de preferencia (IntelliJ IDEA, Apache NetBeans o Eclipse).
   * Dejar que Maven incorpore y resuelva las dependencias automáticamente a través del archivo `pom.xml`.
   * Ejecutar la clase principal: `com.mycompany.centrovacunacion.CentroVacunacion`.

---
*Este proyecto sirve como una demostración práctica del desarrollo de aplicaciones de escritorio "Full-Stack" clásicas y la gestión de bases de datos relacionales en la práctica.*
