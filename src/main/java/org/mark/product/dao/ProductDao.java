package org.mark.product.dao;

import org.mark.product.dto.Product;

public interface ProductDao {

    void create(Product product);

    void delete(int id);

    Product read(int id);

    void update(Product product);
}
