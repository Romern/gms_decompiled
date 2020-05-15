package p000;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: atxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxr {
    /* renamed from: a */
    public static long m76514a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(str, objArr);
            long longForQuery = DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
            sQLiteDatabase.setTransactionSuccessful();
            return longForQuery;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: b */
    public static byte[] m76518b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        return (byte[]) m76515a(sQLiteDatabase, atxq.f91087a, null, str, strArr);
    }

    /* renamed from: c */
    public static int m76519c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        try {
            int count = rawQuery.getCount();
            if (rawQuery != null) {
                rawQuery.close();
            }
            return count;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static Object m76515a(SQLiteDatabase sQLiteDatabase, srl srl, Object obj, String str, String... strArr) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        try {
            if (rawQuery.moveToFirst()) {
                Object a = srl.mo21850a(rawQuery);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return a;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return obj;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static String m76516a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        return (String) m76515a(sQLiteDatabase, atxp.f91086a, null, str, strArr);
    }

    /* renamed from: a */
    public static List m76517a(SQLiteDatabase sQLiteDatabase, srl srl, String str, String... strArr) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(srl.mo21850a(rawQuery));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
