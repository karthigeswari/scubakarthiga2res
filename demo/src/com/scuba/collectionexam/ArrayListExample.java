package com.scuba.collectionexam;

import java.util.ArrayList;



public class ArrayListExample{  
	  
		 public static void main(String args[]){  
			  ArrayList<String> list=new ArrayList<String>();
			  list.add("Mango");   
			  list.add("Apple");    
			  list.add("Banana");    
			  list.add("Grapes");    
			  //Traversing list through for-each loop  
			  for(String fruit:list)    
			    System.out.println(fruit);    
			  
			 }  }


