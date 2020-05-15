package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

/* renamed from: anfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfl {
    /* renamed from: a */
    public static Pair m64159a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("ApplicationStates", new String[]{"user", "version"}, "packageName = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                Pair create = Pair.create(query.getString(0), Integer.valueOf(query.getInt(1)));
                if (query != null) {
                    query.close();
                }
                return create;
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
