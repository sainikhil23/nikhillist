package com.task.list;

import java.util.ArrayList;
import java.util.Scanner;

class customlist{
customlist(){
	ArrayList<Integer> l=new ArrayList<Integer>();  
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      l.add(6);
      l.add(7);
      l.add(8);
      l.add(9);
      l.add(10);
      
  

      System.out.println(l);
      
     System.out.println("Select any one of the operation\n1.Add\n2.Delete");
     Scanner sc = new Scanner(System.in);
     Integer scan = sc.nextInt();
     
  if(scan==1) {
	  add(l);
	  System.out.println(l);
	  
  }else if(scan==2) {
	  delete(l);
	  System.out.println(l);
	  
  }else {
	  System.out.println("Invalid operator selected");
  }
 
  
     
 

}

 private ArrayList<Integer> delete(ArrayList<Integer> l) {
	 System.out.println("Enter the position of the  element to be deleted");
	  Scanner s = new Scanner(System.in);
	  Integer scan1 = s.nextInt();
	  l.remove(scan1);
	  return l;
}

 private ArrayList<Integer> add(ArrayList<Integer> l) {
	System.out.println("How many elements do you want to add");
	  Scanner scc = new Scanner(System.in);
	     Integer sss = scc.nextInt();
	     int t;
	     for(t=1;t<=sss;t++) {
	  System.out.println("Enter the value of the new element");
	  Scanner s = new Scanner(System.in);
	  Integer scan1 = s.nextInt();
	  l.add(scan1);}
	  return l;
	
}
}

public class Taskclass 
{
    public static void main( String[] args ) {
 
    
    		customlist c = new customlist();
    }
}

    	