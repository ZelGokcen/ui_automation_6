package testng_knowledge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _01_TestNG_Annotations {

    // if you want your own order to print out, use @Test(prioroty = #)
    //Yoksa ASCII table alphabetic order halinde printout oluyor.

    @BeforeMethod
    public void setup(){
        System.out.println("All the pre conditions");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("All the post conditions");
    }
    @Test
    public void test1() {
        System.out.println("This is test1");
    }

    @Test
    public void test2() {
        System.out.println("This is test2");
    }

    @Test
    public void test3() {
        System.out.println("This is test3");
    }


    /*
    @Test(priority = 1)
    public void test1() {
        System.out.println("Hello World");
    }

   @Test(priority = 2)
    public void test2() {
        System.out.println("Hello World");
    }

    @Test(priority = 3)
    public void abc() {
        System.out.println("abc");
    }

    @Test(priority = 4)
    public void Abc() {
        System.out.println("Abc");
    }

    */

}