package org.example.lesson6.homework6.step3;

public class ChefCook {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Lamb lamb = new Lamb();
        Pork pork = new Pork();
        Rabbit rabbit = new Rabbit();
        Shrimp shrimp = new Shrimp();
        Tuna tuna = new Tuna();

        Chef.cook(bird);
        Chef.cook(lamb);
        Chef.cook(pork);
        Chef.cook(rabbit);
        Chef.cook(shrimp);
        Chef.cook(tuna);
    }
}
