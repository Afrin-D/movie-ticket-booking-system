# 🎬 Movie Ticket Booking System

A simple **console-based Movie Ticket Booking System** developed using **Java**. This project allows users to view available movies, book tickets, view bookings, and cancel bookings.

## 📌 Features

* 🎥 View available movies
* 🕐 View movie show timings
* 💺 View available seats
* 🎟️ Book movie tickets
* 🧾 View booking details
* ❌ Cancel bookings
* 💰 Calculate total ticket price
* 🔢 Automatic booking ID generation
* 🖥️ Simple console-based interface

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Object-Oriented Programming (OOP)**
* **Scanner**
* **Java Collections**

## 📂 Project Structure

```text
movie-ticket-booking-system/
│
├── src/
│   ├── Movie.java
│   ├── Booking.java
│   └── MovieTicketBookingSystem.java
│
└── README.md
```

## 📖 Class Description

### `Movie.java`

Stores movie information such as:

* Movie ID
* Movie name
* Show time
* Ticket price
* Available seats

It also handles seat booking and seat cancellation.

### `Booking.java`

Stores booking information such as:

* Booking ID
* Customer name
* Selected movie
* Number of tickets
* Total amount

### `MovieTicketBookingSystem.java`

This is the main class of the application. It provides the menu and handles:

* Movie display
* Ticket booking
* Booking search
* Ticket cancellation

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Afrin-D/movie-ticket-booking-system.git
```

### 2. Open the project

```bash
cd movie-ticket-booking-system
```

### 3. Compile the Java files

```bash
cd src
javac *.java
```

### 4. Run the application

```bash
java MovieTicketBookingSystem
```

## 🖥️ Sample Output

```text
===== MOVIE TICKET BOOKING SYSTEM =====
1. View Movies
2. Book Tickets
3. View Booking
4. Cancel Booking
5. Exit

Enter your choice: 1

--------------- AVAILABLE MOVIES ---------------
ID | Movie | Show Time | Ticket Price | Available Seats

1 | Avengers: Endgame | 10:00 AM | ₹200.0 | Seats: 50
2 | Interstellar | 2:00 PM | ₹250.0 | Seats: 40
3 | Inception | 6:00 PM | ₹220.0 | Seats: 45
4 | Spider-Man | 9:00 PM | ₹180.0 | Seats: 60
```

### 🎟️ Booking Example

```text
Enter Movie ID: 1
Enter Customer Name: Afrin
Enter Number of Tickets: 2

Booking successful!
Your Booking ID: 1001
```

### 🧾 Booking Details

```text
----- Booking Details -----
Booking ID    : 1001
Customer Name : Afrin
Movie         : Avengers: Endgame
Show Time     : 10:00 AM
Tickets       : 2
Total Amount  : ₹400.0
---------------------------
```

## 🎯 Learning Objectives

This project helps in understanding:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* ArrayList
* Loops
* Conditional Statements
* User Input
* Basic CRUD-like operations
* Object-Oriented Programming in Java

## 🚀 Future Improvements

The project can be improved by adding:

* User login and registration
* Multiple theaters
* Different seat categories
* Online payment simulation
* Database connectivity using MySQL
* Admin panel
* Seat selection
* Movie search functionality

## 👩‍💻 Author

**Afrin**

B.Tech Computer Science Engineering

## 📄 License

This project is created for **learning and educational purposes**.
