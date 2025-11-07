/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.de.estudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class credito {

    private double montoSolicitado;
    private double interesMensual;
    private int plazoEnMeses;
    private double montoTotal;

    public credito(double montoSolicitado, double interesMensual, int plazoEnMeses, double montoTotal) {
        this.montoSolicitado = montoSolicitado;
        this.interesMensual = interesMensual;
        this.plazoEnMeses = plazoEnMeses;
        this.montoTotal = montoTotal;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void tomarDatos() {
        montoSolicitado = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto solicitado"));
        interesMensual = Double.parseDouble(JOptionPane.showInputDialog("ingrese el interes mensual (%): "));
        plazoEnMeses = Integer.parseInt(JOptionPane.showInputDialog("ingrese el plazo en meses: "));
        montoTotal();
    }
        
        

    public void montoTotal() {
        montoTotal = montoSolicitado + (montoSolicitado * (interesMensual / 100) * plazoEnMeses);
    }

    public void mostrarDatos() {
        String mensaje = "monto solicitado: " + montoSolicitado
                + "\nInteres mensual: " + interesMensual + "%"
                + "\nPlazo en meses: " + plazoEnMeses
                + "\nMonto total a pagara: " + montoTotal;
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
