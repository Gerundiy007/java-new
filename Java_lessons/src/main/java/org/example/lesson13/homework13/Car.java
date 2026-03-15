package org.example.lesson13.homework13;

//дз 1. Дан список автомобилей Car(модель, цена $, цвет, год выпуска, количество владельцев) минимум 10 шт., задачи:
//        1.1. Отобрать список машин младше 2020 года выпуска;
//1.2. Заменить цвет авто, цена < 5000$;
//1.3. Преобразовать цены в руб;
//1.4. Повысить цены на авто старше 2020 на 10000 руб;
//1.5. Вывести инфу об авто в консоль;
//1.6. Перебрать список, найти первое авто с ценой < 150000 руб, если нет выбросить CarNotFoundException(“Авто с ценой < 150000 не обнаружено”);
//1.7. Через any-all-non-match проверить условие цена > 2000000 и 1 владелец и год выпуска > 2016;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Car{
    private String brand;
    private double price;
    private String color;
    private Integer year;
    private Integer owners;
}
