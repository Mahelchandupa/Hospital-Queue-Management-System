/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mahel
 */
public class MainList {
   
   class Node{
        String name;
        int age;
        int patientid;
        String position;
        Node next;
        Node prev;

        public Node(String name,int age, int patientid, String position){
            this.age = age;
            this.name = name;
            this.patientid = patientid;
            this.position = position;
         }
    }

    Node head, tail = null;

    
    public boolean isEmpty() {
        return head == null;
    }
    public void addNode(String name,int age, int patientid, String position){
         
        Node newNode = new Node(name, age, patientid, position);

        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        
        else{
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null; 
        }
    }

    public void insertBeg(String name,int age, int patientid, String position){
         Node newNode = new Node(name, age, patientid, position);
         newNode.next = head;
         newNode.prev = null;
         
         if(head != null){
          head.prev = newNode;   
         }
         head = newNode;
    }
    
    public void InsertPos(String name,int age, int patientid, String position){
        Node temp = head;
       boolean cantFound = false;
        if(head == null){
            cantFound = true;
            addNode(name, age, patientid, position);
        }
        else{

        Node newNode = new Node(name, age, patientid, position);
        while (temp != null) {
          

            if(newNode.position.equals(temp.position)){
   
                if(temp.next == null){
                    cantFound = true;
                    insertLast(name, age, patientid, position);
                    break;
                 }
                 else if(!temp.next.position.equals(newNode.position)){
                    newNode.prev = temp;
                    newNode.next = temp.next;
                    temp.next = newNode;
                    newNode.next.prev = newNode;
                    cantFound = true;
                    break;
                 }
                  
            }
            temp = temp.next;   
        }
        if(cantFound == false){
            // insertLast(name, age, patientid, position);
            if(newNode.position.equals("Serious")){
                   insertBeg(name, age, patientid, position);
            }
            else if(newNode.position.equals("Critical")){
                       boolean cantFoundserious = false;
                               Node temppp = head;

                while(temppp != null){
                   
                    if("Serious".equals(temppp.position)){
                        
                      if(!"Serious".equals(temppp.next.position)){
                        newNode.prev = temppp;
                        newNode.next = temppp.next;
                        temppp.next = newNode;
                        newNode.next.prev = newNode;                 
                        temppp = temppp.next; 
                        cantFoundserious = true;
                        break;
                        
                      }
                    }
                    temppp = temppp.next;   
                }
                if (cantFoundserious == false) {
                         insertBeg(name, age, patientid, position);
                }
            }
            else{
               insertLast(name, age, patientid, position);  
            }
            
        }
      }
    }
    public void insertLast(String name,int age, int patientid, String position){
        Node newNode = new Node(name, age, patientid, position);
        tail.next =newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.name +"---" + current.age +"---" + current.patientid +"---" + current.position);    
            current = current.next;  
            System.out.println("");
            System.out.println("===========================");
        }  
    } 
    
      public int GetNth(String name)
    {
        Node current = head;
        int count = 1; 
        while (current != null)
        {
            if (current.name.equals(name)){
                return count;
            }
            count++;
            current = current.next;
        } 
        return 0;
    }
      
    public void deleteBeg()
    {
        Node temp = head;
        head = head.next;
        head.prev = null;
 
    }
    public void deleteEnd(){
        Node temp = tail;
        tail.prev.next = null;
        tail = tail.prev;
    }
  
    
}