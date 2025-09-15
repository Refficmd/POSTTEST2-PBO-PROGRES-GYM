package model;

public class User {
    private String username;
    private String password;
    private String role; // ADMIN atau USER

    public User(String username, String password, String role) {
        this.username = username.trim();
        this.password = password;
        this.role = role.toUpperCase();
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User{" + "username='" + username + "', role='" + role + "'}";
    }
}
