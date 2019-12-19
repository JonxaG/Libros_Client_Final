/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.datos.manager;

import libros.datos.exceptions.GeneroException;
import java.util.Collection;
import libros.datos.beans.GeneroBean;

/**
 *
 * @author Jon Xabier Gimenez
 */
public interface GenerosManager {

    public Collection getAllGeneros()throws GeneroException;
    public Collection getNombresGenero(Collection <GeneroBean> generos) throws GeneroException;

}
