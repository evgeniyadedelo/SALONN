package com.example.SALON;

public class Appointment {
    private SalonEmployee employee;
    private BeautyService service;
    private String clientName;

    public Appointment(SalonEmployee employee, BeautyService service, String clientName) {
        this.employee = employee;
        this.service = service;
        this.clientName = clientName;
    }

    public void startAppointment() {
        employee.greetClient();
        System.out.println(clientName + ", ви обрали послугу:");
        service.performService();
        System.out.println("Дякуємо за візит!");
    }
}
