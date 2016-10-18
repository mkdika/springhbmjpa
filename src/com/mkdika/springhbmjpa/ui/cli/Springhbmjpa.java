package com.mkdika.springhbmjpa.ui.cli;

import com.mkdika.springhbmjpa.helper.AppUtil;

/**
 *
 * @author Maikel
 */
public class Springhbmjpa {
    
    public static void main(String[] args) {
        // Menampilkan Jumlah record set pada table Person saat ini.
        System.out.println("Table Person Size: " + AppUtil.getService().getPersons().size());                
    }
    
}
