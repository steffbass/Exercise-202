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
    
    protected String sender;
    protected double freq;
    protected String band;

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
    
     @Override
    public String toString() {
            return String.format("%s,%.2f,%s", sender, freq, band);
    }
     
}
