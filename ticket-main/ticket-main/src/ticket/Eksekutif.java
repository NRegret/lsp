/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Nico
 */
public class Eksekutif implements Ticket {
    
    String name = "";
    int price = 110000;
    
    Eksekutif(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
    
}
