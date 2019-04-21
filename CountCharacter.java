
public class CountCharacter {
	
	public void find(String msg, String lookfor)
	{
		int i, found;
		
		i = 0;
		found = 0;
		
		for (; i < msg.length(); i++)
		{
			if (msg.substring(i, i + 1).equals(lookfor.substring(0, 1)) && (i + lookfor.length()) <= msg.length())
			{
				if (msg.substring(i, i + lookfor.length()).equals(lookfor))
				{
					found++;
					
					i = i + lookfor.length() - 1;
				}
			}
			
		}
		
		System.out.println("Matches found: " + found);
	}

}
