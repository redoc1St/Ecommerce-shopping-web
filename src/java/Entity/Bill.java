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
public class Bill {
    private int id;
    private String name;
    private double money;
    private String date; 

    public Bill() {
    }

    public Bill(int id, String name, double money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", name=" + name + ", money=" + money + ", date=" + date + '}';
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
