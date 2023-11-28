package edu.corvinus.springBootLottery.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginForm {
    @NotNull(message = "Felhasználónév megadása kötelező!")
    private String username;
    @NotNull
    @Size(min=6)
    private String password;

    public LoginForm() {
    }
    public LoginForm(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
