package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ftt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ftt {
    /* renamed from: a */
    public static String m12365a(SQLiteDatabase sQLiteDatabase, ftz ftz) {
        Cursor query;
        if (sQLiteDatabase == null || (query = sQLiteDatabase.query("incarnation_appdatasearch", new String[]{"incarnation"}, "corpus_name = ?", new String[]{ftz.f17242a}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToNext()) {
                return query.getString(query.getColumnIndex("incarnation"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    static void m12366a(SQLiteDatabase sQLiteDatabase) {
        if (!fua.m12404c(sQLiteDatabase, "version_appdatasearch")) {
            sQLiteDatabase.execSQL(String.format("CREATE TABLE [%s] ([%s] INTEGER)", "version_appdatasearch", "version"));
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("version", (Integer) 6);
            sQLiteDatabase.insert("version_appdatasearch", null, contentValues);
        }
        if (!fua.m12404c(sQLiteDatabase, "incarnation_appdatasearch")) {
            sQLiteDatabase.execSQL(String.format("CREATE TABLE [%s] ([%s] STRING PRIMARY KEY, [%s] STRING, [%s] INTEGER)", "incarnation_appdatasearch", "corpus_name", "incarnation", "seqno_table_complete"));
        }
    }

    /* renamed from: a */
    public static void m12367a(SQLiteDatabase sQLiteDatabase, ftz ftz, boolean z) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("seqno_table_complete", Integer.valueOf(z ? 1 : 0));
        sQLiteDatabase.update("incarnation_appdatasearch", contentValues, "corpus_name = ?", new String[]{ftz.f17242a});
    }
}
