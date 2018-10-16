/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.Comparator;

/**
 *
 * @author stefan
 */
public class SortByFre implements Comparator<Sender>{

    @Override
    public int compare(Sender o1, Sender o2) {
        if(o1.getFreq() > o2.getFreq()){return 1;}
          if(o1.getFreq() < o2.getFreq()){return -1;}
          else return 0;
    }


}
