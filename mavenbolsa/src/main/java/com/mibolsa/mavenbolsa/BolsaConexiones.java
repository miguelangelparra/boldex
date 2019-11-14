package com.mibolsa.mavenbolsa;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author MIGUELANGEL DE JESUS
 */
public class BolsaConexiones {
  
  //  public static void main(String[] args) throws IOException  {
public static String[] ConexionesTodas() throws IOException{
/*Enlaces directos a acciones una por una*/
String [] conexionesDeAcciones = new String [27];
/*Sector Industrial*/
/*Agricultura y Alimentos Procesados*/ 
conexionesDeAcciones[0]= "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=EFE";
conexionesDeAcciones[1]= "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=PGR";
conexionesDeAcciones[2]= "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=PTN";
conexionesDeAcciones[3]= "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=RST";
/*Industria Manufacturera y Construccion*/
conexionesDeAcciones[4] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=CCR"; 
conexionesDeAcciones[5] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=CGQ";         
conexionesDeAcciones[6] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=CRM.A"; 
conexionesDeAcciones[7] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=DOM"; 
conexionesDeAcciones[8] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=ENV"; 
conexionesDeAcciones[9] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=FNC"; 
conexionesDeAcciones[10] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=MPA"; 
conexionesDeAcciones[11] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=SVS"; 
conexionesDeAcciones[12] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=TPG";
/*Sector Servicio*/
/*Electricidad, Gas, Agua y Servicios*/
conexionesDeAcciones[13] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=CIE"; 
conexionesDeAcciones[14] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=TDV.D"; 
/*Sector Financiero */
/*Banca Comercial */
conexionesDeAcciones[15] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=BOU"; 
conexionesDeAcciones[16] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=MVZ.A"; 
conexionesDeAcciones[17] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=MVZ.B";
/*Banca Universal */
conexionesDeAcciones[18] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=ABC.A"; 
conexionesDeAcciones[19] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=BNC"; 
conexionesDeAcciones[20] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=BPV"; 
conexionesDeAcciones[21] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=BVL"; 
/*Otros Establecimientos Financieros*/
conexionesDeAcciones[22] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=BVCC"; 
conexionesDeAcciones[23] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=GZL"; 
/*Companias de Bienes Inmuebles*/
conexionesDeAcciones[24] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=FVI.A"; 
conexionesDeAcciones[25] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=FVI.B"; 
conexionesDeAcciones[26] = "http://www.bolsadecaracas.com/esp/productos/dinamica/operaciones-light.jsp?symbol=IVC";

/*-----------------------------------------------------------------------------*/

String [] infoBajadaDeAccion= new String [27];
String [] Resultado = new String [27];

for (int h=0;h <=infoBajadaDeAccion.length -1 ;h++){
    Document doc = Jsoup.connect(conexionesDeAcciones[h]).get();
    Elements nombreBajado = doc.select("html body table tbody tr td:eq(1)");
    Elements precioBajado = doc.select("td.home:contains(Precio) td:eq(0).numeros-negro-ind" );
    
    
    Resultado [h] = precioBajado.text();
    
}
    /*
    Forma original
    Elements precioBajado = doc.select("td.home:contains(Precio) td:eq(0)" );
   / for (Element headline : precioBajado) {
        infoBajadaDeAccion[h] = headline.getElementsByClass("numeros-negro-ind").text() ;
        System.out.println (headline.getElementsByClass("numeros-negro-ind").text());
        }
    }
   
    System.out.println("---------------------------");

for (int a=0;  a<=infoBajadaDeAccion.length -1;a++){
    System.out.println (infoBajadaDeAccion[a]);
        }*/

    return Resultado;
    }
}

