package net.matosiuk.itnonstop.async.model;

public class AccountDetails {
    private int accountId;
    private String accountType;
    private String holderName;
    private String holderAddress;
    private boolean isSuperAccount;

    public AccountDetails(int accountId, String accountType, String holderName, String holderAddress, boolean isSuperAccount) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.holderName = holderName;
        this.holderAddress = holderAddress;
        this.isSuperAccount = isSuperAccount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderAddress() {
        return holderAddress;
    }

    public void setHolderAddress(String holderAddress) {
        this.holderAddress = holderAddress;
    }

    public boolean isSuperAccount() {
        return isSuperAccount;
    }

    public void setSuperAccount(boolean superAccount) {
        isSuperAccount = superAccount;
    }
}
