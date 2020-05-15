package org.chromium.net;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApiVersion {
    private static final int API_LEVEL = 13;
    private static final String CRONET_VERSION = "83.0.4099.5";
    private static final String LAST_CHANGE = "0f844ff8224045a44cd1cf88908a877710b916ec-refs/branch-heads/4099@{#8}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "83.0.4099.5@" + LAST_CHANGE.substring(0, 8);
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 13;
    }
}
