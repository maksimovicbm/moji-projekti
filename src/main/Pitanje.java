/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Milan Skaric
 */
public class Pitanje {
    private String tekst;
    private ArrayList<Odgovor> odgovori=new ArrayList<>();

    public Pitanje(String tekst) {
        this.tekst = tekst;
    }
    
    public void dodaj(Odgovor odgovor) {
        if(!odgovori.contains(odgovor))
            odgovori.add(odgovor);
    }

    public String getTekst() {
        return tekst;
    }

    public ArrayList<Odgovor> getOdgovori() {
        return odgovori;
    }
    
    @Override
    public String toString() {
        String res=tekst+"\n";
        for(Odgovor o:odgovori)
            res+="   "+o+"\n";
        return res;
    }
    
    
    
}
