package main;

import java.util.TreeMap;

public class Decaf implements IRobotCommand
{
    private IRobotCommand component ;

    public Decaf(IRobotCommand c)
    {
        this.component = c ;
    }
    
    public Decaf(){
    	
    }


    public String getCommand( ) 
    {
        return "" ; 
    }
    
    public void setOption(String o) 
    {
         
    }
    
    public TreeMap getOption() 
    {
    	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
    	tm.put(1, "no");
    	tm.put(2, "yes");
    	tm.put(3, "1/2");
    	
    	return tm;
    	
    }

}
