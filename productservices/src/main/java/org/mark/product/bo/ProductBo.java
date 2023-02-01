package org.mark.product.bo;

import org.mark.product.dto.Product;

public interface ProductBo {

    void create(Product product);

    Product findProduct(int id);
}
