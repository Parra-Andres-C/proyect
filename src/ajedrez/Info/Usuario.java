/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.Info;

import java.util.Scanner;

/**
 *
 * @author Parra G
 */
public class Usuario {
    private String m_usuario, m_contrasena, m_nombre, m_apellido, m_Uni, m_nacion, m_genero, m_correo;

    public Usuario(){  
    };
    
    public Usuario(String m_usuario, String m_contrasena, String m_nombre, String m_apellido, String m_Uni, String m_nacion, String m_genero, String m_correo) {
        this.m_usuario = m_usuario;
        this.m_contrasena = m_contrasena;
        this.m_nombre = m_nombre;
        this.m_apellido = m_apellido;
        this.m_Uni = m_Uni;
        this.m_nacion = m_nacion;
        this.m_genero = m_genero;
        this.m_correo = m_correo;
    }

    public String getM_usuario() {
        return m_usuario;
    }

    public String getM_contrasena() {
        return m_contrasena;
    }

    public String getM_nombre() {
        return m_nombre;
    }

    public String getM_apellido() {
        return m_apellido;
    }

    public String getM_Uni() {
        return m_Uni;
    }

    public String getM_nacion() {
        return m_nacion;
    }

    public String getM_genero() {
        return m_genero;
    }

    public String getM_correo() {
        return m_correo;
    }

    public void setM_usuario(String m_usuario) {
        this.m_usuario = m_usuario;
    }

    public void setM_contrasena(String m_contrasena) {
        this.m_contrasena = m_contrasena;
    }

    public void setM_nombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    public void setM_apellido(String m_apellido) {
        this.m_apellido = m_apellido;
    }

    public void setM_Uni(String m_Uni) {
        this.m_Uni = m_Uni;
    }

    public void setM_nacion(String m_nacion) {
        this.m_nacion = m_nacion;
    }

    public void setM_genero(String m_genero) {
        this.m_genero = m_genero;
    }

    public void setM_correo() {
        int flag = 0;
        while ( flag == 0){
            System.out.println("ingrese correo");
            Scanner te = new Scanner(System.in);
            String correo = te.next();
            if ( correo.contains("@")){
                this.m_correo = correo;
                flag++;
            }else{
                System.out.println("correo invalido");
            }
        }
    }
}
