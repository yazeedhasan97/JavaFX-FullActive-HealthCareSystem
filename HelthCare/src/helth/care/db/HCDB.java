/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helth.care.db;

import java.sql.*;
import java.time.LocalDate;

public class HCDB {
  
	private static Connection conn  = null ;
	public static void main(String... args) {
		String url = "jdbc:mysql:yazeed-cs:UMLDB";
		LocalDate ld = LocalDate.now();
		try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(url,"","");
                    Statement stmt = conn.createStatement();
                    
                    System.out.println(stmt.executeUpdate("INSERT INTO Employees (EmployeeID, FirstName, MiddleName, LastName,"
                            + "Birthdate, DateHired, Salary, PhoneNumber, UType) "
                            + "VALUES ("+ 1 + ",'Alaa','Ahmad','Ali',"+ld+","+ld+","+999.99+","+55555+","+"'Dr')"));
                    
		}catch(Exception e) {
			System.out.print(e.getMessage());
                }
//		}finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
	}

}

