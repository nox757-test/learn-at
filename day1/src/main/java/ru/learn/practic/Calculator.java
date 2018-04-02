package ru.learn.practic;

import ru.learn.practic.result.ResultInt;

/**
 * Created by user on 02.04.2018.
 */
public class Calculator {

    public ResultInt add(int var1, int var2) {
        if( (long)var1 + (long)var2 > (long)Integer.MAX_VALUE ||
                (long)var1 + (long)var2 < (long)Integer.MIN_VALUE ) {
            return new ResultInt(false, 0);
        }
        return new ResultInt(true,var1 + var2);
    }

    public ResultInt sub(int var1, int var2) {
        if( (long)var1 - (long)var2 < (long)Integer.MIN_VALUE ||
                (long)var1 + (long)var2 > (long)Integer.MAX_VALUE ) {
            return new ResultInt(false, 0);
        }
        return new ResultInt(true,var1 - var2);
    }

    public ResultInt mult(int var1, int var2) {
        if( (long)var1 * (long)var2 > (long)Integer.MAX_VALUE) {
            return new ResultInt(false, 0);
        }
        return new ResultInt(true,var1 * var2);
    }
    public ResultInt div(int var1, int var2) {
        if( var2 == 0) {
            return new ResultInt(false, 0);
        }
        return new ResultInt(true,var1 / var2);
    }
}
