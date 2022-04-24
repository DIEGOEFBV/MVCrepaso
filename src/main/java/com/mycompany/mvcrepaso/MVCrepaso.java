/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvcrepaso;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author diego
 */
public class MVCrepaso {

    public static void main(String[] args) {
        
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciar();
        vista.setVisible(true);
    }
}
