package com.equipo.auth;
import java.util.logging.Logger;

import java.util.Scanner;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        Scanner sc = new Scanner(System.in);

        logger.info("Usuario: ");
        String usuario = sc.nextLine();
        logger.info("Contraseña: ");
        String clave = sc.nextLine();

        if (authService.autenticar(usuario, clave)) {
            logger.info("¡Acceso concedido!");
        } else {
            logger.info("Credenciales incorrectas.");
        }

        sc.close();
    }
}
