package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book book1 = new Book(1,"book1",200,"author1");
    private Book book2 = new Book(2,"book2",300,"author2");
    private Book book3 = new Book(3,"book3",500,"author3");
    private Smartphone smartphone1 = new Smartphone(4,"smartphone1",1500,"Samsung");
    private Smartphone smartphone2 = new Smartphone(5,"smartphone2",15000,"Nokia");
    private Smartphone smartphone3 = new Smartphone(6,"smartphone3",5500,"Fly");

    @Override
    public String toString() {
        return "ProductRepositoryTest{" +
                "repository=" + repository +
                ", book1=" + book1 +
                ", book2=" + book2 +
                ", book3=" + book3 +
                ", smartphone1=" + smartphone1 +
                ", smartphone2=" + smartphone2 +
                ", smartphone3=" + smartphone3 +
                '}';
    }

    @Test
    public void shouldSaveOneItem() {
        repository.save(book1);

        Product[] expected = new Product[]{book1};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByID(){
        repository.save(book1);
        repository.removeById(1);
        Product[] expected = new Product[]{book1};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void save() {
        return;
    }

    @Test
    void findAll() {
        return;
    }



    @Test
    void findByID() {
        return;
    }
    @Test
    public void shouldfindById() {
        repository.save(book1);
        repository.findByID(1);
        Product[] expected = new Product[]{book1};
        Product[] actual = repository.findByID();
        assertArrayEquals(expected, actual);
    }
}