package com.example.SALON;

public class BeautySalon {
    public static void main(String[] args) {
        SalonEmployee cosmetologist = new Cosmetologist("Марія");
        SalonEmployee hairStylist = new HairStylist("Олена");

        BeautyService manicure = new ManicureService();
        BeautyService haircut = new HaircutService();

        Appointment appointment1 = new Appointment(cosmetologist, manicure, "Анна");
        Appointment appointment2 = new Appointment(hairStylist, haircut, "Іван");

        appointment1.startAppointment();
        System.out.println("------------------------");
        appointment2.startAppointment();
    }
}
