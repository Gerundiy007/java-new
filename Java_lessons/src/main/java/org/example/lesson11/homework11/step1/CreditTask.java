package org.example.lesson11.homework11.step1;

import java.time.LocalDate;
import java.util.*;

public class CreditTask {
    public static void main(String[] args) {

        final List<CorporateProductCredit> credits = new ArrayList<>();

        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 1L, true, LocalDate.of(2025, 5, 1)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 1L, true, LocalDate.of(2025, 5, 1))); // дубликат
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 2L, 1L, true, LocalDate.of(2024, 3, 1)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2026, 1, 1)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2026, 2, 1)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2027, 10, 21)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2027, 10, 21)));// дубликат
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2023, 11, 22)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, true, LocalDate.of(2022, 12, 31)));
        credits.add(new CorporateProductCredit(UUID.randomUUID(), 1L, 2L, false, LocalDate.of(2020, 7, 7)));

        final Set<CorporateProductCredit> result = new TreeSet<>((a, b) -> {

            int cmp = a.getExpirationTime().compareTo(b.getExpirationTime());
            if (cmp != 0) return cmp;

            cmp = a.getStatusId().compareTo(b.getStatusId());
            if (cmp != 0) return cmp;

            cmp = a.getTypeId().compareTo(b.getTypeId());
            if (cmp != 0) return cmp;

            cmp = Boolean.compare(a.isActive(), b.isActive());
            return cmp;
        });

        result.addAll(credits);

        System.out.println(result);
    }
}