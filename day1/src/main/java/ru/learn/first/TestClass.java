package ru.learn.first;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by user on 02.04.2018.
 */
public class TestClass {

    @Test
    public void function(){
        System.out.println("Hello word!!!");
    }

    @Test
    public void function2(){
        String str = "Hello world";
        String str2 = str.substring(2 );
        System.out.println(str2);
    }

    @Test
    public void function3(){
       int[] a = { 5, 7, 8, 0, 1, 5, 9, 3};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length; j++) {
                if ( a[i] > a[j] ) {
                    a[i] += a[j];
                    a[j] = a[i] - a[j];
                    a[i] -= a[j];
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
