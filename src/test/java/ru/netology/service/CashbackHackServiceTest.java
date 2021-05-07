package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain800() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(800);
        int expected = 200;

        assertEquals(expected,actual);

    }@Test
    public void remain1000() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(1000);
        int expected = 0;

        assertEquals(expected,actual);

    }@Test
    public void remain2100() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(2100);
        int expected = 900;

        assertEquals(expected,actual);

    }
}