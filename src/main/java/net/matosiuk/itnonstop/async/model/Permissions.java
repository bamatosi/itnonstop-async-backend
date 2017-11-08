package net.matosiuk.itnonstop.async.model;

public class Permissions {
    private boolean canDisplayInternal;
    private boolean canDisplayDomestic;
    private boolean canDisplayinternational;
    private boolean canEditInternal;
    private boolean canEditDomestic;
    private boolean canEditinternational;

    public Permissions(boolean canDisplayInternal, boolean canDisplayDomestic, boolean canDisplayinternational, boolean canEditInternal, boolean canEditDomestic, boolean canEditinternational) {
        this.canDisplayInternal = canDisplayInternal;
        this.canDisplayDomestic = canDisplayDomestic;
        this.canDisplayinternational = canDisplayinternational;
        this.canEditInternal = canEditInternal;
        this.canEditDomestic = canEditDomestic;
        this.canEditinternational = canEditinternational;
    }

    public boolean isCanDisplayInternal() {
        return canDisplayInternal;
    }

    public void setCanDisplayInternal(boolean canDisplayInternal) {
        this.canDisplayInternal = canDisplayInternal;
    }

    public boolean isCanDisplayDomestic() {
        return canDisplayDomestic;
    }

    public void setCanDisplayDomestic(boolean canDisplayDomestic) {
        this.canDisplayDomestic = canDisplayDomestic;
    }

    public boolean isCanDisplayinternational() {
        return canDisplayinternational;
    }

    public void setCanDisplayinternational(boolean canDisplayinternational) {
        this.canDisplayinternational = canDisplayinternational;
    }

    public boolean isCanEditInternal() {
        return canEditInternal;
    }

    public void setCanEditInternal(boolean canEditInternal) {
        this.canEditInternal = canEditInternal;
    }

    public boolean isCanEditDomestic() {
        return canEditDomestic;
    }

    public void setCanEditDomestic(boolean canEditDomestic) {
        this.canEditDomestic = canEditDomestic;
    }

    public boolean isCanEditinternational() {
        return canEditinternational;
    }

    public void setCanEditinternational(boolean canEditinternational) {
        this.canEditinternational = canEditinternational;
    }
}
