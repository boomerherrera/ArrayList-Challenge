import java.util.ArrayList;
public class ProgramRunner {

	public static void main(String[] args) 
	{
		ArrayList<Program> TVShows = new ArrayList<>();

        TVShows.add(new Program("The Office", "Comedy", 9));
        TVShows.add(new Program("Stranger Things", "Sci-Fi", 7));
        TVShows.add(new Program("Avatar: The Last Airbender", "Animation", 9));
        TVShows.add(new Program("Breaking Bad", "Drama", 5));
        TVShows.add(new Program("Family Guy", "Comedy", 20));
        printList();
	}

	public static void printList() 
	{
		for(int i = 0; i < Program.size(); i++)
		{
			
		}
		
	}

}
