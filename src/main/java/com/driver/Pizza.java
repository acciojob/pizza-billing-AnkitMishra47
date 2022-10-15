package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isChesseAdded ;
    private boolean isToppingsAdded ;
    private boolean isPaperbagAdded ;

    public Pizza(Boolean isVeg) {
        this.bill ="";
        isChesseAdded = false ;
        isToppingsAdded = false ;
        isPaperbagAdded = false ;
        this.isVeg = isVeg;

        if (isVeg) {
            this.bill += "Base Price Of The Pizza: 300\n";
            this.price = 300;
        } else {
            this.bill += "Base Price Of The Pizza: 400\n";
            this.price = 400;
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (isChesseAdded)return ;
        this.bill += "Extra Cheese Added: 80\n";
        price += 80;
        isChesseAdded = true ;
    }

    public void addExtraToppings() {
        if (isToppingsAdded)return ;
        if (isVeg) {
            this.bill += "Extra Toppings Added: 70\n";
            price += 70;
        } else {
            this.bill += "Extra Toppings Added: 120\n";
            price += 120;
        }
        isToppingsAdded = true ;
    }

    public void addTakeaway() {
        if (isPaperbagAdded)return ;
        this.bill += "Paperbag Added: 20\n";
        price += 20;
        isPaperbagAdded = true ;
    }

    public String getBill() {
        this.bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
