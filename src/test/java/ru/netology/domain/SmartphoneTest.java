package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Smartphone smartphone = new Smartphone(6,"redmi",100,"miui");
        smartphone.setManufacturer("miui");
        assertEquals(6, smartphone.getId());
        assertEquals("redmi", smartphone.getName());
        assertEquals(100, smartphone.getPrice());
        assertEquals("miui", smartphone.getManufacturer());
    }
    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Smartphone();
        if (product instanceof Smartphone   ) {
            Smartphone smartphone = (Smartphone) product;
            smartphone.setManufacturer("Sumsung");
            smartphone.setPrice(15000);
            smartphone.setId(40);
            smartphone.setName("A100");

            assertEquals(40, smartphone.getId());
            assertEquals("A100", smartphone.getName());
            assertEquals(15000, smartphone.getPrice());
            assertEquals("Sumsung", smartphone.getManufacturer());
        }
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
    void getManufacturer() {
        return;
    }
}