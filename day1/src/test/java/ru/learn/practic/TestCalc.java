package ru.learn.practic;

import org.junit.Assert;
import org.junit.Test;
import ru.learn.practic.result.ResultInt;

/**
 * Created by user on 02.04.2018.
 */
public class TestCalc {

    Calculator calc = new Calculator();

    @Test
    public void testSmokeAdd(){
        ResultInt resultInt =  calc.add( 200, 200);
        Assert.assertEquals(resultInt.isValid, true);
        Assert.assertEquals(resultInt.result, 400);
    }

    @Test
    public void testSmokeSub(){
        ResultInt resultInt =  calc.sub( 200, 200);
        Assert.assertEquals(resultInt.isValid, true);
        Assert.assertEquals(resultInt.result, 0);
    }

    @Test
    public void testSmokeMul(){
        ResultInt resultInt =  calc.mult( 200, 200);
        Assert.assertEquals(resultInt.isValid, true);
        Assert.assertEquals(resultInt.result, 40000);
    }

    @Test
    public void testSmokeDiv(){
        ResultInt resultInt =  calc.div( 200, 200);
        Assert.assertEquals(resultInt.isValid, true);
        Assert.assertEquals(resultInt.result, 1);
    }

    @Test
    public void testAddMinusMinimum(){
        ResultInt resultInt =  calc.add( -2147483647, -2);
        Assert.assertEquals(resultInt.isValid, false);
        Assert.assertEquals(resultInt.result, 0);
    }

    @Test
    public void testAddMax(){
        ResultInt resultInt =  calc.add( 2147483647, 2);
        Assert.assertEquals(resultInt.isValid, false);
        Assert.assertEquals(resultInt.result, 0);
    }



}
