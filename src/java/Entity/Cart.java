/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }
    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    private Item getItemById(int id){// trả về số lượng để tí cộng dồn
        for (Item o : items) {
            if(o.getProduct().getId()==id){
                return o;
            }
        }return null;
    }
    public int getQuantityById(int id){
        return getItemById(id).getQuantity();
    }
    //thêm vào cart
    public void addItem(Item t){
        if(getItemById(t.getProduct().getId())!=null){
            Item m=getItemById(t.getProduct().getId());
            m.setQuantity(m.getQuantity()+t.getQuantity());
        }else
            // neu chua co trong cart
            items.add(t);
    }
    public void removeItem(int id){
        if(getItemById(id)!=null){
            items.remove(getItemById(id));
        }
    }
    public double getTotalMoney(){
        double t=0;
        for(Item i:items)
            t+=(i.getQuantity()*i.getProduct().getPrice());
        return t;
    }
    
    
    
}
