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
public class ADT {
    
    
    public static void main(String[] args){
        Stack astack = new Stack();
        Queue aqueue = new Queue();
        
        aqueue.Enqueue(6);
        aqueue.Enqueue(8);
        aqueue.Enqueue(5);
        aqueue.Dequeue();
        
        System.out.println(aqueue.peak());
        System.out.println(aqueue.size());
        
        
        astack.Push(4);
        astack.Push(5);
        astack.Push(9);
        astack.pop();
        
        
        System.out.println(astack.size());
        System.out.println(astack.peak());
        
    }
    
}
