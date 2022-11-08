package com.example.igrica;

import java.sql.*;
import java.util.ArrayList;

public class BazaProxy {
    private static final String URL_BAZE = "jdbc:ucanaccess://src/main/resources/Hangman_rezultati.accdb";
    public static ArrayList<String > reci;
    private static Connection c;
    private static void uspostaviVezu(){
        if (c==null){
            try {
                reci = new ArrayList<>();
                c= DriverManager.getConnection(URL_BAZE);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void ucitajReci(){
        try {
            uspostaviVezu();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Reci");
            while(rs.next()){
                reci.add(rs.getString("Naziv"));
                System.out.println(rs.getString("Naziv"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
