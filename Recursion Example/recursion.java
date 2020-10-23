/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author 12201027
 */
public class recursion{
    Node head = null;
    public static int [] a = {10,20,30,40};
    public static void main(String [] args){
        System.out.println(factorial(6));
        System.out.println(fibonacci(2));
        Object e = binarysearch(30,0, a.length-1);
        System.out.println(e);
        binarynumber(12);
       
    }
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
           return  fibonacci(n-1)+ fibonacci (n-2);
        }
    }
    public static int binarysearch(int x, int leftend, int rightend ){
        if(leftend>rightend){
            return -1;
        }
     
        int mid = (leftend + rightend)/2;
        if(x== a[mid]){
            return mid;
        }else if( x>a[mid]){
           return binarysearch(x, mid+1,rightend);
        }else if(x<a[mid]){
            return binarysearch(x, leftend, mid-1);
        }
        return -1;
        
        
    }
    public static void binarynumber(int x){
        int remainder = x%2;
        if(x!=0){
            binarynumber(x/2);
        System.out.print(remainder + " ");
        }
        }
}
        class Node{
       public Object element;
       public Node next;

       public Node(Object e, Node n){
         element =e ;
         next = n;

       }
       public void insert (Object val, head){
           Node mn = new Node (val, null);
           if(head ==null){
               
           }
       }
  
}
    
        
    
