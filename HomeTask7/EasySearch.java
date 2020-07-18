package HomeTask7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EasySearch implements ISearchEngine {
    private String content;
    public int search(String book, String word){
        try
        {
            content = new String(Files.readAllBytes(Paths.get(book)));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        int count = 0;
        int index = 0;
        while (index < content.length() && (index = content.indexOf(word, index)) >= 0){
            count++;
            index = index + word.length();
        }

        count++;
        return count;
    }

    public String getContent(){
        return this.content;
    }
}

//Вариант через регулярные выражения (строго по заданному регистру)
/*
        String[] parts = content.split("[ ,.!?=+—;:\"()%]");
        for(String var : parts){
            if(var.equals(word)){
                count++;
            }
        }

        return count;
 */