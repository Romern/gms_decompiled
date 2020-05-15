package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: apll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apll {
    /* renamed from: a */
    static void m70617a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (m70618a(sQLiteDatabase, str, str2)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, (String) null);
            sQLiteDatabase.update(str, contentValues, null, null);
            return;
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s;", str, str2, str3));
    }

    /* renamed from: a */
    private static boolean m70618a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            boolean z = true;
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM %s", str2, str), null);
            if (rawQuery == null) {
                z = false;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return z;
        } catch (SQLException e) {
            return false;
        }
    }
}
