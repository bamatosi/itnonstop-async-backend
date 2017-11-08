package net.matosiuk.itnonstop.async.model;

import java.math.BigDecimal;

public class PaymentTypeDetails {
    private String type;
    private String displayName;
    private BigDecimal chargeValue;

    public PaymentTypeDetails(String type, String displayName, BigDecimal chargeValue) {
        this.type = type;
        this.displayName = displayName;
        this.chargeValue = chargeValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BigDecimal getChargeValue() {
        return chargeValue;
    }

    public void setChargeValue(BigDecimal chargeValue) {
        this.chargeValue = chargeValue;
    }
}
