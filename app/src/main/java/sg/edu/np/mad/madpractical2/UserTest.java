package sg.edu.np.mad.madpractical2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testUserAttributes() {
        User user = new User("John Doe", "MAD Developer", 1, false);

        assertEquals("John Doe", user.getName());
        assertEquals("MAD Developer", user.getDescription());
        assertEquals(1, user.getId());
        assertEquals(false, user.isFollowed());
    }
}
