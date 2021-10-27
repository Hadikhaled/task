/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author Hadi khaled
 */
class Chanel {
     private int CHANEL;
    private int VOULEM;
    private boolean ON ;

    public Chanel() {
        CHANEL = 0;
         VOULEM = 0;
         ON  = false;
    }
    public void TURNON (){
        ON = true;
    }
     public void TURNOF (){
        ON = false;
    }

    public void setCHANEL(int NEWCHANEL) {
        if(NEWCHANEL>=1 && NEWCHANEL <=120){
            CHANEL = NEWCHANEL;
        }
    }

    public void setVOULEM(int VOULEM1) {
        if(VOULEM >=1 && VOULEM <=7)
        {
         VOULEM1 = VOULEM;
        }
    }
    
    public void CHANELUP(){
        if(CHANEL >=1 && CHANEL<=120){
            CHANEL++;
        }
    }
    public void CHANELDOWN(){
        if(CHANEL >=1 && CHANEL<=120){
            CHANEL--;
        }
    }
     public void VOULEMUP() {
        if(VOULEM >=1 && VOULEM <=7)
        {
         VOULEM ++;
        }
    }
      public void VOULEMDOWN() {
        if(VOULEM >=1 && VOULEM <=7)
        {
         VOULEM --;
        }
    }
      public void printtv(){
          System.out.println(CHANEL);
            System.out.println(VOULEM);
              System.out.println(ON);
      }
}
