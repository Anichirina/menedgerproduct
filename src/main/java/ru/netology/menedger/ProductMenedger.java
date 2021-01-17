package ru.netology.menedger;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductMenedger {
    private ProductRepository repository;


    public ProductMenedger(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductMenedger() {

    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (product.matches(text)) {
                Product[] tmp = new Product[result.length + 1];
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;

    }

    private boolean matches(Product product, String search) {
        String search1 = "Pushkin";
        String search2 = "Ono";
        return false;
    }
}


