package net.matosiuk.itnonstop.async.model;

import java.util.HashMap;
import java.util.Map;

public class Permissions {
    private static final String INTERNAL_KEY = "INTERNAL";
    private static final String DOMESTIC_KEY = "DOMESTIC";
    private static final String INTERNATIONAL_KEY = "INTERNATIONAL";
    private static final String DISPLAY = "display";
    private static final String EDIT = "edit";

    private HashMap<String, Map<String, Boolean >> perms = new HashMap<>();

    public Permissions(boolean canDisplayInternal, boolean canDisplayDomestic, boolean canDisplayInternational, boolean canEditInternal, boolean canEditDomestic, boolean canEditInternational) {
        Map<String, Boolean> internal = new HashMap<>();
        Map<String, Boolean> domestic = new HashMap<>();
        Map<String, Boolean> international = new HashMap<>();

        internal.put(DISPLAY, canDisplayInternal);
        internal.put(EDIT, canEditInternal);

        domestic.put(DISPLAY, canDisplayDomestic);
        domestic.put(EDIT, canEditDomestic);

        international.put(DISPLAY, canDisplayInternational);
        international.put(EDIT, canEditInternational);

        this.perms.put(DOMESTIC_KEY, domestic);
        this.perms.put(INTERNAL_KEY, internal);
        this.perms.put(INTERNATIONAL_KEY, international);
    }

    public HashMap<String, Map<String, Boolean>> getPerms() {
        return perms;
    }

    public void setPerms(HashMap<String, Map<String, Boolean>> perms) {
        this.perms = perms;
    }
}
