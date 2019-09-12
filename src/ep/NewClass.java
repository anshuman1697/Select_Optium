package ep;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewClass {
    //int 
    static ArrayList<Integer> Emp;
    static ArrayList<Integer> Leader;
    static int x,y;
    static{
try  {
     java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
          String query ="select * from emp_pre";
          PreparedStatement ps=conn.prepareStatement(query);
          ResultSet rs=ps.executeQuery();
          ResultSetMetaData rst=rs.getMetaData();
          int columnCount = rst.getColumnCount();
          Emp = new ArrayList<>(columnCount);
          
          while(rs.next()){
              int i=2;
              while(i<=columnCount)
              {
                  Emp.add(rs.getInt(i++));
              }
          }
          
      x=Emp.size();
      x=x/5;
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    
    static{
try  {
     java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
          String query ="select * from leader_pre";
          PreparedStatement ps=conn.prepareStatement(query);
          ResultSet rs=ps.executeQuery();
          ResultSetMetaData rst=rs.getMetaData();
          int columnCount = rst.getColumnCount();
          Leader = new ArrayList<>(columnCount);
          
          while(rs.next()){
              int i=2;
              while(i<=columnCount)
              {
                  Leader.add(rs.getInt(i++));
              }
          }
          
     y=Leader.size();
     y=y/5;
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    
//static int [][]d;
    
    public Integer[][] get(){
        Integer [][]a = new Integer[x][5];
        
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<5;j++)
            {
                int g=5*i+j;
                a[i][j]=Emp.get(g);
            }
        }
        
        
        return a;
        
    }
    
    public Integer[][] get1(){
        Integer [][]b = new Integer[y][5];
        
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<5;j++)
            {
                int g=5*i+j;
                b[i][j]=Leader.get(g);
            }
        }
        
        
        return b;
        
    }
    
public static void main(String args[]){
    System.out.println(Emp);
    System.out.println(Leader);
    
    Integer [][]a=new NewClass().get();
    Integer [][]b=new NewClass().get1();
    Integer [][]d=new Integer[x+y][5];
    Integer e=0;
    
    for(Integer []c:a)
    {
       for(Integer y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }

    for(Integer []c:b)
    {
       for(Integer y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }
    
    for(int i=0;i<(x);i++)
    {
        for(int j=0;j<5;j++)
        {
           d[i][j]=a[i][j]; 
        }
    }
    e=x;
    for(int i=0;i<(y);i++)
    {
        for(int j=0;j<5;j++)
        {
           d[e][j]=b[i][j]; 
        }
        e++;
    }
    
    System.out.println("Main Array");
    
    for(Integer []c:d)
    {
       for(Integer y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }
    
}
}
