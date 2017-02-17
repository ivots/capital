package main;
import java.util.Map;
import java.util.TreeMap;

public class Drink implements IRobotCommand
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
    	tm.put(1, "A");
    	tm.put(2, "L");
    	tm.put(3, "M");
    	tm.put(4, "C");
    	tm.put(5, "CM");
    	tm.put(6, "CDL");
    	tm.put(7, "E");
    	tm.put(8, "EPC (for Caffe Americano, Caffe Latte,etc...)");

    	return tm;
    }
}
