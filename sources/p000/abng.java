package p000;

import android.net.NetworkInfo;

/* renamed from: abng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class abng {

    /* renamed from: a */
    static final /* synthetic */ int[] f57732a;

    /* renamed from: b */
    static final /* synthetic */ int[] f57733b;

    static {
        int[] iArr = new int[NetworkInfo.DetailedState.values().length];
        f57733b = iArr;
        try {
            iArr[NetworkInfo.DetailedState.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.SCANNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.AUTHENTICATING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.CONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.SUSPENDED.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.DISCONNECTING.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.DISCONNECTED.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.FAILED.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.BLOCKED.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f57733b[NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
        }
        int[] iArr2 = new int[NetworkInfo.State.values().length];
        f57732a = iArr2;
        try {
            iArr2[NetworkInfo.State.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError e14) {
        }
        try {
            f57732a[NetworkInfo.State.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e15) {
        }
        try {
            f57732a[NetworkInfo.State.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError e16) {
        }
        try {
            f57732a[NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError e17) {
        }
        try {
            f57732a[NetworkInfo.State.DISCONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError e18) {
        }
        try {
            f57732a[NetworkInfo.State.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError e19) {
        }
    }
}
