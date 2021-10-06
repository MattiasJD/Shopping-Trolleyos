package com.company;

public class Main {

    public static void main(String[] args) {
        String[] shoppe = {"voda", "chleba", "rohlik", "banan", "jablko", "salat"};
        int[] prices = {15, 30, 3, 10, 8, 25};
        int all = 0;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                int cu = Integer.parseInt(args[i]);
                if (cu <= (shoppe.length - 1)) {
                    System.out.println("Produkt "+shoppe[cu]+ " za cenu "+prices[cu]+" CZK, byl pridan do kosiku.");
                    all = all + prices[cu];
                } else {
                    System.out.println("Tento produkt neexistuje.");
                }
            }
            System.out.println("Celkova cena je: " + all+" CZK");
        } else {
            for (int i = 0; i < shoppe.length; i++) {
                System.out.println("Cislo: "+i+" | Polozka: "+shoppe[i]+" | Cena: "+prices[i]+" CZK");
            }
        }
    }
}
