public class Reader{

	public static ArrayList<String> read(String fileName){
		ArrayList<String> lines = new ArrayList<>();

		Scanner reader = null; 
        try { 
            reader = new Scanner(new File(fileName)); 
        } catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        } 
        if (reader == null) { 
            System.out.println("Empty File"); 
            System.exit(0); 
        } 
        while (reader.hasNextLine()) { 
            String sLine = reader.nextLine(); 
            lines.add(sLine); 
        } 
		return lines;
	}

}
