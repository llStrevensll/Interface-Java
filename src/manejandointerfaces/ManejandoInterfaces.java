/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejandointerfaces;

import datos.*;
/**
 *
 * @author Angel Rodriguez
 */
public class ManejandoInterfaces {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos,"listar");
        
        datos = new ImplementacionMysql();
        ejecutar(datos, "insertar");
    }
    
    public static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)) {
            datos.listar();
        }else if("insertar".equals(accion)){
            datos.insertar();
        }
    }
    
}
