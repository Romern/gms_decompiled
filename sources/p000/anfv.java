package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: anfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfv {

    /* renamed from: a */
    public static final byte[] f76779a = new byte[0];

    /* renamed from: a */
    public static Set m64174a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("RequestTags", new String[]{"user"}, null, null, null, null, null);
        try {
            HashSet hashSet = new HashSet(query.getCount());
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
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
}
