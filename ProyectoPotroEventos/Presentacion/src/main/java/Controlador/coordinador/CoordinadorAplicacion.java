package Controlador.coordinador;

import Controlador.interfaz.ICoordinadorAplicacion;
import Pantallas.FrmInicioSesion;
import Pantallas.FrmPago;
import Pantallas.FrmPlantillaSistema;
import Pantallas.FrmRegistrarse;
import Pantallas.FrmRegistroItson;
import Pantallas.frmDetallesCompra;
import Pantallas.vistas.PnlCategorias;
import Pantallas.vistas.PnlConsultar;
import Pantallas.vistas.PnlInfoEvento;

/**
 *
 * @author Aaron Burciaga - 262788
 * @author Brian Sandoval - 262741
 * @author Dayanara Peralta - 262695
 * @author María Valdez - 262775
 */
public class CoordinadorAplicacion implements ICoordinadorAplicacion {

    private FrmInicioSesion frmInicioSesion;
    private FrmRegistrarse frmRegistrarse;
    private FrmPago frmPago;
    private FrmPlantillaSistema frmPlantilla;
    private frmDetallesCompra frmDetalles;
    private FrmRegistroItson registro;

    private void ocultarTodo() {
        if (frmInicioSesion != null) {
            frmInicioSesion.setVisible(false);
        }
        if (frmRegistrarse != null) {
            frmRegistrarse.setVisible(false);
        }

    }

    @Override
    public void iniciaSistema() {
        if (frmInicioSesion == null) {
            frmInicioSesion = new FrmInicioSesion(this);
        }
        frmInicioSesion.setVisible(true);
        frmInicioSesion.setLocationRelativeTo(null);
    }

    @Override
    public void mostrarInicioSesion() {
        ocultarTodo();
        if (frmInicioSesion == null) {
            frmInicioSesion = new FrmInicioSesion(this);
        }
        frmInicioSesion.setVisible(true);
        frmInicioSesion.setLocationRelativeTo(null);
    }

    @Override
    public void mostrarRegistro() {
        ocultarTodo();
        if (frmRegistrarse == null) {
            frmRegistrarse = new FrmRegistrarse(this);
        }
        frmRegistrarse.setVisible(true);
        frmRegistrarse.setLocationRelativeTo(null);
    }

    @Override
    public void mostrarInicio() {
        ocultarTodo();
        if(frmPlantilla == null){
            frmPlantilla = new FrmPlantillaSistema(this);
        }
        frmPlantilla.getContentPane().removeAll();
        frmPlantilla.add(new PnlCategorias(this));
        frmPlantilla.getContentPane().revalidate();
        frmPlantilla.getContentPane().repaint();
        frmPlantilla.setLocationRelativeTo(null);
        frmPlantilla.setVisible(true);
    }

    @Override
    public void mostrarConsultar(UsuarioDTO usuario) {
        ocultarTodo();
        if(frmPlantilla == null){
            frmPlantilla = new FrmPlantillaSistema(this);
        }
        frmPlantilla.getContentPane().removeAll();
        frmPlantilla.add(new PnlConsultar(this, usuario));
        frmPlantilla.getContentPane().revalidate();
        frmPlantilla.getContentPane().repaint();
        frmPlantilla.setLocationRelativeTo(null);
        frmPlantilla.setVisible(true);
    }

    @Override
    public void mostrarInfoEvento(EventoDTO evento) {
        ocultarTodo();
        if(frmPlantilla == null){
            frmPlantilla = new FrmPlantillaSistema(this);
        }
        frmPlantilla.getContentPane().removeAll();
        frmPlantilla.add(new PnlInfoEvento(this, evento));
        frmPlantilla.getContentPane().revalidate();
        frmPlantilla.getContentPane().repaint();
        frmPlantilla.setLocationRelativeTo(null);
        frmPlantilla.setVisible(true);
    }

    @Override
    public void finalizarCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarEventos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void volverAEventos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarConsultarEvento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void volverAConsultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
