
import MyGraphics.MyFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toby
 */
public class Program {
    public static void main (String [] args){
        MyFrame f = new MyFrame(); 
        //example
        f.addBlock(10, 500);
        f.addBlock(165  , 500);
         f.addBlock(10, 450);
        f.addBlock(165, 450);
        f.showFrame();
    }
    
}
