package main;
import java.util.Map;
import java.util.TreeMap;

public class Shots implements IRobotCommand
{

    private IRobotCommand component ;

 

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
    	tm.put(1, "1");
    	tm.put(2, "2");
    	tm.put(3, "3");
    	tm.put(4, "d (default)");

    	return tm;
    }
}
