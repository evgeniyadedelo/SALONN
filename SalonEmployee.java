package com.example.SALON;

abstract class SalonEmployee {
    private String name;

    public SalonEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактний метод, який обов'язково реалізується в підкласах
    public abstract void greetClient();
}
