package com.org.basics2;

import java.util.*;  
class TestArrayList{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Abhi");//Adding object in arraylist  
list.add("Mehu");  
list.add("Liki");  
list.add("cheeru");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
