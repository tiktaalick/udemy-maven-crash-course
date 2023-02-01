package org.mark.product.dao;

import org.mark.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {

    Map<Integer, Product> products = new HashMap<>();

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product read(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        products.put(product.getId(), product);
    }
}
