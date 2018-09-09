package  database;		
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  ConnMySQL {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException
    	{													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:mysql://localhost:3306/selenium?";					

				//Database Username		
				String username = "root";	
                
				//Database Password		
				String password = "root";				

				//Query to Execute		
				String query = "select *  from seleniumuser;";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String firstname = rs.getString(1);								        
                            String email = rs.getString(2);					                               
                            System. out.println(firstname+"  "+email);		
                    }		
      			 // closing DB Connection		
      			con.close();			
		}
}