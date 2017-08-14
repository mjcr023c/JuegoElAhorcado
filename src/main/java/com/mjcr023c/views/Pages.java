package com.mjcr023c.views;

import com.mjcr023c.utils.Constants;
import com.mjcr023c.utils.Messages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martin Corrales
 */
public class Pages {

    private String view;

    public Pages() {
    }

    public String getView(int numPag) {
        view = "\n\n****************************************************************\n";
        switch (numPag) {
            case 1:
                view += "          Bienvenido al Juego del Ahorcado               \n";
                view += "                  Menú Principal                         \n";
                view += "                  " + Constants.ONE + " Jugar                    \n";
                view += "                  " + Constants.ZERO + " Salir                    \n\n";
                view += "                  " + Messages.MSG_INFO_INSERT_OPTION;
                break;
            case 2:
                view += "          Juego del Ahorcado                \n";
                view += "    Comandos: Volver al menú principal escribir \"" + Constants.RETURN + "\"                  \n";
                view += "    Instrucciones: Ingrese una letra a la vez para validar su ocurrencia \n\n\n";
                break;

            default:
                view += "\n\n\n\n\n\n\n";
                break;
        }
        return view;
    }

}
