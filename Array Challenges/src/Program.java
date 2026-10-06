
public class Program 
	{

		private String title;
		private String genre;
		private int numberOfSeasonsAired;
	
		public Program(String t, String g, int n)
			{
			title = t;
			genre = g;
			numberOfSeasonsAired = n;
			}
		public String getTitle()
		{
			return title;
		}
		public String getGenre()
		{
			return genre;
		}
		public int getNumberOfSeasonsAired()
		{
			return numberOfSeasonsAired;
		}

	}
	

