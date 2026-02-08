package org.example.lesson3.homework3;

import java.util.UUID;

public class ProductCredit {
    private UUID id;
    private String purpose;
    private int isActive;
    private boolean isArchived;
    private String error;

    public ProductCredit() {}

    public ProductCredit(UUID id, String purpose, int isActive, boolean isArchived) {
        this.id = id;
        this.purpose = purpose;
        this.isActive = isActive;
        this.isArchived = isArchived;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getIsActive() {
        {
            return isActive;
        }

    }

    public void setIsActive(int isActive) {
        if (validateIsActive(isActive)) {
            this.isActive = isActive;
            return;
        }
        this.isActive = 2;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    private boolean validateIsActive(int isActive) {
        if (isActive != 3) {
            return false;
        }
        return true;
    }
}
