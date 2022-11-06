package ru.netology;

import static org.testng.Assert.*;

public class cashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldRemainIfAmountMoreBoundary() {
        cashbackHackService cashbackHackService = new cashbackHackService();
        int amount = 4500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldRemainIfAmountLessBoundary() {
        cashbackHackService cashbackHackService = new cashbackHackService();
        int amount = 950;
        int actual = cashbackHackService.remain(amount);
        int expected = 50;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldRemainIfAmountEqualsBoundary() {
        cashbackHackService cashbackHackService = new cashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}