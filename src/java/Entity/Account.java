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
public class Account {
    private int id;
    private String name;
    private String username;
    private String password;
    private int cateId;

    public Account(int id, String name, String username, String password, int cateId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.cateId = cateId;
    }
    

    public Account() {
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
