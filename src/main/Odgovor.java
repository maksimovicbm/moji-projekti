/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Milan Skaric
 */
public class Odgovor {
    private Pitanje pitanje;
    private String tekst;
    private boolean tacan;

    public Odgovor(Pitanje pitanje, String tekst, boolean tacan) {
        this.pitanje = pitanje;
        this.tekst = tekst;
        this.tacan = tacan;
        pitanje.dodaj(this);
    }

    public String getTekst() {
        return tekst;
    }

    
    
    @Override
    public String toString() {
        return (tacan?"+":"-")+tekst;
    }
    
    
    
}
