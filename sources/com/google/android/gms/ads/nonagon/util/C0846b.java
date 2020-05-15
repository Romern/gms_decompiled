package com.google.android.gms.ads.nonagon.util;

import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* renamed from: com.google.android.gms.ads.nonagon.util.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0846b {
    /* renamed from: a */
    public static AdErrorParcel m6029a(int i) {
        return m6030a(i, null);
    }

    /* renamed from: a */
    public static AdErrorParcel m6030a(int i, String str) {
        String str2;
        if (str != null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 1) {
                return new AdErrorParcel(1, str, "com.google.android.gms.ads");
            } else {
                if (i2 != 2) {
                    return new AdErrorParcel(0, str, "com.google.android.gms.ads");
                }
                return new AdErrorParcel(3, str, "com.google.android.gms.ads");
            }
        } else {
            int i3 = i - 1;
            if (i != 0) {
                if (i3 == 1) {
                    str2 = "Invalid request.";
                } else if (i3 != 2) {
                    str2 = "Internal error.";
                } else {
                    str2 = "No fill.";
                }
                return m6030a(i, str2);
            }
            throw null;
        }
    }
}
