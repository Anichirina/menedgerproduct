package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book = new Book(5,"Ono",40);
        book.setAuthor("King");
        assertEquals(5, book.getId());
        assertEquals("Ono", book.getName());
        assertEquals(40, book.getPrice());
        assertEquals("King", book.getAuthor());
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
            book.setAuthor("Pushkin");
            book.setPrice(500);
            book.setId(4);
            book.setName("Onegin");

            assertEquals(4, book.getId());
            assertEquals("Onegin", book.getName());
            assertEquals(500, book.getPrice());
            assertEquals("Pushkin", book.getAuthor());
        }
    }

    @Test
    public void shouldUseEquals() {
        Book book1 = new Book(2,"Cooking",200,"Author");
        Book book2 = new Book(2,"Cooking",200,"Author");
        assertEquals(book1,book2);
    }


    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Book();

        product.toString();
    }



    @Test
    void testEquals() {
        return;
    }

    @Test
    void testHashCode() {
        return;
    }

    @Test
    void testToString() {
        return;
    }

    @Test
    void getAuthor() {
        return;
    }


}