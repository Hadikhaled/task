/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

;

/**
 *
 * @author Hadi khaled
 */
public class Tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chanel ch = new Chanel();
        ch.setCHANEL(50);
        ch.setVOULEM(2);
        ch.VOULEMUP();
        ch.VOULEMDOWN();
        ch.TURNOF();
        ch.TURNON();
        ch.printtv();
    }
    
}
