package org.example.lesson6.homework6.step3;

public class ChefCook {
    public static void main(String[] args) {
        final Bird bird = new Bird();
        final Lamb lamb = new Lamb();
        final Pork pork = new Pork();
        final Rabbit rabbit = new Rabbit();
        final Shrimp shrimp = new Shrimp();
        final Tuna tuna = new Tuna();

        Chef.cook(bird);
        Chef.cook(lamb);
        Chef.cook(pork);
        Chef.cook(rabbit);
        Chef.cook(shrimp);
        Chef.cook(tuna);
    }
}
