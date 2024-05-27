/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.files;

import java.io.IOException;

/**
 *
 * @author mihai.hulea
 */
public class Teste {
    public static void main(String[] args) throws IOException {
        //FilesAndFoldersUtil.createFolder("tmp");
     //   FilesAndFoldersUtil.getFilesInFolder("tmp").stream().forEach(s->System.out.println(s));
      //  FileWriteUtil.writeUsingFiles("Line 1", "tmp\\test1.txt");
      //  FileReadUtil.readAllFileLines("tmp\\test1.txt").stream().forEach(System.out::println); //method refferece

       //Mac user
        FilesAndFoldersUtil.createFolder(System.getProperty("user.home") + "/Desktop/myFolder");
        FilesAndFoldersUtil.createFolder(System.getProperty("user.home") + "/Desktop/myFolder/tmp");
        FileWriteUtil.writeUsingFiles("Line 1", System.getProperty("user.home")+"/Desktop/myFolder/tmp/myFile.txt");
        
        
    }
   
}
