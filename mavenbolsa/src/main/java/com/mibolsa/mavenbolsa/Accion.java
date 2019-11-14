
package com.mibolsa.mavenbolsa;

import java.io.IOException;


public class Accion {
    
    private static String nombreEmpresa;
    private static String simbolo;
    private static int numeroDeAcciones;
    private static String ultimoPrecio;
    private static String variacion;
   
       public Accion() {
        
           Conexion Conexion1 = new Conexion () ;
        }

    public void setEmpresa (String Empresa) throws IOException {
       
        
        nombreEmpresa = Empresa;
    }
   
    public void setUltimoPrecio(String nroEmpresa) throws IOException{
        
        ultimoPrecio = nroEmpresa ;
        System.out.println(ultimoPrecio);
    }

    public static void setSimbolo(int nroEmpresa) throws IOException {
     
       // simbolo = Conexion.EstablecerConexion(nroEmpresa);
    }

    public static void setNumeroDeAcciones(int numeroDeAcciones) {
        Accion.numeroDeAcciones = numeroDeAcciones;
    }

    public static void setVariacion(String variacion) {
        Accion.variacion = variacion;
       
    }
    
     
    public String getEmpresa() {
       
        return nombreEmpresa;
    }

    public String getSimbolo() {
        
        return simbolo;
    }

    public int getNumeroDeAcciones() {
        
        return numeroDeAcciones;
    }

    public String getUltimoPrecio() {
      
        return ultimoPrecio;
    }

    public static String getVariacion() {
        return variacion;
    }
    
    
 }
