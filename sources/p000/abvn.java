package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvn {
    /* renamed from: a */
    public static Set m48330a(SQLiteDatabase sQLiteDatabase, String str, abxt abxt) {
        Set<Pair> b = m48332b(sQLiteDatabase, str, abxt);
        HashSet hashSet = new HashSet();
        for (Pair pair : b) {
            hashSet.add((abww) pair.first);
        }
        return hashSet;
    }

    /* renamed from: b */
    static Set m48332b(SQLiteDatabase sQLiteDatabase, String str, abxt abxt) {
        Cursor query = sQLiteDatabase.query("type_indexapi", new String[]{"type"}, "app_name = ?", new String[]{str}, null, null, null);
        try {
            HashSet hashSet = new HashSet();
            int columnIndex = query.getColumnIndex("type");
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                hashSet.add(new Pair(abww.m48414b(string, str, abxt), string));
            }
            if (query != null) {
                query.close();
            }
            return hashSet;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    static void m48331a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.delete("type_indexapi", "app_name = ? AND type = ?", new String[]{str, str2});
    }
}
