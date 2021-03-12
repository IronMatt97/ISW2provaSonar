package commit_string_finder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommitStringFinder 
{
	public void search(String s) throws InterruptedException, IOException
	{
		String report="Commit IDs which contain '"+s+"' in the update message found in this directory:\n";
		String line = "";
		String id = "";
		Boolean found=false;
		int count = 0;
		
		Process pr = Runtime.getRuntime().exec("git log");
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		
		while ((line=buf.readLine())!=null) {
			if (count%5==0)
			{
				id = line;
			}
			if (count%5==4)
			{
				if(line.contains(s))
						{
							found=true;
							report = report + id + "\n";
						}
			}
			count++;
			//System.out.println(line);
		}
		if (found)
			System.out.println(report);
		else
			System.out.println("No commit containing '"+s+"' in the update message was found in the current directory.\n");
	}
}
