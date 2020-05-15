package p000;

import android.net.NetworkKey;

/* renamed from: akng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akng {
    /* renamed from: a */
    public static String m60080a(NetworkKey networkKey) {
        if (networkKey == null || networkKey.wifiKey == null) {
            return null;
        }
        return networkKey.wifiKey.ssid;
    }
}
