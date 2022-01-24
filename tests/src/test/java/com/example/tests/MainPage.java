package com.example.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    //public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    //public SelenideElement toolsMenu = $x("//div[contains(@class, 'menu-main__item') and text() = 'Tools']");
    //public SelenideElement searchButton = $("[data-test=menu-main-icon-search]");

    public SelenideElement header = $("#header");
    public SelenideElement navBar = $("#navbarNav");
    public SelenideElement mainSite = $("#main-site");
    public SelenideElement topSale = $("#top-sale");
    public SelenideElement specialPrice = $("#special-price");
    public SelenideElement newPhones = $("#new-phones");
    public SelenideElement blogs = $("#blogs");
    public SelenideElement footer = $("#footer");

    public SelenideElement navBarItemOnSale = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a[text()=\"On Sale\"]"));
    public SelenideElement navBarItemCategory = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a[text()=\"Category\"]"));
    public SelenideElement navBarItemProducts = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[3]/a[text()=\"Products \"]"));
    public SelenideElement navBarItemBlog = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[4]/a[text()=\"Blog\"]"));
    public SelenideElement navBarItemCat = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[5]/a[text()=\"Category \"]"));
    public SelenideElement navBarItemComingSoon = $(By.xpath("//*[@id=\"navbarNav\"]/ul/li[6]/a[text()=\"Coming Soon\"]"));

    // //a [@href="product.php?item_id=13"]/following-sibling::div[1]//button[.='Add to Cart']
    public SelenideElement cartNumber = $(By.xpath("//span[contains(@class, 'rounded-pill')]"));
    public SelenideElement addToCartBtn = $(By.xpath("//*[@id=\"special-price\"]/div/div[2]/div[1]/div/div/div/form/button"));

    public SelenideElement cartBtn = $(".fa-shopping-cart");
    public SelenideElement shoppingCartTitle = $(By.xpath("//h5[text()=\'Shopping Cart\']"));

    public SelenideElement deleteFromCart = $(By.xpath("//*[@id=\"cart\"]/div/div/div[1]/div[1]/div[2]/div[2]/form[1]/button"));

    public SelenideElement addToWishlistBtn = $(By.xpath("//*[@id=\"cart\"]/div/div/div[1]/div[1]/div[2]/div[2]/form[2]/button"));

}


