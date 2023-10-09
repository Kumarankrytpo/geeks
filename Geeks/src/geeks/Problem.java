/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author kumaran.renganathan
 */

class Problem implements pblms{
    public void secondLargest(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int len = scan.nextInt();
            int[] arr = new int[len];
            System.out.println("Enter the arrya Elments :");
            for(int i=0;i<len;i++){
                arr[i] = scan.nextInt();
            }
            ArrayList<Integer> al = new ArrayList();
            for(int i=0;i<arr.length;i++){
                if(!al.contains(arr[i])){
                    al.add(arr[i]);
                }
            }
            Collections.sort(al);
            
            Arrays.sort(arr);
            if(arr.length==1){
                System.out.println("Largest : "+al.get(al.size()-1));
            }else{
                System.out.println("Largest : "+al.get(al.size()-2)+" "+al.get(al.size()-1));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void longSeries(){
        try{
            System.out.println("Enter the Value if N : ");
            int n = scan.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                count = count+i;
            }
            System.out.println("Count : "+count);
        }catch(Exception e){
            
        }
    }
    
    public void Value_equal_to_index_value(){
        try{
            System.out.println("Enter the size of the array :");
            int size=  scan.nextInt();
            System.out.println("Enter the array elements : ");
            int arr[] = new int[size];
            for(int i=0;i<size;size++){
                arr[i] = scan.nextInt();
            }
            ArrayList<Integer> al = new ArrayList();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==i+1){
                    al.add(arr[i]);
                }
            }
            System.out.println("Retun vertex : "+al.toString());
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Sum_of_Array_Elements() {
        try {
            System.out.println("Enter the size of the elements : ");
            int a = scan.nextInt();
            System.out.println("Enter the array elements : ");
            int arr[]= new int[a];
            for(int i=0;i<a;i++){
                arr[i] = scan.nextInt();
            }
            int count=0;
            for(int i=0;i<a;i++){
                count = count + arr[i];
            }
            System.out.println("Toatal : "+count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Print_alternate_elements_of_an_array(){
        try{
            System.out.println("Enter the size of the array : ");
            int size = scan.nextInt();
            System.out.println("Enter the array elements :");
            int arr[] = new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i] = scan.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    System.out.println(arr[i]+" ");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Palindromic_Array(){
        try{
            System.out.println("enter the size of the array : ");
            int size = scan.nextInt();
            System.out.println("Enter the elements of the array : ");
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = scan.nextInt();
            }
            int count=0;
            for(int i=0;i<size;i++){
                if(palindrome(arr[i])){
                    count++;
                }
            }
            if(count==size){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean palindrome(int a){
        boolean flag=false;
        try{
            String b="";
            int temp=a;
            while(a!=0){
                b=b+String.valueOf(a%10);
                a=a/10;
            }
            if(temp==Integer.parseInt(b)){
                flag=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public int h;
    public void Print_1_To_N_Without_Loop(){
        try{
            System.out.println("Enter the value of N :");
            int n = scan.nextInt();
            boolean a = true;
            this.h =n;
            recursive(1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void recursive(int a){
        if(a!=h+1){
            System.out.print(a+" ");
            a++;
            recursive(a);
        }
        
    }
    
    public void Missing_number_in_array(){
        try{
            System.out.println("Enter the number : ");
            int a = scan.nextInt();
            int arr[] = new int[a];
            System.out.println("Enter the array elements : ");
            for(int i=0;i<a;i++){
                arr[i] = scan.nextInt();
            }
            for(int i=0;i<a;i++){
                for(int j=i+1;j<a;j++){
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            int start = arr[0];
            for(int i=0;i<a;i++){
                if(arr[i]!=start){
                    System.out.println("element : "+start);
                }else{
                    start++;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Print_the_pattern_Set1(){
        try{
            System.out.println("Enter the value of N : ");
            int n = scan.nextInt();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Arrays_Sum_of_array(){
        try{
            System.out.println("Enter the size : ");
            long n = scan.nextLong();
            long[] arr = new long[(int)n];
            for(int h=0;h<n;h++){
                arr[h] = scan.nextLong();
            }
            long count=0;
            for(long p : arr){
                count=count+p;
            }
            System.out.println("Result : "+count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void countOfElements(){
        System.out.println("Enter the array size : ");
        int size  = scan.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the target value : ");
        int x=scan.nextInt();
        long a = 0;
        for(int i=0;i<size;i++){
            if(arr[i]!=x && arr[i]>x){
                a=i;
                break;
            }
        }
        System.out.println("This elements size : "+a);
    }
    
    public void sumofArray(){
        System.out.println("Enter the size of the array : ");
        int size  = scan.nextInt();
        System.out.println("Enter the elements of the array : ");
        long arr[] = new long[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextLong();
        }
        long total=0;
        for(long n:arr){
            total = total+n;
        }
        System.out.println("This total sum of the array : "+total);
    }
    
    public void printElementsofArray(){
        System.out.println("Enter the size of the array : ");
        int size  = scan.nextInt();
        System.out.println("Enter the array elements ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
    public void findIndex(){
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        System.out.println("Enter the array Elements ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the key value : ");
        int key = scan.nextInt();
        int rtnarr[] = new int[2];
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(arr[i]==key && !flag){
                rtnarr[0]=i;
                flag=true;
            }else if(flag && arr[i]==key && rtnarr[1]<i){
                rtnarr[1]=i;
            }
        }
        if(rtnarr[0]!=0 && rtnarr[1]==0){
            rtnarr[1]=rtnarr[0];
        }else if(!flag){
            rtnarr[0]=-1;
            rtnarr[1]=-1;
        }
        
        System.out.println("This final array : "+Arrays.toString(rtnarr));
    }
    
    public void swapKthElements(){
        System.out.println("Ente the size of the array : ");
        int size  = scan.nextInt();
        System.out.println("Enter the array Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the key value : ");
        int k=scan.nextInt();
        
        if(k>arr.length){
            System.out.println("No in array");
        }else{
            int temp = arr[k-1];
            arr[k-1] = arr[arr.length-k];
            arr[arr.length-k]=temp;
        }
        System.out.println("Final array ; "+Arrays.toString(arr));
    }
    public void displayLongestName(){
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        System.out.println("Enter the array Elements : ");
        String names[] = new String[size];
        for(int i=0;i<size;i++){
            names[i] = scan.next();
        }
        
        String ln = "";
        for(String s : names){
            if(s.length()>ln.length()){
                ln = s;
            }
        }
        System.out.println("This is longest names : "+ln);
    }
    
    public void cPlusPlusArrayPrintAnElement(){
        System.out.println("Enter the size if the array : ");
        int size = scan.nextInt();
        System.out.println("Enter the array Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the key value : ");
        int index = scan.nextInt();
        System.out.println("This is index value "+arr[index]);
    } 
    
    public void perfectArrays(){
        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();
        System.out.println("Enter the array Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        
        int right=0,left=arr.length-1;
        boolean flag=true;
        while(right!=left){
            if(arr[right]!=arr[left]){
                flag=false;
                break;
            }else{
                right++;
                left--;
            }
        }
        System.out.println("Perfect or NOT : "+flag);
    }
    
    public void smallerAndLarger(){
        System.out.println("Enter the size of the array : ");
        int size  = scan.nextInt();
        System.out.println("Enter the aray Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the key value : ");
        int key = scan.nextInt();
        int small=0,large=0;
        for(int n : arr){
            if(n<=key){
                small++;
            }
            if(n>=key){
                large++;
            }
        }
        int rtnarr[] = new int[]{small,large}; 
        System.out.println("This is small and largest elements in the array : "+Arrays.toString(rtnarr));
    }
    
    public void atLeastTwoGreaterElements(){
        System.out.println("Enter the size of the array : ");
        int size =  scan.nextInt();
        System.out.println("Enter the array Elements :");
        long arr[] = new long[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextLong();
        }
        Arrays.sort(arr);
        long rtnarr[] = new long[arr.length-2];
        rtnarr = arr;
        System.out.println("final array : "+Arrays.toString(rtnarr));
    }

}

