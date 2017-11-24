package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Test
{

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
        String finalOutputFile = "C:\\pos_upload\\work\\session-2017-07-24_14_02_01\\new-pos-data_1 - Copy.csv";
        
        List<String> keyWords = new ArrayList<>();
        
        keyWords.add("5678");   
        keyWords.add("123456789012");
        
        try(BufferedReader br = new BufferedReader(new FileReader(finalOutputFile))) {
        	
    		FileWriter fw = new FileWriter(new File(finalOutputFile).getParent() + "\\" + "temp-"+ new File(finalOutputFile).getName());
    		BufferedWriter bw = new BufferedWriter(fw);
			
            String line = br.readLine();

            while (line != null) {
            	
            	boolean matchFound = false;
            	for (String key : keyWords) {
            		if(line.contains(key))
            		{
            			matchFound = true;
            		}
            	}
                if (!matchFound)
                {
                	bw.write(line);
                    bw.write(System.lineSeparator());
            	}
                line = br.readLine();
            }
            
            bw.close();
        }
        
        
        try {
            //new File(finalOutputFile).deleteOnExit();
            
            String tmp = new File(finalOutputFile).getParent() + "\\" + "temp-"+ new File(finalOutputFile).getName();
            
            //new File(tmp).renameTo(new File(finalOutputFile));
            
            java.nio.file.Files.move(Paths.get(tmp), Paths.get(finalOutputFile), StandardCopyOption.REPLACE_EXISTING);
            
        } catch(Exception e){
        	
        	System.out.println(e.getMessage());
        	
        }
    }

}
