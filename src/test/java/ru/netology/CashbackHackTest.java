package ru.netology;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CashbackHackTest {

    @Test
    public void shouldCalculatePaymentOne() {
        CashbackHack cashbackHack = new CashbackHack();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHack.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculatePaymentTwo() {
        CashbackHack cashbackHack = new CashbackHack();
        int amount = 100;
        int expected = 900;
        int actual = cashbackHack.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculatePaymentCrash() {
        CashbackHack cashbackHack = new CashbackHack();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHack.remain(amount);
        assertEquals(actual, expected);
    }
}