package musha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    // This is my unit test method
    
    @Test
    public void testGetFriendNames() {
        // The positive test cases - testing if the method returns the expected array of friend names

        Assertions.assertArrayEquals(new String[] { "Aino", "Ahti", "Aila", "Aku", "Anna" }, FacebookPage.getFriendNames("https://www.facebook.com/profile.php?id=12345"));
        Assertions.assertArrayEquals(new String[] { "Antti", "Eevi", "Eemeli", "Eira", "Eino" }, FacebookPage.getFriendNames("https://www.facebook.com/profile.php?id=67890"));

        // The negative test cases - testing if the method returns an empty array for invalid input values

        Assertions.assertArrayEquals(new String[] {}, FacebookPage.getFriendNames(""));
        Assertions.assertArrayEquals(new String[] {}, FacebookPage.getFriendNames(null));
    }

}
