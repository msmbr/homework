package org.example;

import org.example.Products.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    public List<Product> getProductsByPriceFromNExclusive(List<Product> products, Product.Type type, Double price) {
        return products.stream().filter(product -> product.getType() == type && product.getPrice() > price).toList();
    }

    public List<Product> getDiscountListWithNewPriceByType(List<Product> products, Product.Type type, Double discountPercent) {
        return products.stream().filter(product -> product.getType() == type && product.getDiscount()).peek(product -> product.setPrice(product.getPrice() * (1 - discountPercent / 100))).toList();
    }

    public List<Product> getCheapestProductsInCategory(List<Product> products, Product.Type type) throws ProductIsNotFound {
        double min = products.stream().filter(product -> product.getType() == type).min(Comparator.comparing(Product::getPrice)).orElseThrow(() -> new ProductIsNotFound("Продукт категорії \"" + type + "\" не знайдено")).getPrice();
        return products.stream().filter(product -> product.getType() == type && product.getPrice() == min).toList();
    }

    public List<Product> getLastNAddedProducts(List<Product> products, int n) {
        if(n > products.size()) n = products.size();
        return products.stream().sorted(Comparator.comparing(Product::getCreateDate)).skip(products.size() - n).toList();
    }

    public Double getSumByYearAndTypeAndPriceUpToNInclusive(List<Product> products, Integer year, Product.Type type, Double price) {
        return products.stream().filter(e -> e.getCreateDate().getYear() == year && e.getType() == type && e.getPrice() <= price).mapToDouble(Product::getPrice).sum();
    }

    public Map<Product.Type, List<Product>> getProductTypeGroups(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }
}
