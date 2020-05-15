package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: baob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baob implements bano {

    /* renamed from: a */
    private final cayo f101385a;

    public baob(cayo cayo) {
        this.f101385a = cayo;
    }

    /* renamed from: a */
    public final void mo55809a() {
    }

    /* renamed from: b */
    public final void mo55812b() {
    }

    /* renamed from: a */
    public final void mo55810a(SQLiteDatabase sQLiteDatabase) {
        ((achw) this.f101385a.mo16713a()).mo25414c("Creating MDH subscription table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE subscription (app_id TEXT,account TEXT,channel TEXT,value BLOB NOT NULL,PRIMARY KEY (app_id,account,channel))");
    }

    /* renamed from: a */
    public final void mo55811a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS subscription");
        mo55810a(sQLiteDatabase);
    }
}
