package com.example.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.maven.model.Organization;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.startMaximized = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://mobile-shop-se.herokuapp.com/");
    }

    @Order (1)
    @Test
    public void homePage() {
        mainPage.header.shouldBe(visible);
        mainPage.navBar.shouldBe(visible);
        mainPage.mainSite.shouldBe(visible);
        mainPage.newPhones.shouldBe(visible);
        mainPage.specialPrice.shouldBe(visible);
        mainPage.topSale.shouldBe(visible);
        mainPage.blogs.shouldBe(visible);
        mainPage.footer.shouldBe(visible);
    }

    @Order(2)
    @Test
    public void navBarMenu() {
        mainPage.navBarItemOnSale.shouldBe(visible);
        mainPage.navBarItemCategory.shouldBe(visible);
        mainPage.navBarItemProducts.shouldBe(visible);
        mainPage.navBarItemBlog.shouldBe(visible);
        mainPage.navBarItemCat.shouldBe(visible);
        mainPage.navBarItemComingSoon.shouldBe(visible);
    }

    @Order(3)
    @Test
    public void addToCart(){
        int cartNumber = Integer.parseInt(mainPage.cartNumber.getValue());
        mainPage.addToCartBtn.click();
        cartNumber++;
        assertEquals(cartNumber, Integer.parseInt(mainPage.cartNumber.getValue()));
    }

    @Order(4)
    @Test
    public void cartPage(){
        mainPage.cartBtn.click();
        mainPage.shoppingCartTitle.shouldBe(visible);
    }

    @Order(5)
    @Test
    public void deleteFromCart(){
        mainPage.cartBtn.click();
        int cartNumber = Integer.parseInt(mainPage.cartNumber.getValue());
        mainPage.deleteFromCart.click();
        cartNumber--;
        assertEquals(cartNumber, Integer.parseInt(mainPage.cartNumber.getValue()));
    }
}
