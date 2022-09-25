/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ACER
 */
public class Message {
    private String name;
    private String email;
    private int phoneNumber;
    private String mess;

    public Message() {
    }

    public Message(String name, String email, int phoneNumber, String mess) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mess = mess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    @Override
    public String toString() {
        return "Message{" + "name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", mess=" + mess + '}';
    }
    
}
