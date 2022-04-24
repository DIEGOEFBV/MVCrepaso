/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author diego
 */
public class  Controlador implements ActionListener {
    
    private Vista  view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){ //Metodo que inicia la vista
        view.setTitle("MVC Multiplicar"); //titulo para la vista
        view.setLocationRelativeTo(null); //null es para que la ventana inicie en el centro de la pantalla ( posición cero)
    }
    
    public void actionPerformed(ActionEvent e){ //recibe un evento
        
        model.setNumeroUno(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumero2.getText()));
        model.Multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
        
    }
    
}
