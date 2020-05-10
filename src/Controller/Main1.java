package Controller;
import Dao.*;
 
import java.io.*;
import java.sql.*;
import java.util.*;

 

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Main1 {
 
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("******Excel to Database Convertor*******");
    	System.out.println("----------------------------------------------");
    	System.out.println("Enter your Choice");
    	int x;
    	do {
    		System.out.println("1. Display DBMS");
        	System.out.println("2. Import to DBMS");
        	System.out.println("3. Exit");
        	 x= sc.nextInt();
        	switch(x) 
        	{
        		case 1 : 
        			System.out.println("Name            FatherName           City");
        			DisEx an = new DisEx();
        			an.getAllStudent();
        		case 2:
        			convert bn = new convert();
        			bn.func();
        			
        			
        	}   
        	
    	}while(x!=3);
    	
    	
    }
    }