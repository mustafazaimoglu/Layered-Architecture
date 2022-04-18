package dev.mkz.business.concretes;

import dev.mkz.business.abstracts.ProductService;
import dev.mkz.core.LoggerService;
import dev.mkz.dataAccess.abstracts.ProductDao;
import dev.mkz.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 5) {
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("MKZ");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
