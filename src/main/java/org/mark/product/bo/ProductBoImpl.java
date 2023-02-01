package org.mark.product.bo;

import org.mark.product.dao.ProductDao;
import org.mark.product.dao.ProductDaoImpl;
import org.mark.product.dto.Product;

public class ProductBoImpl implements ProductBo {

    private static ProductDao productDao = new ProductDaoImpl();

    @Override
    public void create(Product product) {
        productDao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return productDao.read(id);
    }
}
