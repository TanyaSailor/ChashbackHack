package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldShowHowMuchToCashback() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldShowZeroToCashbackAtThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void howMuchToCashbackAtAmountUnderThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void howMuchToCashbackAtAmountAboveThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shouldShowZeroCashbackAtTwoThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void howMuchToCashbackAtMinAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

}