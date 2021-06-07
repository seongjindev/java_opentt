package OpenInOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExInOutput {
    public static void main(String[] args){
        System.out.println(args.length);
        for(String s: args){
            System.out.println(args);
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        try{
            File file = new File("out.txt");
            Scanner scf = new Scanner(file);
            while(scf.hasNextInt()){
                System.out.println(scf.nextInt() * 1000);
            }
            scf.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
