


namespace BookingOperation.Models
{
    public class BookingService : IBookingService
    {

        private readonly List<Booking> bookings = new List<Booking>();
        private int nextId = 1;
        public Booking CreateBooking(Booking booking)
        {
            //throw new NotImplementedException();

            booking.B_Id = nextId++;
            bookings.Add(booking);
            return booking;
        }

        public bool DeleteBooking(int id)
        {
            //throw new NotImplementedException();

            var booking = GetBooking(id);
            if (booking == null) return false;

            bookings.Remove(booking);
            return true;
        }

        public List<Booking> GetAllBookings()
        {
            // throw new NotImplementedException();
            return bookings;
        }

        public Booking GetBooking(int id)
        {
            //throw new NotImplementedException();

            return bookings.FirstOrDefault(b => b.B_Id == id);
        }

        public bool UpdateBooking(int id, Booking booking)
        {
            //throw new NotImplementedException();

            var existingBooking = GetBooking(id);
            if (existingBooking == null) return false;

            existingBooking.U_Name = booking.U_Name;
            existingBooking.B_Date = booking.B_Date;
            existingBooking.PhoneNumber = booking.PhoneNumber;
            return true;
        }
    }
}
