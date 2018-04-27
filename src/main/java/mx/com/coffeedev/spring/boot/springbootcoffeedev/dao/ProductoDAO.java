package mx.com.coffeedev.spring.boot.springbootcoffeedev.dao;

import mx.com.coffeedev.spring.boot.springbootcoffeedev.dao.interfaces.IProductoDAO;
import mx.com.coffeedev.spring.boot.springbootcoffeedev.dto.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoDAO implements IProductoDAO {


    @Override
    public Producto findById(Integer id) {
        return new Producto(id, "MacBook Pro 15 \"",19500d);
    }
}
