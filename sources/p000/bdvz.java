package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bdvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvz {
    /* renamed from: a */
    public static void m91502a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE account (name TEXT NOT NULL, type TEXT NOT NULL)");
    }
}
