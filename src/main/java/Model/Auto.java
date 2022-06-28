/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Roberto Fajo 06/2022
 */
public class Auto {
    private String id;
    private String anio;
    private String km;
    private String marca;
    private String modelo;
    private String version;
    private String foto;
    
    public Auto(String id){
        this.id = id;
        setFoto(id);
    }

    public Auto(String id, String anio, String km, String marca, String modelo, String version) {
        this.id = id;
        this.anio = anio;
        this.km = km;
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        setFoto(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = this.id + ".jpg";
    }

    public String descripcionAuto(){
        String descripcion = marca +" - "+ modelo +" - "+ version;
        return descripcion;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", anio=" + anio + ", km=" + km + ", marca=" + marca + ", modelo=" + modelo + ", version=" + version + ", foto=" + foto + '}';
    }
    
    

    
    
    
}