/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListStack;

public class Link 
{
    public int value; // int value input
    public Link nextLink; // next link in list
   
    public Link(int dd) // constructor
    { 
        value = dd;
    }
    
    public int displayLink() // display Link
    { 
        return value;
    }
} // end class Link