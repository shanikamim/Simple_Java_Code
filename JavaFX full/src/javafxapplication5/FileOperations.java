/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author User
 */
public class FileOperations {
    private static final String FILE_LOCATION = "C:\\Users\\User\\Desktop\\MAHB\\info.txt";
    
    public void dataSaveIntoFile(String data){
        try{
            Path filePath = Paths.get(FILE_LOCATION);
            Files.write(filePath, data.getBytes(), StandardOpenOption.APPEND);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
