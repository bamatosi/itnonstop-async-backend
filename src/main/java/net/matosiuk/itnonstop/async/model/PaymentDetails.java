package net.matosiuk.itnonstop.async.model;

import java.math.BigDecimal;

public class PaymentDetails {
    private int paymentId;
    private int fromAccountId;
    private int toAccountId;
    private int chargeAccountId;
    private String paymentType;
    private String beneficiaryBankName;
    private String beneficiaryAddress;
    private BigDecimal amount;
    private String description;

    public PaymentDetails(int paymentId, int fromAccountId, int toAccountId, int chargeAccountId, String paymentType, String beneficiaryBankName, String beneficiaryAddress, BigDecimal amount, String description) {
        this.paymentId = paymentId;
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.chargeAccountId = chargeAccountId;
        this.paymentType = paymentType;
        this.beneficiaryBankName = beneficiaryBankName;
        this.beneficiaryAddress = beneficiaryAddress;
        this.amount = amount;
        this.description = description;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(int fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public int getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(int toAccountId) {
        this.toAccountId = toAccountId;
    }

    public int getChargeAccountId() {
        return chargeAccountId;
    }

    public void setChargeAccountId(int chargeAccountId) {
        this.chargeAccountId = chargeAccountId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getBeneficiaryBankName() {
        return beneficiaryBankName;
    }

    public void setBeneficiaryBankName(String beneficiaryBankName) {
        this.beneficiaryBankName = beneficiaryBankName;
    }

    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
