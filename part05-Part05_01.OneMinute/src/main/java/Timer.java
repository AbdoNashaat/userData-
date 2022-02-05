/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Timer {
    private ClockHand hunderthsecond;
    private ClockHand seconds;
    public Timer(){
        this.hunderthsecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    } 
    public void advance(){
        hunderthsecond.advance();
        if(hunderthsecond.value()==0){
            seconds.advance();
        }
    }
    public String toString(){
        return seconds.toString()+":"+hunderthsecond.toString();
    
    }
}
