public class Movie {

    private int movieId;
    private String movieName;
    private String showTime;
    private double ticketPrice;
    private int availableSeats;

    public Movie(int movieId, String movieName, String showTime,
                 double ticketPrice, int availableSeats) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeats(int seats) {

        if (seats <= 0) {
            return false;
        }

        if (seats <= availableSeats) {
            availableSeats -= seats;
            return true;
        }

        return false;
    }

    public void cancelSeats(int seats) {
        availableSeats += seats;
    }

    public void displayMovie() {
        System.out.println(
                movieId + " | " +
                movieName + " | " +
                showTime + " | ₹" +
                ticketPrice + " | Seats: " +
                availableSeats
        );
    }
}