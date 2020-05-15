package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgk {
    /* renamed from: a */
    public static Cursor m55686a(Context context, Uri uri) {
        return m55687a(context, uri, null);
    }

    /* renamed from: b */
    public static Long m55692b(Cursor cursor, int i) {
        return (Long) m55689a("getLong", new ahgi(cursor, i));
    }

    /* renamed from: c */
    public static Boolean m55695c(Cursor cursor, int i) {
        return (Boolean) m55689a("getBoolean", new ahgj(cursor, i));
    }

    /* renamed from: a */
    public static Cursor m55687a(Context context, Uri uri, String[] strArr) {
        return m55688a(context, uri, strArr, null, null, null);
    }

    /* renamed from: b */
    public static Long m55693b(Cursor cursor, String str) {
        try {
            return m55692b(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to get the %s column value", str);
            return null;
        }
    }

    /* renamed from: a */
    public static Cursor m55688a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) m55689a("query", new ahgf(context, uri, strArr, str, strArr2, str2));
    }

    /* renamed from: a */
    public static Object m55689a(String str, Callable callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Operation %s failed", str);
            return null;
        }
    }

    /* renamed from: b */
    public static void m55694b(Context context, Uri uri) {
        Integer num = (Integer) m55689a("delete", new ahge(context, uri));
        if (num == null || num.intValue() != 0) {
        }
    }

    /* renamed from: a */
    public static String m55690a(Cursor cursor, int i) {
        return (String) m55689a("getString", new ahgh(cursor, i));
    }

    /* renamed from: a */
    public static String m55691a(Cursor cursor, String str) {
        try {
            return m55690a(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to get the %s column value", str);
            return null;
        }
    }
}
