package modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Smartphone {
    private int id;
    private String marca;
    private String modelo;
    private String os;
    private String procesador;
    private String url;

    public Smartphone() {
    }

    public Smartphone(int id, String marca, String modelo, String os, String procesador, String url) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.os = os;
        this.procesador = procesador;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", os='" + os + '\'' +
                ", procesador='" + procesador + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException{
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}
