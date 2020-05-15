package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.Set;

/* renamed from: sra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sra {
    /* renamed from: a */
    public static long m36059a(Context context, String str) {
        try {
            File databasePath = context.getDatabasePath(str);
            if (databasePath != null) {
                return databasePath.length();
            }
            return 0;
        } catch (SecurityException e) {
            Log.w("DbUtils", str.length() == 0 ? new String("Failed to get db size for ") : "Failed to get db size for ".concat(str));
            return 0;
        }
    }

    /* renamed from: b */
    public static Long m36068b(Cursor cursor, int i) {
        return m36062a(cursor, i, (Long) null);
    }

    /* renamed from: c */
    public static String m36069c(Cursor cursor, int i) {
        return m36063a(cursor, i, (String) null);
    }

    /* renamed from: a */
    public static Integer m36060a(Cursor cursor, int i) {
        return m36061a(cursor, i, (Integer) null);
    }

    /* renamed from: a */
    public static Integer m36061a(Cursor cursor, int i, Integer num) {
        return !cursor.isNull(i) ? Integer.valueOf(cursor.getInt(i)) : num;
    }

    /* renamed from: a */
    public static Long m36062a(Cursor cursor, int i, Long l) {
        return !cursor.isNull(i) ? Long.valueOf(cursor.getLong(i)) : l;
    }

    /* renamed from: a */
    public static String m36063a(Cursor cursor, int i, String str) {
        return !cursor.isNull(i) ? cursor.getString(i) : str;
    }

    /* renamed from: a */
    public static void m36064a(ContentValues contentValues, String str, Integer num) {
        if (num == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, num);
        }
    }

    /* renamed from: a */
    public static void m36065a(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m36066a(SQLiteDatabase sQLiteDatabase) {
        m36067a(sQLiteDatabase, "table", "sqlite_sequence", "android_metadata");
        m36067a(sQLiteDatabase, "trigger", new String[0]);
        m36067a(sQLiteDatabase, "view", new String[0]);
    }

    /* renamed from: a */
    private static void m36067a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        boolean z;
        if ("table".equals(str) || "view".equals(str) || "trigger".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == ?", new String[]{str}, null, null, null);
        try {
            Set b = sqw.m36047b(strArr);
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!b.contains(string)) {
                    StringBuilder sb = new StringBuilder(str.length() + 8 + String.valueOf(string).length());
                    sb.append("DROP ");
                    sb.append(str);
                    sb.append(" '");
                    sb.append(string);
                    sb.append("'");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
            if (query != null) {
                query.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
