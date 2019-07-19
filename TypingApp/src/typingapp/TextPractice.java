/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

import java.util.ArrayList;

/**
 *
 * @author Relax
 */
public class TextPractice {
    private ArrayList<String> lines=new ArrayList<String>();
    private int LineCounter=0;
    private int WordCounter=0;
    public void setText(String txt)
    {
        String [] textLine=txt.split("\n");
        for (String tl : textLine) {
            String cleanedLine=tl.replaceAll("^ +| +$|( )+", "$1");
            if(cleanedLine.length()==0)continue;
            lines.add(cleanedLine);
        }
    }

    /**
     *
     * @param numberOfLines
     * @return
     */
    public ArrayList<String> getLines(int  numberOfLines)
    {
        ArrayList<String> lineRecieved=new ArrayList<String>();
        for (;LineCounter<lines.size() &&LineCounter<(LineCounter +numberOfLines) ;LineCounter++ )
                lineRecieved.add(lines.get(LineCounter));
        return lineRecieved;
    }
}
