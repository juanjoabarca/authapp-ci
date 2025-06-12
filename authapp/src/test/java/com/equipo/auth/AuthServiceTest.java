package com.equipo.auth;

import org.junit.Test;
import static org.junit.Assert.*;

public class AuthServiceTest {
    @Test
    public void testAutenticacionExitosa() {
        AuthService auth = new AuthService();
        assertTrue(auth.autenticar("admin", "1234"));
    }

    @Test
    public void testAutenticacionFallida() {
        AuthService auth = new AuthService();
        assertFalse(auth.autenticar("admin", "xyz"));
    }

    @Test
    public void testCondicionFaltante() {
        AuthService auth = new AuthService();
        assertFalse(auth.autenticar("noexiste", "1234")); // False && True
}
}
