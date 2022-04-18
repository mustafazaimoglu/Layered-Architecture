package dev.mkz;

import dev.mkz.business.abstracts.ProductService;
import dev.mkz.business.concretes.ProductManager;
import dev.mkz.core.JLoggerManagerAdapter;
import dev.mkz.dataAccess.concretes.HibernateProductDao;
import dev.mkz.dataAccess.concretes.MKZProductDao;
import dev.mkz.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

//        ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService2 = new ProductManager(new MKZProductDao(),new JLoggerManagerAdapter());

        Product p1 = new Product(1,5,"Armut",12,50);
        Product p2 = new Product(2,4,"Elma",8,40);

//        productService.add(p2);
        productService2.add(p2);
    }
}
