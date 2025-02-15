package com.tit.day03javastreams.filehandling;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFileHandler to test file handling operations
public class TestFileHandler {

    @Test
    public void testCopyFile ()throws IOException{
        FileHandler fh = new FileHandler();

        //create temporary and the source file
        File source = new File("src/main/java/com/tit/day03javastreams/filehandling/LargeText.txt");
        File destination = new File("src/main/java/com/tit/day03javastreams/filehandling/CopyFileText.txt");
        // Write some content to the source file
        try (FileWriter writer = new FileWriter(source)) {
            writer.write("This is a test.");
        }

        // Copy the file
        fh.copyFile(source.getPath(), destination.getPath());

        // Read the contents of the destination file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(destination))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        // Expected content
        String expectedContent = "This is a test.";

        // Asserting the file content
        assertEquals(expectedContent, content.toString());

        // Clean up temporary files
        source.delete();
        destination.delete();

        System.out.println("File Copy Test Passed");
    }
    }

