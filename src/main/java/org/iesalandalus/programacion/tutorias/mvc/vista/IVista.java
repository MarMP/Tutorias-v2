package org.iesalandalus.programacion.tutorias.mvc.vista;

import org.iesalandalus.programacion.tutorias.mvc.controlador.Controlador;

public interface IVista {

	void setControlador(Controlador controlador);

	void comenzar();

	void terminar();

}