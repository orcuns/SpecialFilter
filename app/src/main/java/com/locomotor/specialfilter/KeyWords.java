package com.locomotor.specialfilter;

import java.util.ArrayList;

/**
 * Created by MiloRambaldi on 25-Oct-15.
 */
public class KeyWords {
    private static KeyWords ourInstance = new KeyWords();
    public ArrayList<String> allStrings;

    public static KeyWords getInstance() {
        return ourInstance;
    }

    private KeyWords() {

        allStrings = new ArrayList<>();
        allStrings.add(0, cek_Kontrol());
        allStrings.add(1, siramatik());
        allStrings.add(2, islem_ucreti());
        allStrings.add(3, ogrenci_kredisi());
    }

    public String cek_Kontrol() {
        return "Çek Kontrol";
    }
    public String siramatik() {
        return "Sıramatik";
    }
    public String islem_ucreti() {
        return "İşlem Ücreti";
    }
    public String ogrenci_kredisi() {
        return "Öğrenci Kredisi";
    }
}
