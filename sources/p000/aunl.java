package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.ref.WeakReference;

/* renamed from: aunl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunl extends SQLiteOpenHelper {

    /* renamed from: a */
    private static WeakReference f92153a = new WeakReference(null);

    public aunl(Context context) {
        super(context, "TestSQLite.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static synchronized aunl m77395a() {
        aunl aunl;
        synchronized (aunl.class) {
            aunl = (aunl) f92153a.get();
            if (aunl == null) {
                aunl = new aunl(rpr.m34216b());
                f92153a = new WeakReference(aunl);
            }
        }
        return aunl;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(aunn.f92159e);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS test_model_SQLite");
        onCreate(sQLiteDatabase);
    }
}
