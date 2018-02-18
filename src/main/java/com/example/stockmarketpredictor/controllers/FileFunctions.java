package com.example.stockmarketpredictor.controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFunctions
{

    public static void main( String [] args )
    {
        // create ArrayList to store the invetory objects
        List<Inventory> invItem = new ArrayList<>();
        try
        {
            // create a Buffered Reader object instance with a FileReader
            BufferedReader br = new BufferedReader(new FileReader("C:\\stocks\\inventory.txt"));

            // read the first line from the text file
            String fileRead = br.readLine();

            // loop until all lines are read
            while (fileRead != null)
            {

                // use string.split to load a string array with the values from each line of
                // the file, using a comma as the delimiter
                String[] tokenize = fileRead.split(",");

                // assume file is made correctly
                // and make temporary variables for the three types of data
                String tempItem = tokenize[0];
                int tempQty = Integer.parseInt(tokenize[1]);
                float tempPrice = Float.parseFloat(tokenize[2]);

                // creat temporary instance of Inventory object
                // and load with three data values
                Inventory tempObj = new Inventory(tempItem, tempQty, tempPrice);

                // add to array list
                invItem.add(tempObj);

                // read next line before looping
                // if end of file reached
                fileRead = br.readLine();
            }

            // close file stream
            br.close();
        }

        // handle exceptions
        catch (FileNotFoundException fnfe)
        {
            System.out.println("file not found");
        }

        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

        // display inventory
        for (Inventory each : invItem)
        {
            System.out.println("====================");
            System.out.println(each);
            System.out.println();
            System.out.printf("Total value = %8.2f %n", each.getTotal());
        }

    }

}
