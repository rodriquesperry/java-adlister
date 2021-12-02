public class Pizza {
    private String pizzaCrust;
    private String pizzaSauce;
    private String pizzaSize;
    private String[] pizzaToppings;

    public void Pizza(String pizzaCrust, String pizzaSauce, String pizzaSize, String[] pizzaToppings) {
        this.pizzaCrust = pizzaCrust;
        this.pizzaSauce = pizzaSauce;
        this.pizzaSize = pizzaSize;
        this.pizzaToppings = pizzaToppings;
    }

    public String[] getPizzaToppings() {
        return pizzaToppings;
    }

    public String  getPizzaSize() {
        return pizzaSize;
    }

    public String getPizzaSauce() {
        return pizzaSauce;
    }

    public String getPizzaCrust() {
        return pizzaCrust;
    }

    public void setPizzaToppings(String[] toppings){
        this.pizzaToppings = toppings;
    }

    public void setPizzaCrust(String pizzaCrust) {
        this.pizzaCrust = pizzaCrust;
    }

    public void setPizzaSauce(String pizzaSauce) {
        this.pizzaSauce = pizzaSauce;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
}
