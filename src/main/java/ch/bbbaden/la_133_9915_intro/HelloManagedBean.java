/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.la_133_9915_intro;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author A
 */
@Named(value = "helloManagedBean")
@ApplicationScoped
public class HelloManagedBean {

    /**
     * Creates a new instance of HelloManagedBean
     */
    public HelloManagedBean() {
    }
    
    private String bild="";
    private String haut="";
    private String augen="";
    private String haare="";

    public String getBild() {
        bild="Ressources/img/"+haare+augen+haut+".png";
        return bild;
    }

    public String getAugen() {
        return augen;
    }

    public String getHaare() {
        return haare;
    }

    public String getHaut() {
        return haut;
    }

    public void setAugen(String augen) {
        this.augen = augen;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public void setHaare(String haare) {
        this.haare = haare;
       
    }

    public void setHaut(String haut) {
        this.haut = haut;
    }

    @Override
    public String toString() {
        String string="Deine Auswahl: ";
        switch (haare){
            case "b": 
                string+="Blonde";
                break;
             case "s": 
                string+="Schwarze";
                break;
        }
        string+=" Haare, ";
         switch (augen){
            case "g": 
                string+="grüne";
                break;
             case "b": 
                string+="blaue";
                break;
        }
         string+=" Augen, ";
           switch (haut){
            case "d": 
                string+="dunkle";
                break;
             case "h": 
                string+="helle";
                break;
        }
           string+=" Haut.";
        return string;
    }
    
    
    

    
    
}
