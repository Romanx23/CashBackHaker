package ru.netology;

import static org.junit.Assert.assertEquals;

public class cashbackHackServiceTest {
    @org.junit.Test
    public void shouldRemainIfAmountMoreBoundary() {
        cashbackHackService cashbackHackService = new cashbackHackService();
        int amount = 4500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void shouldRemainIfAmountLessBoundary(){
        cashbackHackService cashbackHackService= new cashbackHackService();
        int amount = 950;
        int actual= cashbackHackService.remain(amount);
        int expected=50;
        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void shouldRemainIfAmountEqualsBoundary(){
        cashbackHackService cashbackHackService= new cashbackHackService();
        int amount = 1000;
        int actual= cashbackHackService.remain(amount);
        int expected=0;
        assertEquals(expected, actual);

    }

}
