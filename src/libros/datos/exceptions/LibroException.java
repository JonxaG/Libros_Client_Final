/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.datos.exceptions;

/**
 * Excepcion que indica un fallo al hacer una operacion CUD con Libro
 * @author Jon Xabier Gimenez
 */
public class LibroException extends Exception {

    /**
     * Creates a new instance of <code>LibroException</code> without detail
     * message.
     */
    public LibroException() {
    }

    /**
     * Constructs an instance of <code>LibroException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LibroException(String msg) {
        super(msg);
    }
}
