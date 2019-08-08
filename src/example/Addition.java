/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author HEMANT KUMAR
 */
public class Addition {

    int add(int x, int y) {
        while(y!=0){
            int carry=x&y;
            System.out.println("carry "+carry);
            x=x^y;
            System.out.println("x^y "+x);
            y=carry<<1;
            System.out.println("carry<<1 "+y);
        }
        return x;
    }
    
}
