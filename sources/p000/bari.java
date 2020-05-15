package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bari */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bari implements bano {

    /* renamed from: a */
    private final cayo f101604a;

    public bari(cayo cayo) {
        this.f101604a = cayo;
    }

    /* renamed from: a */
    public final void mo55809a() {
    }

    /* renamed from: b */
    public final void mo55812b() {
        ((achw) this.f101604a.mo16713a()).logVerbose("Opening MDH wipeout table.", new Object[0]);
    }

    /* renamed from: a */
    public final void mo55810a(SQLiteDatabase sQLiteDatabase) {
        ((achw) this.f101604a.mo16713a()).mo25414c("Creating MDH wipeout table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wipeout (account TEXT,channel_key TEXT,local_writes  INTEGER NOT NULL DEFAULT 0,last_sync_timestamp INTEGER,channel_id BLOB NOT NULL,PRIMARY KEY (account,channel_key))");
    }

    /* renamed from: a */
    public final void mo55811a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((achw) this.f101604a.mo16713a()).logVerbose("Upgrading MDH wipeout table from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
