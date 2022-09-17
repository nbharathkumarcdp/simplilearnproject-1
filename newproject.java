package Files;
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.List;
public class newproject {
	
	public static void main(String[] args) {
		
		
		int choice=-1;
		 ArrayList<String> al = new ArrayList<String>();
		Scanner Scn=new Scanner(System.in);
		System.out.println("Enter your choice here:");
		
		// 1. There are seven tasks which i have created.
		// 2. The tasks of each step are below 
		// Task-1:	WELCOME SCREEN 
		// Task-2:	CREATE A NEW FILE 
		// Task-3:	VIEW THE LIST OF FILES 
		// Task-4: 	DELETE THE FILE 5.SEARCH A FILE 
		// Task-5:	SEARCH A FILE
		// Task-6:	ASCENDING THE FILES
		// Task-0:	Exit THE APPLICATION
		// 3. i have used while loop to iterate the each task and it returns the respective block of statements which i have used the switch statements.
		
		while(choice!=0)
			
		{
			System.out.println("============Menu-Details========================");
			System.out.println("1. WELCOME SCREEN");
			System.out.println("2. CREATE A NEW FILE");
			System.out.println("3. VIEW THE LIST OF FILES");
			System.out.println("4. DELETE THE FILE");
			System.out.println("5. SEARCH A FILE");
			System.out.println("6. ASCENDING THE FILES");
			System.out.println("0.Exit");
			choice=Scn.nextInt();
			
			//This is one of block of code is when the user is enter the input those details are coming on the output screen of user details.
			//we have used Scanner here to enter the user input.
			
			switch(choice)
			{
				case 1:
				
					Scanner s1=new Scanner(System.in);
					
					System.out.println("Enter the Application Name"+ ":" );
					String str1=s1.nextLine();
					
					System.out.println("Enter Developer Name"+ ":");
					String str2=s1.nextLine();
					
					System.out.println("Enter the Developer Designation"+ ":");
					String str3=s1.nextLine();	
					System.out.println("Enter the institution Name"+ ":");
					String str4=s1.nextLine();
				System.out.println("============Welcome to Post Graduate Program in Full Stack Web Development =================");
				
				System.out.println("Application Name      : " +str1);
				System.out.println("Developer Name	      : " +str2);
				System.out.println("Developer Designation : " +str3);
				System.out.println("Institution Name      : " +str4);
				
				
				break;
				
			// This block of code is used to create a new file.
			//when we execute this block of code will create a file name is "mynewfile.txt"
				case 2:
					
					File f=new File("mynewfile.txt");
					
					try {
						boolean value=f.createNewFile();
						if(value) {
							System.out.println("The file is created");
						}
						else {
							System.out.println("The file is already exists");
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//  This block of code is used to view the list of all files in the directory.
				//  i have mentioned the directory path where the files has been saved.
				
				
				case 3:
					
					File directoryPath = new File("D:\\Docs");
					String contents[] = directoryPath.list();
					System.out.println("List of files and directories in the specified directory:");
					for(int i=0; i<contents.length; i++) {
				         System.out.println("  " +contents[i]);
					}
					
				 break;
				 
				 
				 // This block of code is used to delete the file which i have mentioned the path  in the file.
				 // if the mentioned file is there it returns file is deleted.
				 //if the mentioned file is not there it returns the statement of FNF(file not found).
				 
				case 4:
					
					File f1=new File("mynewfile.txt");
					boolean value=f1.delete();
					if(value) {
						System.out.println("The file is deleted.");
					}else
					{
						System.out.println("File not found.");
					}
				    
				  break;
				  
				  //  This block of code is used to search the file in the directory.
				  //  When we execute this block it ask us to enter the directory.
				  //  what ever the .txt files are there in the directory it search all the .txt files and returns the output of the file 
				  
				  
				case 5:
					
					Scanner user_input=new Scanner(System.in);
					
					String user_i;
					
					System.out.println("Directory");
					
					user_i=user_input.next();
					
					File dir=new File(user_i);
					
					for(File F:dir.listFiles()) {
						
						if(F.getName().contains(".txt")) {
							
							
							System.out.println(F.getName());
						}
					}
					
					break;
				
					  //  This block of code is used to display the files in ascending order.
					  //  When we execute this block it ask us to enter the directory.
					  //  what ever the files are there in this directory those files are returned in ascending order in the output. 
				
					
				case 6:
					
					Scanner input=new Scanner(System.in);
					
					String str;
					
					System.out.println("Enter the directory");
					
					str=input.next();
					
					File dir1=new File(str);
					
					for(File F1:dir1.listFiles())
					{
						if (dir1.isDirectory());
						{
							List listFile = Arrays.asList(dir1.list());
							
							System.out.println("Listing files unsorted");
							
							for(String s:dir1.list(null))
							{
								
								System.out.println(s);
								
							}
							
							Collections.sort(listFile);
							System.out.println("---------------------------------------");
							System.out.println("Sorting by filename in ascending order");
							for(String s:dir1.list(null))
							{
								System.out.println(s);
							}
						}
						
						break;
					}
					
						case 0:
							
							System.out.println("Exit The Application");
							
							break;
							
					} 
				}	
			}
		}

	
