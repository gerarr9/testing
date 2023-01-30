package org.example;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void equalslEmailAndPassword() {
        User user = new User("211@", "211@");
        assertEquals(user.getPassword(),user.getEmail());
       assertThat(user.getEmail(), CoreMatchers.containsString("@"));

    }
    @Test
    public  void checEmpty(){
        User user = new  User ("","");
        assertTrue(user.isEmpty());

    }
    @Test
    public  void checForBlank(){
        User user = new User(" "," ");
        assertTrue(user.isBlank());
    }
    @Test
    public  void  checEqualLoginAndPassword(){
        User user = new User("211@", "211@");
        assertEquals(user.getPassword(),user.getEmail());
    }
    @Test
    public  void  checCreate(){
        User user = new User("123@mfifa.com","123");
        assertEquals("123@mfifa.com",user.getEmail());
        assertEquals("123",user.getPassword());

    }

}