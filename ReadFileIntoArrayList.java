import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List;
import java.util.*;
import java.io.File;
import java.util.Arrays;
import java.util.Optional; 

public class ReadFileIntoArrayList {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(new File("BoyNames.txt"));
		ArrayList<String> listS=new ArrayList<String>();
		ArrayList<Integer> listI=new ArrayList<Integer>();
		
		while(s.hasNextLine())
			listS.add(s.nextLine());
		
		System.out.println(listS);
		
		String array[] = new String[listS.size()];              
		for(int j =0;j<listS.size();j++){
		  array[j] = listS.get(j);
		}


		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String input= sc.nextLine();  
        boolean stringExists = substringExistsInArray(input, array);
		

		
		System.out.println();
		System.out.println(stringExists);
		System.out.println(getFirstMatchingSubstring(input, array));
		

		if(stringExists==false){
			String b=input.substring(0,3);
			for(int i=0;i<=array.length-1;i++){
				if((array[i].substring(0,3))==b){

			    if(stringExists==false){
			
			    System.out.println("The substring of the input is contained in the array");
		}
			
		}
			}
		}
			
		if(stringExists==false){
			
			//System.out.println("The input "+ input +" is not contained in the array");
			System.out.println("The Substring of input "+ input +" is contained in the array");
		}
			
		else{
			System.out.println("The Substring of input "+ input +" is contained in the array");
		}
		

     
	}
	
	
	 public static boolean substringExistsInArray(String inputStr, String[] items) {
        return Arrays.stream(items).parallel().anyMatch(inputStr::contains);
     }

     public static Optional getFirstMatchingSubstring(String inputStr, String[] items) {
       return Arrays.stream(items).parallel().filter(inputStr::contains).findAny();
     }
	
}



        
        
