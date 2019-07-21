/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author angue
 */
public interface AccesoDatos {
    public static int MAX_REGISTROS = 10;//por defecto una constante será public y static-> en este caso se decidio especificarlo
    
    //los metodos en una interface seran public y abstract por defecto, el compilador los adiciona sino se especifican
    public abstract void insertar();
    
    public abstract void listar();
}
