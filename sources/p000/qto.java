package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: qto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qto {

    /* renamed from: a */
    public static final sek f42105a = qqu.m32671b("SQLiteUtils");

    /* renamed from: a */
    public static void m32871a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        sQLiteDatabase.replace(str, null, contentValues);
    }

    /* renamed from: b */
    public static boolean m32874b(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    /* renamed from: c */
    public static int m32875c(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: d */
    public static String m32876d(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: a */
    public static void m32872a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CREATE INDEX IF NOT EXISTS idx_");
        sb.append(str);
        for (String str2 : strArr) {
            sb.append('_');
            sb.append(str2);
        }
        sb.append(" ON ");
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(strArr[i]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m32873a(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
