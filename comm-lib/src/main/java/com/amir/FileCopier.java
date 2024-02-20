package com.amir;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;

public class FileCopier {
   

    public static void copyFileFromClasspath(String classpathFile, String destinationPath) {
        try {
            // Load the file from the classpath
            ClassPathResource resource = new ClassPathResource(classpathFile);
            InputStream inputStream = resource.getInputStream();

            // Destination file
            File destinationFile = new File(destinationPath);
            if(!destinationFile.exists()) {
            	System.out.println(destinationFile);
            	destinationFile.createNewFile();
            }

            // Copy the file to the destination
            Files.copy(inputStream, destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied to: " + destinationFile.getAbsolutePath());

            // Optionally, you can also use Spring's FileCopyUtils to copy the file
            // FileCopyUtils.copy(inputStream, new FileOutputStream(destinationFile));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
