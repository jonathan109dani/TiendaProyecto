package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
}
