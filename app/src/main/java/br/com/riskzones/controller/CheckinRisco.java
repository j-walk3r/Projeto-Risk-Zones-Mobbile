package br.com.riskzones.controller;

import java.util.Date;

/**
 * Created by Jhones on 22/05/2016.
 */
public class CheckinRisco {

    private int codCheckin;
    private Usuario usuario;
    private Risco risco;
    private Double longitude;
    private Double latitude;
    private Date dataCheckin;


    public CheckinRisco (){};

    public int getCodCheckin() {
        return codCheckin;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

}
