package org.iesalandalus.programacion.tutorias;

import org.iesalandalus.programacion.tutorias.mvc.controlador.Controlador;
import org.iesalandalus.programacion.tutorias.mvc.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.tutorias.mvc.modelo.IModelo;
import org.iesalandalus.programacion.tutorias.mvc.modelo.Modelo;
import org.iesalandalus.programacion.tutorias.mvc.vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Gestión de tutorías del IES Al-Ándalus");
		
		IModelo modelo = new Modelo(FactoriaFuenteDatos.MEMORIA.crear());
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
	}

}
