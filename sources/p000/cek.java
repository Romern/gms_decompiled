package p000;

import android.net.Uri;

/* renamed from: cek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cek {
    /* renamed from: a */
    public static boolean m4070a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: b */
    public static boolean m4072b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* renamed from: a */
    public static boolean m4071a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
