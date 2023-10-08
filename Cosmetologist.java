package com.example.SALON;

public class Cosmetologist extends SalonEmployee {
    public Cosmetologist(String name) {
        super(name);
    }

    @Override
    public void greetClient() {
        System.out.println("Ласкаво просимо до косметолога, я " + getName());
    }
}
