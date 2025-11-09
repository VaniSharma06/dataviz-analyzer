📊 Full-Stack DataViz: Spring Boot & Chart.js

From Database to Dashboard: A 3-Tier Application for Real-Time Sales Trend Analysis.

✨ Project Overview

This repository contains the code for a complete, end-to-end data visualization solution. The system demonstrates a robust separation of concerns, utilizing a Java backend for data processing and a dedicated HTML/JavaScript client for presentation.

🚀 Tech Stack Highlights

Language

Framework/Tool

Runtime

Database

Java

Spring Boot 3.x

Node.js (for testing)

H2 (In-Memory)

JavaScript

Chart.js

Browser

N/A

🏷️ Technology Badges (Mockup)

⚙️ Architecture and Data Flow

The application is structured into three logical tiers, ensuring maintainability and scalability.

Frontend Client (index.html)

Initiates an HTTP GET Request to the backend API (http://localhost:8080/api/data/sales).

Uses Chart.js to parse the resulting JSON and render the final visualization.

Backend API (Spring Boot)

Controller: Receives the request and routes it. Uses the @CrossOrigin annotation to prevent browser security errors.

Service: Executes the business logic (data fetching, analysis, and transformation into DataPoint DTOs).

Data Layer (H2/JPA)

Persists the raw sales records. Spring Data JPA handles all database interactions.

🛠️ Getting Started

Prerequisites

JDK 17+

Maven or Gradle (for the Spring Boot project)

A modern web browser (Chrome, Firefox, Edge)

Step 1: Launch the Backend Server

Clone this repository locally.

Open the Spring Boot project in your preferred IDE (IntelliJ, VS Code, Eclipse).

Run the main application class (e.g., DatavizApplication.java).

✅ Verification: Ensure the server starts successfully on port 8080.
You should be able to view the raw JSON data in your browser at:
http://localhost:8080/api/data/sales

Step 2: View the Visualization

Navigate to the directory containing the index.html file.

Double-click on index.html or open it using your web browser.

The JavaScript in index.html will automatically connect to your running Spring Boot API and draw the sales chart.

🎨 Visualization Details

The current client renders an Attractive Line Chart.

Design Choice: A line chart was chosen to effectively highlight sales trends and performance over time.

Styling: Features include smooth curves (tension: 0.4), a subtle light blue fill under the line, and clean, high-contrast typography.

Responsiveness: The chart is fully responsive, resizing automatically to fit various screen sizes.
