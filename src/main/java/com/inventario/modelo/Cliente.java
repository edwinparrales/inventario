package com.inventario.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false,unique = true)
    private String documento;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private String barrio;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String nombreRepresentante;
    @Column(nullable = false)
    private String tipoCliente;
    private String urlImagen;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", barrio='" + barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", nombreRepresentante='" + nombreRepresentante + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ",urlImagen="+urlImagen+
                '}';
    }
}
