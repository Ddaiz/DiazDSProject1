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
public class LinkList 
{
    private Link first; // ref to first item on list    
    public LinkList() // constructor
    { 
        first = null;   // no items on list yet
    } 
    
    public boolean isEmpty() // true if list is empty
    { 
        return (first == null);
    } 
    
    public void insertFirst(int value) // insert at start of list
    {   // make new link
        Link newLink = new Link(value);
        newLink.nextLink = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
    
    public int deleteFirst() // delete first item
    {   // (assumes list not empty)
        Link temp = first; // save reference to link
        first = first.nextLink; // delete it: first-->old next
        return temp.value; // return deleted link
    }
    
    public String displayList()
    {               
        Link current = first; // start at beginning of list
        String output = "";
        while (current != null) // until end of list,
        {   
            output  += Integer.toString(current.displayLink()) + "\n"; // print datacurrent              
            current = current.nextLink; // move to next link    
        }
        return output;
    } 
}
