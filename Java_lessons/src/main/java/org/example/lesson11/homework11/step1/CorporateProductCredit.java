package org.example.lesson11.homework11.step1;

//1. Дан список объектов 10-ти CorporateProductCredit (UUID id, Long statusId, Long typeId, boolean active, LocalDate exprationTime)
// включая дубликаты по полям (statusId, typeId, active, expirationTime) => превратить в список без дубликатов в отсортированном виде по expirationTime;
//2. Дан список сток (10 шт.) с повторами, реализовать метод boolean allItemsAreUnique(List<String> list) который проверяет есть ли дубликаты в списке.

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"id"})

public class CorporateProductCredit {
    private UUID id;
    private Long statusId;
    private Long typeId;
    private boolean active;
    private LocalDate expirationTime;

}
