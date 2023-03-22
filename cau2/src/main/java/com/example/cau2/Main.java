package com.example.cau2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // read spring java configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from spring container
        Product firstProduct = context.getBean("firstProduct", Product.class);
        Product alphaFirstProduct = context.getBean("firstProduct", Product.class);

        Product secondProduct = context.getBean("secondProduct", Product.class);
        Product alphaSecondProduct = context.getBean("secondProduct", Product.class);

        Product thirdProduct = context.getBean("thirdProduct", Product.class);
        Product alphaThirdProduct = context.getBean("thirdProduct", Product.class);

        // call methods on the bean
        System.out.println(firstProduct.getId());
        System.out.println(firstProduct.getName());
        System.out.println(firstProduct.getDescription());
        System.out.println();

        System.out.println(secondProduct.getId());
        System.out.println(secondProduct.getName());
        System.out.println(secondProduct.getDescription());
        System.out.println();

        System.out.println(thirdProduct.getId());
        System.out.println(thirdProduct.getName());
        System.out.println(thirdProduct.getDescription());
        System.out.println();

        boolean result1 = firstProduct == alphaFirstProduct;
        boolean result2 = secondProduct == alphaSecondProduct;
        boolean result3 = thirdProduct == alphaThirdProduct;

        System.out.println("First bean: Pointing to the same instance " + result1);
        System.out.println("Second bean: Pointing to the same instance " + result2);
        System.out.println("Third bean: Pointing to the same instance " + result3);

        // close the context
        context.close();
    }
}