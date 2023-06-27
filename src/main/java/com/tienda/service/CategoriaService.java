package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
 
    //Se obtiene un Categoria, a partir del id de una categoria
    public Categoria getCategoria(Categoria categoria);
    
    //Se actualiza una categoria si el id de la categoria NO esta vacio
    public void save(Categoria categoria);
    
    //Se elimina el categoria que tiene el id pasado por el parametro
    public void delete(Categoria categoria);
    
}
