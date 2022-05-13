package main;
import java.io.*;
import analizadorLexico.*;
import analizador.*;

public class Main {

    public static void main(String[] args) throws IOException {
        AnalizadorLexico lex = new AnalizadorLexico();
        Analizador analizar = new Analizador(lex);
        analizar.programa();
        System.out.write('\n');
        
        System.out.println("Hello World!");
    }
        /*{
        int i; int j; float v; float x; float[100] a;
        while( true ) {
            do i = i+1; while( a[i] < v);
            do j = j−1; while( a[j] > v);
            if( i >= j ) break;
            x = a[i]; a[i] = a[j]; a[j] = x;
            }
        }
    {
int i; int j; float v; float x; float[100] a; while( true ) {
do i = i+1; while( a[i] < v);
  break;
}}
    
    */
    
    
    
    /*{
	int i; int x;
 
    i = 1;   x = 2;
 
    while (i<= 5) {
        cout << x << ' ';
        x = x * 2;
        cout << x << ' ';
        x = x - 1;
        i++;
    }
    
    {int i; int x; i=1; x=2;
 
while (i>= 5){i=i+1;
}}
    
    
    
    */
    
}
