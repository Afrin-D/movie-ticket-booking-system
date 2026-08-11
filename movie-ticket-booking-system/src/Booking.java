public class Booking {

    private int bookingId;
    private String customerName;
    private Movie movie;
    private int numberOfTickets;
    private double totalAmount;

    public Booking(int bookingId, String customerName,
                   Movie movie, int numberOfTickets) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
        this.totalAmount =
                movie.getTicketPrice() * numberOfTickets;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void displayBooking() {

        System.out.println("\n----- Booking Details -----");
        System.out.println("Booking ID    : " + bookingId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Movie         : " + movie.getMovieName());
        System.out.println("Show Time     : " + movie.getShowTime());
        System.out.println("Tickets       : " + numberOfTickets);
        System.out.println("Total Amount  : ₹" + totalAmount);
        System.out.println("---------------------------");
    }
}