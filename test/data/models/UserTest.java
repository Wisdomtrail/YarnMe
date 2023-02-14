package data.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user;
    @BeforeEach
    public void setUp(){
        user = new User();
    }

    @Test
    public void setAndGetId(){
        user.setId(1);
        assertEquals(1,user.getId());
    }

    @Test
    public void setAndGetFirstName(){
        user.setFirstName("sunday");
        assertEquals("sunday",user.getFirstName());
    }

    @Test
    public void setAndGetLastName(){
        user.setLastName("wisdom");
        assertEquals("wisdom",user.getLastName());
    }

    @Test
    public void setAndGetPassword(){
        user.setPassword("1234s");
        assertEquals("1234s",user.getPassword());
    }
}