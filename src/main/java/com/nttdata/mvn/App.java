package com.nttdata.mvn;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String usuarioCorrecto = "jloperub";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el usuario: ");
        String usuarioEntrada = scanner.nextLine();
        scanner.close();

        if (!StringUtils.equalsIgnoreCase(usuarioCorrecto, usuarioEntrada)) {
        	System.out.print("[ERROR] Usuario incorrecto.");
        	return;
        }

        Proyecto proyecto = new Proyecto(
        		"jloperub",
        		"Proyecto del taller práctico de Apache Maven",
        		"NTTDataMavenJFLR",
        		"0.1-SNAPSHOT");

        Gson gson = new Gson();
        String jsonProyecto = gson.toJson(proyecto);

        System.out.println("Taller práctico Apache Maven");
        System.out.println(jsonProyecto);
        
    }
}
