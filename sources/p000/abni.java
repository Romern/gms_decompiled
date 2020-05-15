package p000;

import android.util.Base64;

/* renamed from: abni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abni {
    /* renamed from: a */
    public static long m47952a(String str, int i) {
        sdo.m34975b(true, "Bad numBytes input");
        byte[] a = spn.m35862a(str, "SHA-256");
        long j = 0;
        if (a != null) {
            for (int i2 = 0; i2 < Math.min(i, a.length); i2++) {
                j |= (((long) a[i2]) & 255) << (i2 << 3);
            }
        }
        return j;
    }

    /* renamed from: b */
    public static int m47954b(String str) {
        return (int) m47952a(str, 4);
    }

    /* renamed from: a */
    public static String m47953a(String str) {
        return Base64.encodeToString(spn.m35862a(str, "SHA-256"), 11);
    }
}
