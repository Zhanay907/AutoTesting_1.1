package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain900() {
        CashbackHackService cashback = new CashbackHackService();
        int amount=900;
        int actualResult= cashback.remain( amount);
        int expectedResult = 100;

        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashback = new CashbackHackService();

        int actualResult= cashback.remain( 1000);
        int expectedResult = 1000;

        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testRemain2000() {
        CashbackHackService cashback = new CashbackHackService();

        int actualResult= cashback.remain( 2100);
        int expectedResult = 900;

        assertEquals(actualResult,expectedResult);
    }
}