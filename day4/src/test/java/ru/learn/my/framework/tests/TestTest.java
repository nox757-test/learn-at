package ru.learn.my.framework.tests;

import org.junit.Test;

import static ru.learn.my.framework.Logger.*;

/**
 * Created by user on 05.04.2018.
 */
public class TestTest {
    @Test
    public void testLogger() {
        logTest("log test");
        logCore("log core");
        logPage("log page");
        logElement("log elemnet");
    }
 }
