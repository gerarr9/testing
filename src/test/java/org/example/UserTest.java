package org.example;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void equalslEmailAndPassword() {
        User user = new User("211", "211");
        assertEquals(user.getPassword(),user.getEmail());

    }
}