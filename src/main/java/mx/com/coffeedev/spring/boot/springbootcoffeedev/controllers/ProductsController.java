package mx.com.coffeedev.spring.boot.springbootcoffeedev.controllers;

import mx.com.coffeedev.spring.boot.springbootcoffeedev.dao.interfaces.IProductoDAO;
import mx.com.coffeedev.spring.boot.springbootcoffeedev.dto.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductsController {

    @Autowired
    private IProductoDAO productoDAO;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Producto getProducto(@PathVariable Integer id){
        return productoDAO.findById(id);
    }

}
