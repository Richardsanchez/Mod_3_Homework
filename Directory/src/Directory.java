/**
 * Created by richarddev on 2/23/17.
 */


import java.util.*;
import java.io.*;

public class Directory {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory name: ");

        File dir = new File(input.next());

        if (dir.isDirectory()) {
            System.out.println("Directory already exists");
            System.exit(0);
        }

        if (dir.mkdirs()) {
            System.out.println("Directory created successfully");
        }
    }
}
