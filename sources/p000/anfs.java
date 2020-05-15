package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: anfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfs {
    /* renamed from: a */
    public static Integer m64167a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query = sQLiteDatabase.query("MultiCommitApplicationStates", new String[]{"version"}, "packageName = ? AND user = ?", new String[]{str, str2}, null, null, null);
        try {
            if (query.moveToFirst()) {
                Integer valueOf = Integer.valueOf(query.getInt(0));
                if (query != null) {
                    query.close();
                }
                return valueOf;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
