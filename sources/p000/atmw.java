package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: atmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmw {
    /* renamed from: a */
    public static void m76192a(Context context, bxxc bxxc, String str, String str2, String str3) {
        int i;
        int i2;
        Cursor query;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("proto", bxxc.serializeToBytes());
            contentValues.put("account_name", str);
            contentValues.put("environment", str2);
            if (a.insert(str3, null, contentValues) != -1) {
                int a2 = bqcn.m112578a(DatabaseUtils.queryNumEntries(a, str3));
                if (!"TapInfos".equals(str3)) {
                    i = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                } else {
                    i = 500;
                }
                if (a2 > i) {
                    if (!"TapInfos".equals(str3)) {
                        i2 = 180;
                    } else {
                        i2 = 450;
                    }
                    query = a.query(str3, new String[]{"id"}, null, null, null, null, null, Integer.toString(a2 - i2));
                    int count = query.getCount();
                    long[] jArr = new long[count];
                    int i3 = 0;
                    while (query.moveToNext()) {
                        int i4 = i3 + 1;
                        jArr[i3] = query.getLong(0);
                        i3 = i4;
                    }
                    if (query != null) {
                        query.close();
                    }
                    for (int i5 = 0; i5 < count; i5++) {
                        m76195a(a, jArr[i5], str3);
                    }
                }
                a.setTransactionSuccessful();
            }
            a.endTransaction();
            return;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public static void m76193a(Context context, String str, String str2, String str3) {
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            a.delete(str3, "account_name=? AND environment=?", new String[]{str, str2});
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public static void m76194a(Context context, long[] jArr, String str) {
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            for (long j : jArr) {
                m76195a(a, j, str);
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    private static void m76195a(SQLiteDatabase sQLiteDatabase, long j, String str) {
        sQLiteDatabase.delete(str, "id=?", new String[]{Long.toString(j)});
    }

    /* renamed from: a */
    public static atmv[] m76196a(Context context, String str, String str2, int i, String str3) {
        Cursor query;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            query = a.query(str3, new String[]{"id", "proto"}, "account_name=? AND environment=?", new String[]{str, str2}, null, null, null, Integer.toString(i));
            atmv[] atmvArr = new atmv[query.getCount()];
            int i2 = 0;
            while (query.moveToNext()) {
                int i3 = i2 + 1;
                atmvArr[i2] = new atmv(query.getLong(0), query.getBlob(1));
                i2 = i3;
            }
            if (query != null) {
                query.close();
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            return atmvArr;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public static String[] m76197a(Context context, String str) {
        Cursor query;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            query = a.query(str, new String[]{"environment"}, null, null, "environment", null, null, null);
            String[] strArr = new String[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                int i2 = i + 1;
                strArr[i] = query.getString(0);
                i = i2;
            }
            if (query != null) {
                query.close();
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            return strArr;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public static String[] m76198a(Context context, String str, String str2) {
        Cursor query;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            query = a.query(str2, new String[]{"account_name"}, "environment=?", new String[]{str}, "account_name", null, null, null);
            String[] strArr = new String[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                int i2 = i + 1;
                strArr[i] = query.getString(0);
                i = i2;
            }
            if (query != null) {
                query.close();
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            return strArr;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
        throw th;
    }
}
