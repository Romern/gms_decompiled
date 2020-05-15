package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: vyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vyk extends srp {
    public vyk(vyl vyl) {
        super(vyl.f50239a, "dg.db", "dg.db", 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE main (a TEXT NOT NULL, b LONG NOT NULL, c LONG NOT NULL, d TEXT NON NULL, e TEXT NON NULL,f BLOB NOT NULL,g BLOB NOT NULL);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main;");
        onCreate(sQLiteDatabase);
    }
}
