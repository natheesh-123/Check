namespace BookingOperation.Models
{
    public interface IBookingService
    {
        Booking CreateBooking(Booking booking);
        Booking GetBooking(int id);
        List<Booking> GetAllBookings();
        bool UpdateBooking(int id, Booking booking);
        bool DeleteBooking(int id);


    }
}
