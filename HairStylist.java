package com.example.SALON;

public class HairStylist extends SalonEmployee {
    public HairStylist(String name) {
        super(name);
    }

    @Override
    public void greetClient() {
        System.out.println("Ласкаво просимо до перукаря, мене звуть " + getName());
    }
}
