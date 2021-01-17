package ru.netology.repository;

import ru.netology.domain.Book;
import ru.netology.domain.Product;

import java.util.Arrays;

public class ProductRepository {
    private Product[] items = new Product[0];

    @Override
    public String toString() {
        return "ProductRepository{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRepository)) return false;
        ProductRepository that = (ProductRepository) o;
        return Arrays.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(items);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void save (Product item){
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }
    public Product[] findAll() {
        return items;
    }
    public void removeById(int id){
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;

    }
    public Product findByID(int id){
        for (Product item:items){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }

}
