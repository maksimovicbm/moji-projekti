
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Milan Skaric
 */
public class Kviz {
    private Takmicar takmicar;
    private ArrayList<Pitanje> pitanja=new ArrayList<>();

    public Kviz(Takmicar takmicar) {
        this.takmicar = takmicar;
        ucitaj();
        //test();
        pocni();
    }
    
    private void test() {
        for(Pitanje p:pitanja) {
            System.out.println(p);
        }
    }
    
    private void ucitaj() {
       try(Scanner s=new Scanner(new File("pitanja.txt"))) {
           Pitanje p = null;
           while(s.hasNextLine()){
               String line = s.nextLine().trim();
               if(line.isEmpty())
                   continue;
               
               if(line.startsWith("+") || line.startsWith("-")){
                   if(p == null)continue;
                   boolean tacan = line.startsWith("+");
                   line = line.substring(1).trim();
                   new Odgovor(p, line, tacan);
               }else {
                   if(p != null)pitanja.add(p);
                   p = new Pitanje(line);
                   
               }          
           }
           if(p != null)pitanja.add(p);
       } catch(FileNotFoundException e) {
           System.out.println("Ne postoji fajl: pitanja.txt");
       }

    }
    
    public void pocni() {
        Scanner s=new Scanner(System.in);
        for(Pitanje p:pitanja) {
            System.out.println(p.getTekst());
            for(Odgovor o:p.getOdgovori()) {
                System.out.println(o.getTekst());
            }
            int odgovor=s.nextInt();
        }
    }
    
}
