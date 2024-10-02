import java.io.FileReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("poem.txt");
        Scanner s=new Scanner(fr);
        int x=s.nextInt();
        int arr[]=new int[128];
        String line;
        for(int i=0; i<x; i++){
            line=s.nextLine().toLowerCase();
            for(int j=0; j<line.length(); j++){
                char c=line.charAt(j);
                if(c>='a' && c<='z'){
                    arr[c]++;
                }
            }
        }
        char c='a';
        for(int i=0; i<arr.length; i++){
            System.out.println(c + ": " + arr[c]);
            c++;
        }

    }
}