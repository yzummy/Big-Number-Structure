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
public class BigNumber {
    protected ArrayList<Integer> big;
    protected int[] each;
    public BigNumber(){
         big = new ArrayList<Integer>();
    }
    
    public BigNumber(int num){
        big = new ArrayList<Integer>();
        while(num%10 != 0){
            big.add(num%10);
            num /= 10;
        }
    }
    
    public void print(){
        System.out.println(big.toString());
    }
    
    public void multiply(int num){
        int product, count=0, digit;
        int anotherCount=0;
        if(big.isEmpty()){
            big.add(1);
        }
        
        each = new int[String.valueOf(num).length()+big.size()];
        int origSize = big.size();
        for(int i = 0; i < big.size(); i++)
        {
            product = big.get(big.size()-1-i) * num;
            count = 0;
            
            while(product%10 != 0 || product/10 != 0){
                                                                                    // for(int kk = 0; kk < each.length; kk++)                                                                            
                                                                                     //   System.out.print(each[kk]);
                                                                                    //System.out.println();
                digit = product%10;
                if(each[count+i]+digit < 10)
                    each[count+i] += product%10;
                else{
                     anotherCount = count;
                    int di;
                    int rem;
                    while((each[anotherCount+i]+digit)/10 != 0 ){
                        di = (each[anotherCount+i]+digit)%10;
                        digit = (each[anotherCount+i]+digit)/10;
                        each[anotherCount+i] = di;
                        anotherCount++;
                    }
                    if(digit!=0)
                        each[anotherCount+i] += digit;

                }

                    
                product /= 10;
                count++;
            }
            

        }


        
        big.clear();
        int c = String.valueOf(num).length()+origSize-1;
        while(each[c]==0){
            c--;
        }
        for(int i = c; i >=0; i--){
            
            big.add(each[i]);
        }
        
    }
}
