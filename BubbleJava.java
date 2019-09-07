import java.io.*;
import java.util.Scanner; 

class Methods{
void bubble(int arr[], int size){
int i,j,t;
for (i = 0; i< size-1; ++i)
{for (j = 0; j< size-i-1; ++j) 
{if(arr[j]>arr[j+1])
{t = arr[j];
arr[j] = arr[j+1];
arr[j+1] =t;}}}
}
void printarray(int arr[], int size){
System.out.println("\n SORTED ARRAY IS :");
for(int i = 0 ; i< size ; ++i)
System.out.println(arr[i]);
}
}

class BubbleJava {
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
Methods m = new Methods();
int[] arr = new int[20];
int size;
size = scan.nextInt();
for(int i = 0; i<size; ++i){
arr[i] = scan.nextInt();
}
m.bubble(arr, size);
m.printarray(arr, size);
}
}