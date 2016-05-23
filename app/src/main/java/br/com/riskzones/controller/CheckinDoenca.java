package br.com.riskzones.controller;


import java.util.Date;

/**
 * Created by Jhones on 22/05/2016.
 */
public class CheckinDoenca {

    private int codCheckin;
    private Usuario usuario;
    private Sintoma sintoma;
    private Double longitude;
    private Double latitude;
    private Date dataCheckin;

    public CheckinDoenca (){};

    public int getCodCheckin() {
        return codCheckin;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
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
