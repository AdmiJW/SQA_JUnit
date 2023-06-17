package org.example;

import org.junit.*;
import static org.junit.Assert.*;

public class AccountTest {

    Account account;

    @Before
    public void setUp() {
        account = new Account(1111, 1234, 1000.0);
    }

    //================================
    // Test validatePin()
    //================================
    @Test
    public void testValidatePinValid() {
        assertTrue(account.validatePin(1234));
    }

    @Test
    public void testValidatePinInvalid() {
        assertFalse(account.validatePin(1235));
    }

    @Test
    public void testValidatePinInvalid2() {
        assertFalse(account.validatePin(1233));
    }

    //================================
    // Test getTotalBalance()
    //================================
    @Test
    public void testGetTotalBalance() {
        assertEquals(1000.0, account.getTotalBalance(), 0.0);
    }

    //================================
    // Test credit()
    //================================
    @Test
    public void testCredit() {
        account.credit(100.0);
        assertEquals(1100.0, account.getTotalBalance(), 0.0);
    }

    //================================
    // Test debit()
    //================================
    @Test
    public void testDebit() {
        account.debit(100.0);
        assertEquals(900.0, account.getTotalBalance(), 0.0);
    }

    //================================
    // Test getAccountNumber()
    //================================
    @Test
    public void testGetAccountNumber() {
        assertEquals(1111, account.getAccountNumber());
    }
}