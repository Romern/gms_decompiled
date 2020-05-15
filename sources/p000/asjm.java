package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: asjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjm {

    /* renamed from: a */
    private static final rtc f89074a = rtc.m34377a("android_id", (Long) 0L);

    /* renamed from: a */
    public static long m74238a(Context context) {
        if (!aytw.m84813a(context)) {
            return ryv.m34678a(f89074a);
        }
        Log.w("AndroidIdManager", "getAndroidId is called in direct boot mode.");
        return 0;
    }

    /* renamed from: a */
    public static long m74239a(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT value from GlobalValues where key_id = ? AND environment = ?;", new String[]{"registered_android_id", str});
        try {
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } else if (rawQuery == null) {
                return 0;
            } else {
                rawQuery.close();
                return 0;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static void m74240a(long j, String str, SQLiteDatabase sQLiteDatabase) {
        sdo.m34963a(j);
        ContentValues contentValues = new ContentValues();
        contentValues.put("key_id", "registered_android_id");
        contentValues.put("value", Long.valueOf(j));
        contentValues.put("environment", str);
        sQLiteDatabase.insertWithOnConflict("GlobalValues", null, contentValues, 5);
    }
}
