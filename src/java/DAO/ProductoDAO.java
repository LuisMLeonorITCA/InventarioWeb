/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Producto;
import java.util.List;

/**
 *
  * @author Luis E. Leonor
 */
public interface ProductoDAO {
    public List<Producto> Listar();
    public  Producto editaProd(int id_prod_edit);
    public boolean guardarProd(Producto producto);
    public boolean borrarProd(int id_prod_borrar);
}
