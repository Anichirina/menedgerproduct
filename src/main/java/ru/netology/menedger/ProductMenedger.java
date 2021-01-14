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
            if (matches(product, text))  {
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


        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search1)) {
                return true;
            }
            if (book.getAuthor().equalsIgnoreCase(search2)) {
                return true;
            }

            return false;
        }
        return false;
    }
}


