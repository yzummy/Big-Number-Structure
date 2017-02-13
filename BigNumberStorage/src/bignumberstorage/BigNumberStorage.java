/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignumberstorage;

import java.util.ArrayList;

/**
 *
 * @author Yunch
 */
public class BigNumberStorage extends BigNumber {

    /**
     * @param args the command line arguments
     */

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        BigNumber a = new BigNumber();
        for(int i = 1; i <=100; i++){
            a.multiply(i);
            System.out.print(i+" ");
            a.print();

        }
        
    }
    
}
