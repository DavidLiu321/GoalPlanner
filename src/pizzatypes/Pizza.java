package pizzatypes;

public class Pizza {
    Toppings topping;

    public Pizza() {
        this.topping = new Toppings();
    }

    public void addAnchovies(){
        sayTopping();
        topping.anchovies();
    }

    public void addPepperoni(){
        sayTopping();
        topping.pepperoni();
    }

    public void addLettuce(){
        sayTopping();
        topping.lettuce();
    }

    public void addMushrooms(){
        sayTopping();
        topping.mushrooms();
    }

    public void addTomatoes(){
        sayTopping();
        topping.tomatoes();
    }

    public void sayTopping(){
        System.out.print("");
    }


}
