/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahel
 */
public class PatientMedicinesList {
       class Node{
        String name;
        int patientid;
        String medicines;
        String health;
        Node next;
        Node prev;

        public Node(int patientid, String name, String health, String medicines){
            this.name = name;
            this.patientid = patientid;
            this.health = health;
            this.medicines = medicines;
         }
    }

    Node head, tail = null;
    public boolean isEmpty() {
        return head == null;
    }

    
    public void addNode(int patientid, String name, String health, String medicines){
         
        PatientMedicinesList.Node newNode = new PatientMedicinesList.Node(patientid, name, health, medicines);

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
    
     public void InsertPos(int patientid, String name, String health, String medicines){
        Node temp = head;
        boolean cantFound = false;
        if(head == null){
            cantFound = true;
            addNode(patientid, name, health, medicines);
        }
        else{

        Node newNode = new Node(patientid, name, health, medicines);
        while (temp != null) {
          

            if(newNode.health.equals(temp.health)){
   
                if(temp.next == null){
                    cantFound = true;
                    insertLast(patientid, name, health, medicines);
                    break;
                 }
                 else if(!temp.next.health.equals(newNode.health)){
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
             insertLast(patientid, name, health, medicines);
        }
      }
    }
     
    
    public void insertLast(int patientid, String name, String health, String medicines){
        Node newNode = new Node(patientid, name, health, medicines);
        tail.next =newNode;
        newNode.prev = tail;
        tail = newNode;
    }

}
