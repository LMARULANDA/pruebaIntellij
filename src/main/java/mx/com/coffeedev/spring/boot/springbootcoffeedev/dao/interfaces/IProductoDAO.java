package mx.com.coffeedev.spring.boot.springbootcoffeedev.dao.interfaces;

import mx.com.coffeedev.spring.boot.springbootcoffeedev.dto.Producto;

public interface IProductoDAO {

    Producto findById(Integer id);
}
