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
public class Queue {
    private int[] Queue = new int[1];
   private int numItems = 0;
    
    
   
 public Queue(){
     
 }
 
 public void Enqueue(int num){
        // are we free to queue?
        if(numItems < this.Queue.length){
            // enqueue
            this.Queue[numItems] = num;
            // increase the count
            numItems++;
        }else{
            // its full, make it bigger
            makeQueueBigger();
            this.Queue[numItems]= num;
            numItems++;
        }
    }
    
    
    public void Dequeue(){
       
       
        for(int i = 0; i < numItems - 1 ; i++){
            this.Queue[0] = this.Queue[0+1];
        }
        numItems--;
    }
    
    public int peak(){
        return this.Queue[0];
    }


  public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int size(){
        return numItems;
    }
    
     private void makeQueueBigger(){
        // double the array
        int[] temp = new int[numItems*2];
        // copy everything across
        for(int i = 0; i < numItems; i++){
            temp[i] = Queue[i];
        }
        // set our list to be the temp
        this.Queue = temp;
    }
}

