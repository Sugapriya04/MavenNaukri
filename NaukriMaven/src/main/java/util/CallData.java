package util;

import java.io.IOException;
import java.util.ArrayList;



public class CallData {
	
	
	public static void main(String[] args) throws IOException {
		RealExcelData d1=new RealExcelData();
	ArrayList data=d1.getData("Valid");
    
	
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	

}
}