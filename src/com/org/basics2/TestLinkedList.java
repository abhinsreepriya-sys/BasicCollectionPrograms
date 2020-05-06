package com.org.basics2;

import java.util.*;  
class TestLinkedList{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("abhz");//Adding object in arraylist  
list.add("mehzz");  
list.add("anjzz");  
list.add("rikzz");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
