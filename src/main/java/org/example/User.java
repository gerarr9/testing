package org.example;

import java.util.Objects;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

            this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    public boolean isEmpty() {
        if (getEmail().isEmpty() && getPassword().isEmpty()){
            return  true;
        }
        return false;
    }
}
