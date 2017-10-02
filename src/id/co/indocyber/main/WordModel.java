/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordModel {

    private String basicWord;
    private String jawaban;
    private String hint;

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }
    
    public String acakSoal(){
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);
        
        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    public boolean cekJawaban(){
        boolean hasil = false;
        if(getJawaban().equalsIgnoreCase(basicWord))
            hasil = true;
        
        return hasil;
    }
    
    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
    
}
