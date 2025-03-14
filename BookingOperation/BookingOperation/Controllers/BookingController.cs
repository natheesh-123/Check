using System.Text;
using BookingOperation.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace BookingOperation.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class BookingController : ControllerBase
    {

        private readonly IBookingService _bookingService;

        public BookingController(IBookingService bookingService)
        {
            _bookingService = bookingService;
        }

        // POST: api/booking
        [HttpPost]
        public ActionResult<Booking> CreateBooking([FromBody] Booking booking)
        {
            var createdBooking = _bookingService.CreateBooking(booking);
            return CreatedAtAction(nameof(GetBooking), new { id = createdBooking.B_Id }, createdBooking);
        }

        // GET: api/booking
        [HttpGet]
        public ActionResult<IEnumerable<Booking>> GetAllBookings()
        {
            var bookings = _bookingService.GetAllBookings();
            return Ok(bookings);
        }

        // GET: api/booking/{id}
        [HttpGet("{id}")]
        public ActionResult<Booking> GetBooking(int id)
        {
            var booking = _bookingService.GetBooking(id);
            if (booking == null)
            {
                return NotFound();
            }
            return Ok(booking);
        }

        // PUT: api/booking/{id}
        [HttpPut("{id}")]
        public IActionResult UpdateBooking(int id, [FromBody] Booking booking)
        {
            if (_bookingService.UpdateBooking(id, booking))
            {
                return NoContent(); // 204 (No Content)
            }
            return NotFound(); // 404 (Not Found)
        }

        // DELETE: api/booking/{id}
        [HttpDelete("{id}")]
        public IActionResult DeleteBooking(int id)
        {
            if (_bookingService.DeleteBooking(id))
            {
                return NoContent(); // 204 (No Content)
            }
            return NotFound(); // 404 (Not Found)
        }
    


    }


}
