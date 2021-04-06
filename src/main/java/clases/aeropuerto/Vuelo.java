/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.aeropuerto;

/**
 *
 * @author andre
 */
public class Vuelo {
    private boolean asientos[];
    private String aerolinea;
    private String origen;
    private String destino;
    private int diaOrigen;
    private int mesOrigen;
    private int anioOrigen;
    private int horaSalida;
    private int minutoSalida;
    private int precioTurista;
    private int precioBusiness;
    
    public Vuelo(){}
    /**
     * 
     * @param aerolinea Compania con la cual se desea viajar
     * @param origen Lugar de origen del vuelo
     * @param destino Lugar de llegada del vuelo
     * @param diaOrigen Dia del Vuelo
     * @param mesOrigen Mes del Vuelo
     * @param anioOrigen Anio del Vuelo
     * @param hsalida Hora de la salida del vuelo
     * @param msalida Minutos de la salida del vuelo
     * @param precioTurista Precio en Turista
     * @param precioBusiness Precio en Businees
     */
    public Vuelo(String aerolinea, String origen, 
            String destino, int diaOrigen, int mesOrigen, int anioOrigen,
            int horaSalida, int minutoSalida, int precioTurista, int precioBusiness) {
        this.asientos = asientos;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.diaOrigen = diaOrigen;
        this.mesOrigen = mesOrigen;
        this.anioOrigen = anioOrigen;
        this.horaSalida = horaSalida;
        this.minutoSalida = minutoSalida;
        this.precioTurista = precioTurista;
        this.precioBusiness = precioBusiness;
    }
    /**
     * Metodo con el cual vamos a poner todos los asientos LIBRES
     */
    public void inicializarAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            asientos[i]=false;
            
        }
    }
    /**
     * Metodo por el cual vamos a ocupar los asientos
     */
    public void cogerAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]==false) {
                asientos[i]=true;
            }
            
        }
    }
    /**
     * Metodo cual va a ver cuantos asientos libres quedan
     * @return Asientos que quedan libres
     */
    public int asientosVacios(){
        int asientosLibres=0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]==false) {
                asientosLibres++;
            }
            
        }
        return asientosLibres;
    }

    /**
     * @return the asientos
     */
    public boolean[] getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(boolean[] asientos) {
        this.asientos = asientos;
    }

    /**
     * @return the aerolinea
     */
    public String getAerolinea() {
        return aerolinea;
    }

    /**
     * @param aerolinea the aerolinea to set
     */
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the diaOrigen
     */
    public int getDiaOrigen() {
        return diaOrigen;
    }

    /**
     * @param diaOrigen the diaOrigen to set
     */
    public void setDiaOrigen(int diaOrigen) {
        this.diaOrigen = diaOrigen;
    }

    /**
     * @return the mesOrigen
     */
    public int getMesOrigen() {
        return mesOrigen;
    }

    /**
     * @param mesOrigen the mesOrigen to set
     */
    public void setMesOrigen(int mesOrigen) {
        this.mesOrigen = mesOrigen;
    }

    /**
     * @return the anioOrigen
     */
    public int getAnioOrigen() {
        return anioOrigen;
    }

    /**
     * @param anioOrigen the anioOrigen to set
     */
    public void setAnioOrigen(int anioOrigen) {
        this.anioOrigen = anioOrigen;
    }

    /**
     * @return the horaSalida
     */
    public int getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the minutoSalida
     */
    public int getMinutoSalida() {
        return minutoSalida;
    }

    /**
     * @param minutoSalida the minutoSalida to set
     */
    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    /**
     * @return the precioTurista
     */
    public int getPrecioTurista() {
        return precioTurista;
    }

    /**
     * @param precioTurista the precioTurista to set
     */
    public void setPrecioTurista(int precioTurista) {
        this.precioTurista = precioTurista;
    }

    /**
     * @return the precioBusiness
     */
    public int getPrecioBusiness() {
        return precioBusiness;
    }

    /**
     * @param precioBusiness the precioBusiness to set
     */
    public void setPrecioBusiness(int precioBusiness) {
        this.precioBusiness = precioBusiness;
    }
    
    
    
    
}
