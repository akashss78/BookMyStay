# 🏨 Book My Stay App

A **Hotel Booking Management System** built using **Core Java and Data Structures**, designed to demonstrate how real-world software systems are developed step-by-step.

---

## 🎯 Objective

This project showcases how fundamental concepts like:

* Object-Oriented Programming (OOP)
* Data Structures (HashMap)
* Clean Architecture
* Separation of Concerns

are applied to solve real-world problems such as:

* Room availability management
* Preventing inconsistent data
* Providing safe read-only access for search operations

---

## 🧠 Learning Approach

The system is developed incrementally using **Use Cases (UCs)**.

Each use case introduces:

* A new concept
* A real-world problem
* A structured solution

---

## 🧩 Use Cases Implemented

### ✅ UC1 — Application Entry & Welcome Message

* Entry point of the application
* Demonstrates `main()` method execution
* Displays system startup message

---

### ✅ UC2 — Basic Room Types & Static Availability

* Introduces **Abstract Class (Room)**
* Implements **Inheritance** (Single, Double, Suite)
* Uses static variables for availability

---

### ✅ UC3 — Centralized Room Inventory Management

* Introduces **HashMap**
* Stores room availability in a centralized structure
* Eliminates scattered variables

---

### ✅ UC4 — Room Search & Availability Check

* Implements **read-only search functionality**
* Displays only available rooms
* Ensures **no modification of system state**

---

## 🏗️ Project Structure

```
src/
│
├── uc1/
├── uc2/
├── uc3/
├── uc4/
```

---

## ⚙️ Technologies Used

* Java (Core Java)
* Data Structures (HashMap)
* IntelliJ IDEA
* Git & GitHub

---

## 🚀 How to Run

1. Open project in IntelliJ IDEA
2. Navigate to any Use Case class:

* UC1 → `UseCase1HotelBookingApp`
* UC2 → `UseCase2RoomInitialization`
* UC3 → `UseCase3InventorySetup`
* UC4 → `UseCase4RoomSearch`

3. Click ▶ Run

---

## 🔁 Git Workflow Used

```
develop → feature/UCx → commit → push → merge → develop
```

---

## 🧠 Key Concepts Covered

* Abstraction
* Inheritance
* Encapsulation
* Polymorphism
* HashMap (O(1) access)
* Read-only vs Write operations
* Clean Code Design

---

## 🌟 Outcome

By completing this project, you will understand:

* Not just *how* to use data structures
* But *when and why* to use them in real systems

---

## 👨‍💻 Author

**Akash**
Version: 1.0

---
