package com.javatpoint;  
  
import java.util.Iterator;  
import java.util.*;  
  
public class Question {  
private int id;  
private String name;  
private Set<String> answers;  
  
public Question() {}  
public Question(int id, String name, Set<String> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
  
}  