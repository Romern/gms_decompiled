package p000;

import android.net.NetworkInfo;

/* renamed from: tdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final /* synthetic */ class tdh {

    /* renamed from: a */
    public static final /* synthetic */ int[] f45691a;

    static {
        int[] iArr = new int[NetworkInfo.State.values().length];
        f45691a = iArr;
        try {
            iArr[NetworkInfo.State.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f45691a[NetworkInfo.State.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f45691a[NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f45691a[NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f45691a[NetworkInfo.State.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
