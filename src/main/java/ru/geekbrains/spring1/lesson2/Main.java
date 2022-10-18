package ru.geekbrains.spring1.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean(Cart.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("/end to exit");
        System.out.println("/add to add product");
        System.out.println("/delete to add product");


        while (true){
            String cmd = "";
            cmd = sc.nextLine();

            switch (cmd){
                case ("/end"): {
                    return;
                }
                case ("/add1"): {
                    cart.addProductById(1l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/add2"):{
                    cart.addProductById(2l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/add3"):{
                    cart.addProductById(3l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/add4"):{
                    cart.addProductById(4l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/add5"):{
                    cart.addProductById(5l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/delete1"): {
                    cart.deleteProductById(1l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/delete2"):{
                    cart.deleteProductById(2l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/delete3"):{
                    cart.deleteProductById(3l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/delete4"):{
                    cart.deleteProductById(4l);
                    System.out.println(cart.findAll());
                    break;
                }
                case ("/delete5"):{
                    cart.deleteProductById(5l);
                    System.out.println(cart.findAll());
                    break;
                }

            }

            context.close();
        }

    }
}
