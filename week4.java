week4.java


import java.io.*; 
// Import necessary classes for file handling

public class FileReaderExample
 {
    public static void main(String[] args) 
    {
        String fileName = "example.txt";
         // The name of the file to read

        try 
        {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader); 
            // Wrap FileReader with BufferedReader for efficient reading

            String line; 
            // A variable to store each line from the file

            // Read and print each line until the file ends
            while ((line = reader.readLine()) != null)
             {
                System.out.println(line);
                 // Display the content on the screen
            }

            // Close the file after reading
            reader.close();
        } catch (IOException e)
         {
            // Handle errors, like missing file
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}