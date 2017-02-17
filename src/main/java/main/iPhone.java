package main;
public class iPhone
{
    public iPhone( ) { }

    String decaf;
    String shot;
    String milk;
    String drink;
    
    public void setDecaf(String s)
    {
    	decaf="Decaf["+s+"]";
        // input: NO, YES and 1/2
        
    }
    
    public void setShots(String s)
    {
    	shot="Shots["+s+"]";// input: 1, 2, 3, d
    }

    public void setMilk(String s)
    {
    	milk="Milk["+s+"]"; // input: WH, NF, 1, 2
    }
    
    public void setDrink(String s)
    {
    	drink="Drink["+s+"]";// input: A, L, M, C, CM, CDI, E, ECP
    }
    
 
    
    
    public String sendCommand()
    {
    	
        // return command string for robot
        StringBuilder sb=new StringBuilder();
        sb.append("Robot:");
        if(decaf!=null&&decaf.length()>0){
        	sb.append(" ").append(decaf);
        }if(shot!=null&&shot.length()>0){
        	sb.append(" ").append(shot);
        } if(milk!=null&&milk.length()>0){
        	sb.append(" ").append(milk);
        }if(drink!=null&&drink.length()>0){
        	sb.append(" ").append(drink);
        }
        decaf="";
        shot="";
        milk="";
        drink="";
        return sb.toString();
    }
}
