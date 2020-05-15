package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: aymk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymk extends aymj {

    /* renamed from: b */
    public static final Uri f97976b = Uri.parse("content://com.google.settings/partner");

    /* renamed from: a */
    public static int m84257a(ContentResolver contentResolver, String str, int i) {
        String a = m84258a(contentResolver, str);
        if (a == null) {
            return i;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return i;
        }
    }

    /* renamed from: b */
    public static void m84259b(ContentResolver contentResolver, String str, int i) {
        aymj.m84255a(contentResolver, f97976b, str, String.valueOf(i));
    }

    /* renamed from: a */
    public static String m84258a(ContentResolver contentResolver, String str) {
        return aymj.m84254a(contentResolver, f97976b, str);
    }
}
