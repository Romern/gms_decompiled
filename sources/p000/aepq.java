package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: aepq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepq {

    /* renamed from: a */
    public static final Uri f63607a = Uri.parse("content://com.google.android.gms.location.preferences");

    /* renamed from: a */
    public static long m52363a(ContentResolver contentResolver, String str, long j) {
        return Long.parseLong(m52365a(contentResolver, str, 3, Long.toString(j)));
    }

    /* renamed from: b */
    public static void m52368b(ContentResolver contentResolver, String str) {
        m52366a(contentResolver, str, Boolean.toString(false));
    }

    /* renamed from: a */
    public static Uri m52364a(String str) {
        return f63607a.buildUpon().appendPath(str).build();
    }

    /* renamed from: b */
    public static void m52369b(ContentResolver contentResolver, String str, long j) {
        m52366a(contentResolver, str, Long.toString(j));
    }

    /* renamed from: a */
    public static String m52365a(ContentResolver contentResolver, String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("valueType", i);
        if (str2 != null) {
            bundle.putString("defaultValue", str2);
        }
        return contentResolver.call(f63607a, "read", str, bundle).getString("value", str2);
    }

    /* renamed from: a */
    public static void m52366a(ContentResolver contentResolver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("value", str2);
        contentResolver.call(f63607a, "write", str, bundle);
    }

    /* renamed from: a */
    public static boolean m52367a(ContentResolver contentResolver, String str) {
        return Boolean.parseBoolean(m52365a(contentResolver, str, 1, Boolean.toString(true)));
    }
}
