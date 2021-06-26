package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    Product first = new Product(1, "apple", 65);
    Product second = new Product(2, "bread", 36);
    Product third = new Product(3, "milk", 50);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    public void removeById() {
        repository.removeById(2);
        Product[] expected = new Product[]{first, third};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByNonExistentId() {
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(20);
        });
    }
}