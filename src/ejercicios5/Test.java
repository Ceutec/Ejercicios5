/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author turupawn
 */
public class Test {
    
    static void deleteIfExists(String filename)
    {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        } 
    }
        
    public static void main(String[] args) {
       
        deleteIfExists("test1.txt");
        deleteIfExists("test2.txt");
        deleteIfExists("test3.txt");
        deleteIfExists("test4.txt");
        deleteIfExists("test5.txt");
        deleteIfExists("test6.txt");
        deleteIfExists("test7.txt");
        deleteIfExists("test8.txt");
        deleteIfExists("test9.txt");
        deleteIfExists("test10.txt");
        
    }
}
