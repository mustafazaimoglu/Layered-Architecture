package dev.mkz.dataAccess.concretes;

import dev.mkz.dataAccess.abstracts.ProductDao;
import dev.mkz.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate Urun added : " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernate updated : " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernate Urun deleted : " + product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
