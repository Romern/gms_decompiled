package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rul implements ruh {

    /* renamed from: a */
    static final String f43711a = MessageFormat.format("CREATE TABLE IF NOT EXISTS {0} ({1} TEXT NOT NULL, {2} TEXT NOT NULL, {3} TEXT NOT NULL, {4} INTEGER NOT NULL, {5} INTEGER NOT NULL, {6} BLOB, {7} INTEGER NOT NULL, {8} BOOLEAN NOT NULL, {9} INTEGER NOT NULL, CONSTRAINT {0}_pk PRIMARY KEY ({1}, {3}));", "recent_fixes", "fixer_name", "condition_name", "fix_name", "execution_time_seconds", "valid_till_seconds", "data", "status", "entry_point", "is_log_deferred");

    /* renamed from: b */
    public static final /* synthetic */ int f43712b = 0;

    /* renamed from: c */
    private static final String[] f43713c = {"fixer_name", "condition_name", "fix_name", "execution_time_seconds", "valid_till_seconds", "data", "status", "entry_point", "is_log_deferred"};

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* renamed from: a */
    public static List m34486a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Throwable th;
        Cursor cursor;
        bpun bpun;
        boolean z;
        try {
            cursor = sQLiteDatabase.query("recent_fixes", f43713c, str, strArr, null, null, null);
            try {
                ArrayList arrayList = new ArrayList();
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("fixer_name"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("condition_name"));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("fix_name"));
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow("execution_time_seconds"));
                        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("valid_till_seconds"));
                        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("status"));
                        bpun a = bpun.m112298a(cursor.getInt(cursor.getColumnIndexOrThrow("entry_point")));
                        if (a != null) {
                            bpun = a;
                        } else {
                            bpun = bpun.UNKNOWN;
                        }
                        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_log_deferred")) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new ruk(string, string2, string3, j, j2, j3, bpun, z, cursor.getBlob(cursor.getColumnIndexOrThrow("data"))));
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static final List m34488e(SQLiteDatabase sQLiteDatabase) {
        return m34486a(sQLiteDatabase, "is_log_deferred = ?", new String[]{"1"});
    }

    /* renamed from: b */
    public final void mo25171b(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: c */
    public final void mo25172c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recent_fixes");
        mo25170a(sQLiteDatabase);
    }

    /* renamed from: d */
    public final void mo25173d(SQLiteDatabase sQLiteDatabase) {
        List<ruk> arrayList = new ArrayList();
        try {
            arrayList = m34488e(sQLiteDatabase);
        } catch (SQLiteException e) {
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recent_fixes");
        mo25170a(sQLiteDatabase);
        for (ruk ruk : arrayList) {
            m34487a(sQLiteDatabase, ruk.f43702a, ruk.f43703b, ruk.f43704c, ruk.f43705d, ruk.f43706e, ruk.f43707f, bpur.m112304a((int) ruk.f43708g), ruk.f43709h, ruk.f43710i);
        }
    }

    /* renamed from: a */
    public static final void m34487a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, long j, long j2, byte[] bArr, int i, bpun bpun, boolean z) {
        bpun bpun2;
        int i2 = i - 1;
        if (i != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fixer_name", str);
            contentValues.put("condition_name", str2);
            contentValues.put("fix_name", str3);
            contentValues.put("execution_time_seconds", Long.valueOf(j));
            contentValues.put("valid_till_seconds", Long.valueOf(j2));
            contentValues.put("data", bArr);
            contentValues.put("status", Long.valueOf((long) i2));
            contentValues.put("entry_point", Integer.valueOf(bpun.f139268j));
            contentValues.put("is_log_deferred", Boolean.valueOf(z));
            if (sQLiteDatabase.insertWithOnConflict("recent_fixes", null, contentValues, 5) == -1) {
                Log.w("RecentFixesTable", "Insert of crash failed due to an unknown error.");
            } else if (!contentValues.containsKey("fixer_name") || !contentValues.containsKey("condition_name") || !contentValues.containsKey("fix_name") || !contentValues.containsKey("execution_time_seconds") || !contentValues.containsKey("valid_till_seconds") || !contentValues.containsKey("data") || !contentValues.containsKey("status") || !contentValues.containsKey("entry_point") || !contentValues.containsKey("is_log_deferred")) {
                Log.i("RecentFixesTable", "Missing an expected column from the database.");
            } else {
                bpun a = bpun.m112298a(contentValues.getAsInteger("entry_point").intValue());
                if (a != null) {
                    bpun2 = a;
                } else {
                    bpun2 = bpun.UNKNOWN;
                }
                new ruk(contentValues.getAsString("fixer_name"), contentValues.getAsString("condition_name"), contentValues.getAsString("fix_name"), contentValues.getAsLong("execution_time_seconds").longValue(), contentValues.getAsLong("valid_till_seconds").longValue(), contentValues.getAsLong("status").longValue(), bpun2, contentValues.getAsBoolean("is_log_deferred").booleanValue(), contentValues.getAsByteArray("data"));
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo25170a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f43711a);
    }
}
