package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.io.IOException;
public class Mavenproject1 {

 public static void main(String[] args)throws IOException {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of an array");
        size=input.nextInt();
        System.out.println("");
        
        int[] arr;  
        arr=new int[size];
        for(int j=0;j<size;j++){
            System.out.print("Enter the number "+j+" :\t");
            arr[j]=input.nextInt();
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(size);
        System.out.println("");
        
        int numSearch;
        System.out.print("what number doyou want to search? ");
        numSearch=input.nextInt();
        
        boolean found=false;
        for(int i=0;i<size;i++){
            if(numSearch==arr[i]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(numSearch+ "is Avaible");
        } else{
            System.out.println(numSearch+ "Not Avaible");
        }
        
        int numToReplace;
        int numReplacing;
        System.out.print("What number do you want to replace");
        numToReplace=input.nextInt();
        System.out.print("What will be the new number"); 
        numReplacing=input.nextInt();
            for(int j=0;j<size;j++){
                if(numToReplace==arr[j]){
                    arr[j]=numReplacing;
                }
            }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
    }
}
