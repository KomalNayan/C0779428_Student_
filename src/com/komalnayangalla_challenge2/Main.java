package com.komalnayangalla_challenge2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            File stuFile = new File("students.txt");
            FileWriter maleFile = new FileWriter("male_Students.txt",false);
            FileWriter femaleFile = new FileWriter("female_Students.txt",false);
            FileWriter emailFile  = new FileWriter("students_email.txt",false);
            Scanner reader = new Scanner(stuFile);
            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                //System.out.println(data);
                if(data.contains("Male"))
                {
                    maleFile.write(data+"\n");
                }
                if(data.contains("Female"))
                {
                    femaleFile.write(data+"\n");
                }
                String[] record = data.split("\t");
                //System.out.println(Arrays.toString(records));
                for(String column : record)
                {
                    if(column.contains("@"))
                    {
                        emailFile.write(column+"\n");
                    }
                }
            }
            reader.close();
            maleFile.close();
            femaleFile.close();
            emailFile.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("\nData Added Successfully to male_Students.txt , female_Students.txt and student_email.txt");
        }

    }
}
