package testng_knowledge;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _03_Ignoring_Test {
    // ignoring a test case, same as skipping it.
    // If I have more than one test case, and I want to run all but ignore one,
    // use ignore it method, @Ignore

    // @Test << do this to ignore.
    // Put this @Ignore annotation on top of @Test...  @Test(enabled = false)

    // TÜM ÖRNEKLER ASSAGIDA.


    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("Test2");
    }


    @Test(enabled = false)
    public void test3(){
        System.out.println("Test3");
    }
 }
