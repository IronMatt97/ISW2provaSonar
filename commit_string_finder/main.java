package commit_string_finder;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		String str = "added";
		CommitStringFinder sf= new CommitStringFinder();
		sf.search(str);
	}
}
