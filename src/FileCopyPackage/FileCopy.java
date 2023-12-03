package FileCopyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
    	
        String sourceFileName = args[0];
        String destinationFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            System.out.print("Destination file already exists. Overwrite? (Y/N): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            scanner.close();
            
            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("File not overwritten. Exiting.");
                return;
            }
        }

        try {
        	FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int b = fis.read();
            while(b != -1) {
            	fos.write(b);
            	b = fis.read();
            }
            		
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while copying the file.");
        }
    }
}
