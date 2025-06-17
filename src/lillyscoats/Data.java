/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lillyscoats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author adg19f
 */
public class Data {
    static String[][] userData;
    static String[][] productData;
    Util u1 = new Util();
    
    public String[][] getData(String filename) throws IOException{
        int lines = u1.countline(filename);
        String [][] localArr = new String[lines][2];
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int index = 0;
        while((line=br.readLine())!=null){
            String[] lineDetails = line.split(",");
            for(int i=0; i<localArr[i].length; i++){
            localArr[index][i] = lineDetails[i];
        }
        index++;
        }
        return localArr;
    }
}
