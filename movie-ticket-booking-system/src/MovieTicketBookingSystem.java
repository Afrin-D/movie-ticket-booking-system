import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicketBookingSystem {

    static ArrayList<Movie> movies = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    static int bookingId = 1001;

    public static void main(String[] args) {

        addMovies();

        while (true) {

            System.out.println("\n===== MOVIE TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. View Booking");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    viewMovies();
                    break;

                case 2:
                    bookTickets();
                    break;

                case 3:
                    viewBooking();
                    break;

                case 4:
                    cancelBooking();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add sample movies
    public static void addMovies() {

        movies.add(new Movie(
                1,
                "Avengers: Endgame",
                "10:00 AM",
                200,
                50
        ));

        movies.add(new Movie(
                2,
                "Interstellar",
                "2:00 PM",
                250,
                40
        ));

        movies.add(new Movie(
                3,
                "Inception",
                "6:00 PM",
                220,
                45
        ));

        movies.add(new Movie(
                4,
                "Spider-Man",
                "9:00 PM",
                180,
                60
        ));
    }

    // Display all movies
    public static void viewMovies() {

        System.out.println("\n--------------- AVAILABLE MOVIES ---------------");

        System.out.println(
                "ID | Movie | Show Time | Ticket Price | Available Seats"
        );

        for (Movie movie : movies) {
            movie.displayMovie();
        }
    }

    // Book tickets
    public static void bookTickets() {

        viewMovies();

        System.out.print("\nEnter Movie ID: ");
        int movieId = scanner.nextInt();

        Movie selectedMovie = findMovie(movieId);

        if (selectedMovie == null) {
            System.out.println("Movie not found!");
            return;
        }

        scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = scanner.nextInt();

        if (tickets <= 0) {
            System.out.println("Number of tickets must be greater than 0.");
            return;
        }

        if (selectedMovie.bookSeats(tickets)) {

            Booking booking = new Booking(
                    bookingId,
                    customerName,
                    selectedMovie,
                    tickets
            );

            bookings.add(booking);

            System.out.println("\nBooking successful!");
            System.out.println("Your Booking ID: " + bookingId);

            bookingId++;

        } else {

            System.out.println("Sorry! Not enough seats available.");
        }
    }

    // Find movie using ID
    public static Movie findMovie(int movieId) {

        for (Movie movie : movies) {

            if (movie.getMovieId() == movieId) {
                return movie;
            }
        }

        return null;
    }

    // View booking
    public static void viewBooking() {

        System.out.print("\nEnter Booking ID: ");
        int id = scanner.nextInt();

        for (Booking booking : bookings) {

            if (booking.getBookingId() == id) {

                booking.displayBooking();
                return;
            }
        }

        System.out.println("Booking not found!");
    }

    // Cancel booking
    public static void cancelBooking() {

        System.out.print("\nEnter Booking ID: ");
        int id = scanner.nextInt();

        for (Booking booking : bookings) {

            if (booking.getBookingId() == id) {

                booking.getMovie().cancelSeats(
                        booking.getNumberOfTickets()
                );

                bookings.remove(booking);

                System.out.println("Booking cancelled successfully!");
                return;
            }
        }

        System.out.println("Booking not found!");
    }
}