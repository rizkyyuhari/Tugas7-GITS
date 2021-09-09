package com.example.muhammadrizkyyuhari;

import java.util.List;
import java.util.ArrayList;

public class DataModel {
    public static List<Model> contacList() {
        Model rizky = new Model("Rizky", "08123832498");
        Model yasin = new Model("Yasin", "08123671223");
        Model april = new Model("April", "081236782413");
        Model herika = new Model("Herika", "081231232312");
        Model andreas = new Model("Andreas", "081236712123");
        Model rafi = new Model("Rafi", "08123678321");
        Model rara = new Model("Rara","08123832498123");
        Model kintan = new Model("Kintan","081236712123");
        Model dani = new Model("Dani","08123678241");

        List<Model> contactList = new ArrayList<>();
        contactList.add(rizky);
        contactList.add(yasin);
        contactList.add(april);
        contactList.add(herika);
        contactList.add(andreas);
        contactList.add(rafi);
        contactList.add(rara);
        contactList.add(kintan);
        contactList.add(dani);

        return contactList;
    }
}
