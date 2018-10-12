/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author stefan
 */
public class Sender {
    
    private String sender;
    private double freq;
    private String band;

    public Sender(String sender, double freq, String band) {
        this.sender = sender;
        this.freq = freq;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public double getFreq() {
        return freq;
    }

    public String getBand() {
        return band;
    }
    
     
}
