package main;
import java.util.TreeMap;

public class Milk implements IRobotCommand
{

    private IRobotCommand component ;



    public String getCommand( ) 
    {
        return "" ;
    }
    
    public void setOption(String o) 
    {
         
    }

	public TreeMap getOption() {
		// TODO Auto-generated method stub
    	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
    	tm.put(1, "WH");
    	tm.put(2, "NF");
    	tm.put(3, "1");
    	tm.put(4, "2 (whole milk,non-fat,1% or 2%)");

    	return tm;
	}
    
}
