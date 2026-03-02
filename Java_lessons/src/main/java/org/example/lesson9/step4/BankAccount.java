package org.example.lesson9.step4;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

/**
 * Переменные для банковского счета.
 */
public class BankAccount {
    private String firstname;
    private String lastname;
    private double balance;
    private boolean active;
    private boolean redSaldo;
}
