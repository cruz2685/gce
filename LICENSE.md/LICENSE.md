package eddy;

import java.io.*;
import java.util.Scanner;

public class WritingToFile
{
	private String fileName = null;
	private BufferedWriter bw;
	private boolean nameSet; 
	Scanner in = new Scanner(System.in);
	private boolean isFileNameString = false;
	
	public void setFileName()
	{
		while(!isFileNameString)
		{
			System.out.print("Enter the file name: ");
			if(in.hasNext("[0-9]"))
			{
				System.out.println("The name of the file has to have number and letter or just letter!!! ");
				isFileNameString = false;
				in.nextLine();
			}//END OF IF
			else
			{
				this.fileName = in.next();
				nameSet = true;
				isFileNameString = true;
				
			}//END OF ELSE
			System.out.println("The file name is: " + fileName);
		}//END OF WHILE
	}//END OF SETFILENAME
	
	public void setFileName(String fileName)
	{
		
		if(fileName.matches("[0-9]"))
		{
			while(!isFileNameString)
			{
				System.out.println("File name should be any combination of letter ");
				System.out.println("Enter file name: ");
				if(in.hasNext("[0-9]"))
				{
					System.out.println("The name of the file has to have number and letter or just letter!!! ");
					isFileNameString = false;
					in.nextLine();
				}//END OF IF
				else
				{
					this.fileName = in.next(fileName);
					nameSet = true;
					isFileNameString = true;
				}//END OF ELSE
			}//END OF WHILE
		}
		else
		{
			this.fileName = fileName;
			nameSet = true;
		}
	}
	public void setFileName(int fileName)
	{
		
		if(fileName >= 0 && fileName <= 10)
		{
			while(!isFileNameString)
			{
				System.out.println("File name should be any combination of letter ");
				System.out.println("Enter file name: ");
				if(in.hasNext("[0-9]"))
				{
					System.out.println("The name of the file has to have number and letter or just letter!!! ");
					isFileNameString = false;
					in.nextLine();
				}//END OF IF
				else
				{
					this.fileName = in.next();
					nameSet = true;
					isFileNameString = true;
				}//END OF ELSE
			}//END OF WHILE
		}
	}
	public void createWobj()
	{
		if(nameSet)
		{
			try
			{
				bw = new BufferedWriter(new FileWriter(fileName));
			}
			catch (IOException ioe) 
			{
				System.out.println("ERROR TRYING TO CREATE THE FILE");
			}//END OF CATCH
		}//END OF IF
		else
		{
			System.out.println("FILE NAME IS EMPTY" );
		}
	}
	public void writeToObj(String writeFIle)
	{
		if(nameSet)
		{
			try{
				bw.write(writeFIle);
			}
			catch (IOException ioe) 
		     {
				System.out.println("ERROR READING THE FILE ");
		     }//END OF CATCH
		}//END OF IF
		else
		{
			System.out.println("FILE NAME IS EMPTY");
		}
	}
	public void createNewLine()
	{	
		if(nameSet)
		{
			try
			{
				bw.newLine();
			}
			catch (IOException ioe) 
		    {
				System.out.println("ERROR WRITING A NEW LINE ");
		    }//END OF CATCH	
		}//END OF IF
		else
		{
			System.out.println("FILE NAME IS EMPTY");
		}
	}
	public void closeFile() throws IOException
	{
		if(nameSet)
		{
			try
			{
				bw.close();
			}
			catch (IOException ioe) 
		    {
				System.out.println("ERROR CLOSING THE FILE");
		    }//END OF CATCH
		}//END OF IF
		else
		{
			System.out.println("FILENAME IS EMPTY");
		}
	}
	boolean isNameSet()
	{
		if(fileName.isEmpty())
		{
			System.out.println("Name is empty: " );
			nameSet = true;
		}
		else
		{
			System.out.println("Name is set! ");
			nameSet = false;
		}
		return nameSet;
	}
}
