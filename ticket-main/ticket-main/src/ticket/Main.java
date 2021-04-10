/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Main {
    
    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ekonomi("Ekonomi"),
            new Bisnis("Bisnis"),
            new Eksekutif("Eksekutif")
        };
        
        start(tickets);
    }
    
    protected static void start(Ticket[] tickets) {
        boolean stop = false;
        
        while (!stop) {
            printTicketList(tickets);

            Scanner input = new Scanner(System.in);
            int indexTiket, kuantitas, harga;
            String again;

            System.out.println("Masukkan Pesanan Anda");
            System.out.print("Kelas = ");

            indexTiket = input.nextInt();
            
            if (tickets.length < indexTiket) {
                System.out.println("=================");
                
                System.out.println("Kelas yang dipilih tidak ada!");
                
                continue;
            }

            System.out.print("Jumlah Penumpang = ");

            kuantitas = input.nextInt();

            int total = tickets[indexTiket - 1].getPrice() * kuantitas;

            System.out.println("Total Bayar = " + total);
            
            System.out.println("=================");
            
            boolean stopAsk = false;
            
            while (!stopAsk) {
                System.out.println("Pesan Tiket Lagi? (Y/N) ");

                again = input.next();

                if (!again.toLowerCase().equals("y") && !again.toLowerCase().equals("n")) {
                    continue;
                }
                
                stopAsk = true;
                
                if (again.toLowerCase().equals("n")) {
                    stop = true;
                }
            }
        }
    }
    
    protected static void printTicketList(Ticket[] tickets) {
        System.out.println("=================");
        System.out.println("Daftar Tiket Kereta");
        
        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i].getName());
        }
        
        System.out.println("=================");
    }
    
}
