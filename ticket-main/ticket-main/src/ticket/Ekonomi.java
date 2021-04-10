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
public class Ekonomi implements Ticket {
    
    String nama = "";
    int harga = 15000;
    
    Ekonomi(String name) {
        this.nama = name;
    }
    
    public String getName() {
        return this.nama;
    }

    public int getPrice() {
        return this.harga;
    }
    
}
