//2. Создать классы Повар, Курица, Индейка, Утка, Лосось, Карп, Осетр;
//- в классе Повар static метод готовить принимает ингредиент (Курица, Осетр …) и выводит в консоль что он готовит;

package org.example.lesson6.homework6.step3;

public class Chef {

    public static void cook(Object ingredient) {

        if (ingredient instanceof Bird bird) {
            bird.bird();
        }

        if (ingredient instanceof Lamb lamb) {
            lamb.lamb();
        }

        if (ingredient instanceof Pork pork) {
            pork.pork();
        }

        if (ingredient instanceof Rabbit rabbit) {
            rabbit.rabbit();
        }

        if (ingredient instanceof Shrimp shrimp) {
            shrimp.shrimp();
        }

        if (ingredient instanceof Tuna tuna) {
            tuna.tuna();
        }
    }
}
