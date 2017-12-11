/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListStack;

/**
 *
 * @author Dave
 */
public class LinkStack 
{
    private LinkList List;
    
    public LinkStack() // constructor
    {
        List = new LinkList();
    }
    
    public void push(int j) // put item on top of stack
    {
        List.insertFirst(j);
    }
    
    public void pop() // take item from top of stack
    {
        List.deleteFirst();
    }
    
    public boolean isEmpty() // true if stack is empty
    {
        return ( List.isEmpty() );
    }
    
    public String displayStack()
    {        
        return List.displayList();
    }
}


