/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.notepad.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author milan
 */
public class Helper {
    
    public static String read(File file) throws IOException{
        StringBuilder content = new StringBuilder();
        String line="";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                content.append(line + "\r\n");
            }
            reader.close();
            return content.toString();
    }
    
    public static void write(File file, String content) throws IOException{
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
            
        }
    }
    

