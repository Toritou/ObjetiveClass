package Launcher;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


class MenuMedicoTest {

    @Test
    void mostrarMenu_OpcionSalir() {
        String input = "7\n"; 
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        MenuMedico menuMedico = new MenuMedico(scanner, null);

        menuMedico.mostrarMenu();

    }

    @Test
    void mostrarMenu_OpcionVerPacientes() {
        String input = "1\n7\n"; // Simula la entrada del usuario seleccionando la opción "Ver pacientes" y luego "Salir"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        MenuMedico menuMedico = new MenuMedico(scanner, null);

        menuMedico.mostrarMenu();

    }

    @Test
    void mostrarMenu_OpcionAgregarPaciente() {
        String input = "2\n7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        MenuMedico menuMedico = new MenuMedico(scanner, null);

        menuMedico.mostrarMenu();

    }

}
