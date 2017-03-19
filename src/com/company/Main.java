package com.company;

class Main {

    public static void main(String[] args) {
        System.out.println("Bonjour tout le monde ! =D");
        User toto = new User("toto", "Edouard", "Topin", "19, rue pouet 79000 NIORT", "ed.topin@gmail.com");
        User inconnu = new User();
        System.out.println(toto.toString());
        System.out.println(inconnu.toString());
    }
}
