package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: acoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acoq {

    /* renamed from: a */
    public static final long f60357a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    static final String[] f60358b = {"_id"};

    /* renamed from: c */
    public static final bnic f60359c = bnic.m109494a("image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "text/plain", "video/mp4");

    /* renamed from: d */
    public static final String[] f60360d = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read"};

    /* renamed from: e */
    public static final String[] f60361e = {"_id", "msg_box", "thread_id", "date", "sub", "read"};

    /* renamed from: f */
    public static final String[] f60362f = {"type", "address"};

    /* renamed from: g */
    public static final String[] f60363g = {"_id", "ct", "text"};

    /* renamed from: h */
    public static final String f60364h = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", "date", "date", "_id", "date");

    /* renamed from: i */
    public static final String f60365i = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", "date", "date", "_id", "date");

    /* renamed from: j */
    public final Context f60366j;

    /* renamed from: k */
    public final acne f60367k;

    public acoq(Context context, acne acne) {
        this.f60366j = context;
        this.f60367k = acne;
    }

    /* renamed from: a */
    private static String m49626a(List list) {
        return String.format("_id || ';' || date IN (%s) AND read IS 1", TextUtils.join(",", list));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* renamed from: b */
    public final int mo32964b(Uri uri) {
        Cursor a = this.f60367k.mo32907a(uri, f60358b, null, null, "_id DESC LIMIT 1");
        int i = -1;
        if (a == null) {
            return -1;
        }
        try {
            if (a.moveToFirst()) {
                i = sra.m36061a(a, 0, (Integer) -1).intValue();
            }
            a.close();
            return i;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final void m49627a(Uri uri, String str, List list) {
        Cursor a = this.f60367k.mo32907a(uri, f60358b, str, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                try {
                    Integer a2 = sra.m36060a(a, 0);
                    if (a2 != null) {
                        list.add(a2);
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        if (a != null) {
            a.close();
            return;
        }
        return;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* renamed from: a */
    public final int mo32961a(Uri uri, boolean z) {
        String str;
        if (z) {
            str = "read IS 0";
        } else {
            str = null;
        }
        Cursor a = this.f60367k.mo32907a(uri, new String[]{"count(*) as count"}, str, null, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int intValue = sra.m36061a(a, 0, (Integer) 0).intValue();
                    a.close();
                    return intValue;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (a != null) {
            a.close();
        }
        return 0;
        throw th;
    }

    /* renamed from: a */
    public final Iterator mo32962a(Uri uri) {
        return new acoc("_id", this.f60367k, uri);
    }

    /* renamed from: a */
    public final List mo32963a(int i, Uri uri, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
            if (arrayList.size() == i) {
                m49627a(uri, m49626a(arrayList), arrayList2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            m49627a(uri, m49626a(arrayList), arrayList2);
        }
        return arrayList2;
    }
}
