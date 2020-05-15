package p000;

import android.net.NetworkInfo;

/* renamed from: akne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final /* synthetic */ class akne {

    /* renamed from: a */
    public static final /* synthetic */ int[] f72298a;

    static {
        int[] iArr = new int[NetworkInfo.DetailedState.values().length];
        f72298a = iArr;
        try {
            iArr[NetworkInfo.DetailedState.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.DISCONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.BLOCKED.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.IDLE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.SCANNING.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.AUTHENTICATING.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.SUSPENDED.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f72298a[NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
        }
    }
}
