package org.example;

import org.example.Products.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private static ProductService productService;

    @BeforeAll
    static void beforeAll() {
        productService = new ProductService();
    }

    @Test
    void getProductsByPriceFromNExclusive() {
        List<Product> input = new ArrayList<>();
        input.add(new Book(0, 100d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(1, 300d, false, LocalDate.parse("2023-03-01")));
        input.add(new Book(2, 150d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(3, 350d, false, LocalDate.parse("2023-03-01")));
        input.add(new Phone(4, 350d, true, LocalDate.parse("2023-03-01")));

        List<Product> expectation = new ArrayList<>();
        expectation.add(input.get(1));
        expectation.add(input.get(3));

        assertEquals(expectation, productService.getProductsByPriceFromNExclusive(input, Product.Type.BOOK, 250d));
    }

    @Test
    void getDiscountListWithNewPriceByType() {
        List<Product> input = new ArrayList<>();
        input.add(new Book(0, 100d, true, LocalDate.parse("2023-03-01")));
        input.add(new Phone(1, 150d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(2, 150d, true, LocalDate.parse("2023-03-01")));

        List<Double> expectation = new ArrayList<>();
        expectation.add(90d);
        expectation.add(135d);

        List<Product> res = productService.getDiscountListWithNewPriceByType(input, Product.Type.BOOK, 10d);

        assertEquals(expectation, res.stream().map(Product::getPrice).toList());
    }

    @Test
    void getCheapestProductsInCategory() throws ProductIsNotFound {
        List<Product> input = new ArrayList<>();
        input.add(new Book(0, 300d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(1, 100d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(2, 100d, true, LocalDate.parse("2023-03-01")));
        input.add(new Phone(3, 10000d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(4, 150d, true, LocalDate.parse("2023-03-01")));

        List<Product> expectation = new ArrayList<>();
        expectation.add(input.get(1));
        expectation.add(input.get(2));

        assertEquals(expectation, productService.getCheapestProductsInCategory(input, Product.Type.BOOK));
    }

    @Test
    void getCheapestProductsInCategory_Exception() {
        List<Product> input = new ArrayList<>();
        input.add(new Phone(0, 5000d, true, LocalDate.parse("2023-03-01")));

        assertThrows(ProductIsNotFound.class, () -> productService.getCheapestProductsInCategory(input, Product.Type.BOOK));
    }

    @Test
    void getLastNAddedProducts() {
        List<Product> input = new ArrayList<>();
        input.add(new Book(0, 300d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(1, 100d, true, LocalDate.parse("2023-03-05")));
        input.add(new Book(2, 100d, true, LocalDate.parse("2023-03-03")));
        input.add(new Phone(3, 10000d, true, LocalDate.parse("2023-03-07")));
        input.add(new Book(4, 150d, true, LocalDate.parse("2023-03-06")));

        List<Product> expectation = new ArrayList<>();
        expectation.add(input.get(1));
        expectation.add(input.get(4));
        expectation.add(input.get(3));

        assertEquals(expectation, productService.getLastNAddedProducts(input, 3));
    }

    @Test
    void getLastNAddedProducts_NoException() {
        List<Product> input = new ArrayList<>();
        input.add(new Book(0, 300d, true, LocalDate.parse("2023-03-01")));
        input.add(new Book(1, 100d, true, LocalDate.parse("2023-03-05")));

        assertDoesNotThrow(()->productService.getLastNAddedProducts(input, 3));
    }

    @Test
    void getSumByYearAndTypeAndPriceUpToNInclusive() {
        List<Product> products = new ArrayList<>();

        products.add(new Book(0, 40d, true, LocalDate.parse("2022-03-04")));
        products.add(new Book(1, 75d, true, LocalDate.parse("2023-03-01"))); //+
        products.add(new Book(2, 76d, true, LocalDate.parse("2022-03-02")));
        products.add(new Book(3, 90d, true, LocalDate.parse("2023-03-02")));
        products.add(new Book(4, 10d, true, LocalDate.parse("2023-03-01"))); //+
        products.add(new Phone(5, 50d, true, LocalDate.parse("2022-03-03")));
        products.add(new Phone(6, 75d, true, LocalDate.parse("2023-03-03")));
        products.add(new Phone(7, 76d, true, LocalDate.parse("2022-03-03")));
        products.add(new Phone(8, 90d, true, LocalDate.parse("2023-03-03")));

        assertEquals(85d, productService.getSumByYearAndTypeAndPriceUpToNInclusive(products, LocalDate.now().getYear(), Product.Type.BOOK, 75d));
    }

    @Test
    void getProductTypeGroups() {
        List<Product> input = new ArrayList<>();

        input.add(new Book(0, 10d, true, LocalDate.parse("2022-03-04")));
        input.add(new Phone(1, 20d, true, LocalDate.parse("2022-03-03")));
        input.add(new Phone(2, 30d, true, LocalDate.parse("2023-03-03")));
        input.add(new Tablet(3, 40d, true, LocalDate.parse("2022-03-04")));
        input.add(new Tablet(4, 50d, true, LocalDate.parse("2022-03-03")));
        input.add(new Tablet(5, 60d, true, LocalDate.parse("2023-03-03")));

        Map<Product.Type, List<Product>> expectation = new HashMap<>();

        List<Product> bookProductList = new ArrayList<>();
        bookProductList.add(input.get(0));
        expectation.put(Product.Type.BOOK, bookProductList);

        List<Product> phoneProductList = new ArrayList<>();
        phoneProductList.add(input.get(1));
        phoneProductList.add(input.get(2));
        expectation.put(Product.Type.PHONE, phoneProductList);

        List<Product> tabletProductList = new ArrayList<>();
        tabletProductList.add(input.get(3));
        tabletProductList.add(input.get(4));
        tabletProductList.add(input.get(5));
        expectation.put(Product.Type.TABLET, tabletProductList);

        assertEquals(expectation, productService.getProductTypeGroups(input));
    }
}