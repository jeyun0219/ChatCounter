
public class FileLoader {

	
	private Arrayliststring messages;
	
	public void readDirectory(String path)
	{
		
		getFilename(path);
	}
	
	private Arraylist<File> getfileMembers(String path)
	{
		Arraylist<File> fileNames = new ArrayList<File>();
		
		
		File mypath = new File(path);
		
		for(File filename:myPath.listFiles())
		{
			fileNames.add(filenames);
		}

	}
}
