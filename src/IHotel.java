import java.util.ArrayList;

public interface IHotel {//exceptie moet hier komen voor aantal gasten en as het volgeboekt is dan nee.
    void checkInGuests(int numberOfGuests);
    String generateHotelName();
    String getHotelName();
}
