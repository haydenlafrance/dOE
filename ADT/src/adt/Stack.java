/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author lafra
 */
public class Stack {
   private int[] Stack = new int[1];
   private int numItems = 0;
    
    
   
 public Stack(){
     
 }
 
 public void Push(int num){
        // are we free to stack?
        if(numItems < this.Stack.length){
            // stack
            this.Stack[numItems] = num;
            // increase the count
            numItems++;
        }else{
            // its full, make it bigger
            makeStackBigger();
            this.Stack[numItems]= num;
            numItems++;
        }
    }
    
    
    public void pop(){
       
       
        for(int i = numItems; i < numItems - 1 ; i++){
            this.Stack[i] = this.Stack[i+1];
        }
        numItems--;
    }
    
    public int peak(){
        return this.Stack[numItems - 1];
    }


  public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int size(){
        return numItems;
    }
    
     private void makeStackBigger(){
        // double the array
        int[] temp = new int[numItems*2];
        // copy everything across
        for(int i = 0; i < numItems; i++){
            temp[i] = Stack[i];
        }
        // set our list to be the temp
        this.Stack = temp;
    }
}

