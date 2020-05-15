package p000;

import android.net.Uri;

/* renamed from: bbeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbeg {
    /* renamed from: a */
    public static Uri m87877a(Uri uri) {
        String uri2 = uri.toString();
        return Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
    }

    /* renamed from: a */
    public static String m87878a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }
}
