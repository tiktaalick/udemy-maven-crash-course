package org.mark.product.dao;

import lombok.Data;
import org.junit.jupiter.api.Test;
import org.mark.product.dto.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductDaoImplTest {

    private static final String IPHONE = "iPhone";

    @Test
    public void createShouldCreateAProduct() {
        ProductDao dao = new ProductDaoImpl();
        Product product = new Product();
        product.setId(1);
        product.setName(IPHONE);
        product.setDescription("It's overrated.");
        product.setPrice(800);

        dao.create(product);

        Product actual = dao.read(1);

        assertNotNull(actual);
        assertEquals(IPHONE, actual.getName());
    }
}