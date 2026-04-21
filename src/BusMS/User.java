/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusMS;

/**
 *
 * @author Group14
 */
public class User {

    // The person's name
    private String name;

    // The person's ID
    private String userld;

    // The person's email
    private String email;

    // The person's password
    private String password;

    // This constructor initializes the user's name, ID, email, and password.
    public User(String name, String userld, String email, String password) {
        this.name = name;
        this.userld = userld;
        this.email = email;
        this.password = password;
    }

    // This method sets the user's name.
    public void setName(String name) {
        this.name = name;
    }

    // This method sets the user's ID.
    public void setUserld(String userld) {
        this.userld = userld;
    }

    // This method sets the user's email.
    public void setEmail(String email) {
        this.email = email;
    }

    // This method sets the user's password.
    public void setPassword(String password) {
        this.password = password;
    }

    // This method gets the user's name.
    public String getName() {
        return name;
    }

    // This method gets the user's ID.
    public String getUserld() {
        return userld;
    }

    // This method gets the user's email.
    public String getEmail() {
        return email;
    }

    // This method gets the user's password.
    public String getPassword() {
        return password;
    }

}