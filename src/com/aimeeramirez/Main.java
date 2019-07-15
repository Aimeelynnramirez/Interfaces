package com.aimeeramirez;

public class Main {

    public static void main(String[] args) {
        ITelephone aimeesPhone;
        aimeesPhone = new DeskPhone(123456);
        aimeesPhone.powerOn();
        aimeesPhone.callPhone(123456);
        aimeesPhone.answer();

    }
}
