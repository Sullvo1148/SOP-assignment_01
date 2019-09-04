package com.shop.bergerqueen.bergerqueen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class BergerqueenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BergerqueenApplication.class, args);
    }

    public ArrayList<Menu> cart = new ArrayList<>();
    public int cost = 0;

    @RequestMapping("/")
    String home() {
        return "******************************************************************************\n" +
                "***********************************hello guys*********************************\n" +
                "******************************************************************************\n" +
                "  this is first page and show you how to use.\n" +
                "1. You can check the menu by type  /menu  after URL.\n" +
                "2. See menu detail by type  /menu/{id}  .\n" +
                "3. If you want to order it just type  /menu/{id}/add  to send to cart.\n" +
                "4. You can check your cart by type  /cart  .\n" +
                "5. You can order item(s) in cart by type  /cart/checkout  .\n" +
                "6. Clear cart by type  /cart/clear\n" +
                "******************************************************************************";
    }

    @RequestMapping("/menu")
    Menu[] viewMenuList() {
        return BergerMenuFactory.getMenuList();
    }

    @RequestMapping("/menu/{id}")
    Menu viewMenu(@PathVariable int id) {
        return BergerMenuFactory.getMenu(id);
    }

    @RequestMapping("/menu/{id}/add")
    String addToCart(@PathVariable int id) {
        cart.add(BergerMenuFactory.getMenu(id));
        return String.format("\"%s\" has been added to the cart.", BergerMenuFactory.getMenu(id).getName());
    }

    @RequestMapping("/cart")
    String viewCart() {
        double total = cart.stream().mapToDouble(Menu::getPrice).sum();
        StringBuilder toString = new StringBuilder(String.format("You have %d ", cart.size()));
        for (Menu menu : cart) {
            toString.append(String.format("\"%s\", ", menu.getName()));
        }
        toString.append(String.format(") in cart. Total: %.2f", total));
        return toString.toString();

    }

    @RequestMapping("/checkout")
    String checkout() {
        double total = cart.stream().mapToDouble(Menu::getPrice).sum();
        cart.clear();
        return "You just ordered wait for 10 mins. Total price is " + total;
    }
}
