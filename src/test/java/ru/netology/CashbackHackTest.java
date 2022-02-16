package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
}