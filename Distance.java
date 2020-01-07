import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Distance {

    /*Need an array to store the information
      Scanner to load the file into the program
      for loop to index the array
      Format on the final print out to make sure that it looks good
    */
    public static void main(String[] args) throws FileNotFoundException {

        //Creation of the array
        String[] city = new String[8];
        int[][] distance = new int[8][8];
        int nDistance = distance[0].length;
        int numCities;

        //Find out which folder the user is currently using
        //And create a JFileChooser to get the file you need
        String currentFolder = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(currentFolder);
        int result = fc.showOpenDialog(null);
        //Attach a scanner to the file
        Scanner file = new Scanner(fc.getSelectedFile());
        //In case the user doesn't chose a file
        if (result != JFileChooser.APPROVE_OPTION)
            System.exit(0);
        System.out.println(file.nextLine());

        /*while (file.hasNext()) {
            for (numCities = 0; file.hasNext(); numCities++) {
                city[numCities] = file.next();
                String[] row = file.nextLine().split(" ");
                for (int i = 1; i < row.length; i++) {
                    distance [1][i] = Integer.parseInt(row[i]);
                }
            }
            for (int i = 0; i<city.length; i++) {
                for (int j = 1; j<distance[i].length; j++)
                    System.out.print(distance[i][j] + " ");
                System.out.println();
            }
        }*/
    }
}