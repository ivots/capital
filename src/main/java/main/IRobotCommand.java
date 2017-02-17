package main;
import java.util.TreeMap;

public interface IRobotCommand
{
     String getCommand( ) ;    
     void setOption(String o) ;
     public TreeMap getOption() ;
}
