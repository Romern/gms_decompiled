package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bdxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdxu extends bdwc {
    public bdxu() {
        super(1);
    }

    /* renamed from: a */
    public final void mo58352a(SQLiteDatabase sQLiteDatabase) {
        bdvz.m91502a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE queue (_id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, timestamp INTEGER NOT NULL)");
    }
}
