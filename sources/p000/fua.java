package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fua {
    /* renamed from: a */
    private static Set m12399a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        becj a = becj.m91776a();
        a.mo58556a("type");
        a.mo58556a(" = '");
        a.mo58556a(str);
        a.mo58556a("'");
        if (strArr.length > 0) {
            a.mo58556a(" AND (");
            a.mo58556a("name LIKE '%' || ?");
            for (int i = 1; i < strArr.length; i++) {
                a.mo58556a(" OR ");
                a.mo58556a("name LIKE '%' || ?");
            }
            a.mo58556a(")");
        }
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, ((bech) a.mo58557b()).f106902a, strArr, null, null, null);
        HashSet hashSet = new HashSet();
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("name");
                while (query.moveToNext()) {
                    hashSet.add(query.getString(columnIndex));
                }
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Set m12402b(SQLiteDatabase sQLiteDatabase, String... strArr) {
        return m12399a(sQLiteDatabase, "trigger", strArr);
    }

    /* renamed from: c */
    public static boolean m12404c(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ? AND name == ?", new String[]{"table", str}, null, null, null);
        if (query == null) {
            return false;
        }
        try {
            return query.moveToNext();
        } finally {
            query.close();
        }
    }

    /* renamed from: b */
    public static void m12403b(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("DROP TRIGGER IF EXISTS [");
        sb.append(str);
        sb.append("]");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: a */
    public static Set m12400a(SQLiteDatabase sQLiteDatabase, String... strArr) {
        return m12399a(sQLiteDatabase, "table", strArr);
    }

    /* renamed from: a */
    public static void m12401a(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("DROP TABLE IF EXISTS [");
        sb.append(str);
        sb.append("]");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
