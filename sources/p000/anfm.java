package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: anfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfm {
    /* renamed from: a */
    public static long m64160a(SQLiteDatabase sQLiteDatabase) {
        return m64161a(sQLiteDatabase, "__sync");
    }

    /* renamed from: b */
    public static long m64162b(SQLiteDatabase sQLiteDatabase, String str) {
        long a = m64161a(sQLiteDatabase, str) + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("packageName", str);
        contentValues.put("count", Long.valueOf(a));
        if (sQLiteDatabase.insertWithOnConflict("ChangeCounts", null, contentValues, 5) >= 0) {
            return a;
        }
        String valueOf = String.valueOf(str);
        throw new SQLiteException(valueOf.length() == 0 ? new String("Failed to increment change count for ") : "Failed to increment change count for ".concat(valueOf));
    }

    /* renamed from: a */
    public static long m64161a(SQLiteDatabase sQLiteDatabase, String str) {
        long j;
        Cursor query = sQLiteDatabase.query("ChangeCounts", new String[]{"count"}, "packageName = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                j = query.getLong(0);
            } else {
                j = 0;
            }
            if (query != null) {
                query.close();
            }
            return j;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
