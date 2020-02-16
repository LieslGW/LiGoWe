/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package domaths;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author Liesl Wentzel
 */
public class LotteryPicker {
    
    public static void main(String[] args) {
        
        int []a ={0,0,0,0,0,0};
        String output="";
        
        while (a[5]==0){
            // get random number and cast it as int n
            int n = (int)Math.ceil(Math.random()*49);
            
            if (a[0]==0) a[0]=n;
            else if (a[1]==0 && n!=a[0]) a[1]=n;
            else if (a[2]==0 && n!=a[0] && n!=a[1]) a[2]=n;
            else if (a[3]==0 && n!=a[0] && n!=a[1] && n!=a[2]) a[3]=n;
            else if (a[4]==0 && n!=a[0] && n!=a[1] && n!=a[2] && n!=a[3]) a[4]=n;
            else if (a[5]==0 && n!=a[0] && n!=a[1] && n!=a[2] && n!=a[3] && n!=a[4]) a[5]=n;
        }
        
        //System.out.print("LUCKY NUMBERS: ");
        
        Arrays.sort(a);
        for (int i=0; i<6;i++){
            output+=(a[i]+ "   ");
            
            
        }
        
        JOptionPane.showMessageDialog(null, output,"LUCKY NUMBERS",JOptionPane.PLAIN_MESSAGE);

    }
   // public String toString(){
        //return 
    //}

    
}
