/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Pantallas.FrmConsultar;
import Pantallas.FrmConsultarEvento;
import Pantallas.FrmEventos;
import Pantallas.FrmInfoEvento;
import Pantallas.FrmInicio;
import Pantallas.FrmInicioSesion;
import Pantallas.FrmRegistrarse;

/**
 *
 * @author Dayanara Peralta G
 */
public class Coordinador {
    private FrmInicioSesion frmInicioSesion;
    private FrmRegistrarse frmRegistrarse;
    private FrmInicio frmInicio;
    private FrmConsultar frmConsultar;
    private FrmEventos frmEventos;
    private FrmInfoEvento frmInfoEvento;
    private FrmConsultarEvento frmConsultarEvento;
    
    private void ocultarTodo(){
        if(frmInicioSesion != null)frmInicioSesion.setVisible(false);
        if(frmRegistrarse != null)frmRegistrarse.setVisible(false);
        if(frmInicio != null) frmInicio.setVisible(false);
        if(frmEventos != null) frmEventos.setVisible(false);
        if(frmInfoEvento != null) frmInfoEvento.setVisible(false);
        
    }
    
    public void iniciaSistema(){
        if(frmInicioSesion == null){
            frmInicioSesion = new FrmInicioSesion(this);
        }
        frmInicioSesion.setVisible(true);
        frmInicioSesion.setLocationRelativeTo(null);
    }
    
    public void mostrarInicioSesion(){
        ocultarTodo();
        if(frmInicioSesion == null) frmInicioSesion = new FrmInicioSesion(this);
        frmInicioSesion.setVisible(true);
        frmInicioSesion.setLocationRelativeTo(null);
    }
    
    public void mostrarRegistro(){
        ocultarTodo();
        if(frmRegistrarse == null) frmRegistrarse = new FrmRegistrarse(this);
        frmRegistrarse.setVisible(true);
        frmRegistrarse.setLocationRelativeTo(null);
    }
    
    public void mostrarInicio(){
        ocultarTodo();
        if(frmInicio == null) frmInicio = new FrmInicio(this);
        frmInicio.setVisible(true);
        frmInicio.setLocationRelativeTo(null);
    }
    
    public void mostrarConsultar(){
        ocultarTodo();
        if(frmConsultar == null) frmConsultar = new FrmConsultar(this);
        frmConsultar.setVisible(true);
        frmConsultar.setLocationRelativeTo(null);
    }
    
    public void mostrarInfoEvento(){
        ocultarTodo();
        if(frmInfoEvento == null) frmInfoEvento = new FrmInfoEvento(this);
        frmInfoEvento.setVisible(true);
        frmInfoEvento.setLocationRelativeTo(null);
    }
    
    public void finalizarCompra(){
        ocultarTodo();
        if(frmEventos == null) frmEventos = new FrmEventos(this);
        frmEventos.setVisible(true);
        frmEventos.setLocationRelativeTo(null);
    }
    
    public void mostrarEventos(){
        ocultarTodo();
        if(frmEventos == null) frmEventos = new FrmEventos(this);
        frmEventos.setVisible(true);
        frmEventos.setLocationRelativeTo(null);
    }
    
    public void volverAEventos(){
        ocultarTodo();
        if(frmEventos == null) frmEventos = new FrmEventos(this);
        frmEventos.setVisible(true);
        frmEventos.setLocationRelativeTo(null);
    }
    
    public void mostrarConsultarEvento(){
        ocultarTodo();
        if(frmConsultarEvento == null)frmConsultarEvento = new FrmConsultarEvento(this);
        frmConsultarEvento.setVisible(true);
        frmConsultarEvento.setLocationRelativeTo(null);
    }
    
    public void volverAConsultar(){
        ocultarTodo();
        if(frmConsultar == null)frmConsultar = new FrmConsultar(this);
        frmConsultar.setVisible(true);
        frmConsultar.setLocationRelativeTo(null);
    }
}
