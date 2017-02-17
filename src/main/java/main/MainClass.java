package main;

import java.util.Scanner;
import java.util.TreeMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Properties;
public class MainClass {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);  

		   iPhone ip=new iPhone();
		   System.out.println("Type one of the following Decaf options:");  
		   Decaf d=new Decaf();
		   TreeMap<Integer, String> tmDecaf=d.getOption();
		   for(int i: tmDecaf.keySet()){
			   System.out.println(i+"-"+tmDecaf.get(i));
		   }
		   
		   int decafOption=sc.nextInt(); 
		   ip.setDecaf(tmDecaf.get(decafOption));

		   System.out.println("Type one of the following Shots options:");  
		   Shots s=new Shots();
		   TreeMap<Integer, String> tmShots=s.getOption();
		   for(int i: tmShots.keySet()){
			   System.out.println(i+"-"+tmShots.get(i));
		   }
		   int shotOption=sc.nextInt(); 
		   ip.setShots(tmShots.get(shotOption).substring(0, 1).toUpperCase());
		   
		   System.out.println("Type one of the following Milk options:");
		   Milk m=new Milk();
		   TreeMap<Integer, String> tmMilk=m.getOption();
		   for(int i: tmMilk.keySet()){
			   System.out.println(i+"-"+tmMilk.get(i));
		   }
		   int milkOption=sc.nextInt(); 
		   ip.setMilk(tmMilk.get(milkOption));
		   
		   System.out.println("Type one of the following Drink options:");  
		   Drink dr=new Drink();
		   TreeMap<Integer, String> tmdr=dr.getOption();
		   
		   for(int i: tmdr.keySet()){
			   System.out.println(i+"-"+tmdr.get(i));
		   }

		   int drinkOption=sc.nextInt(); 
		   sc.close();  

		   ip.setDrink(tmdr.get(drinkOption));
		   
		  System.out.println(ip.sendCommand());
		   
		   
	}
}