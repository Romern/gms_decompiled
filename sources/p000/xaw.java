package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: xaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xaw extends srp {
    /* renamed from: c */
    private final void m42579c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS appid_expiry");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS appid_facet");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        xax.f51830b.mo25412b("Creating AppID cache expiry table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE appid_expiry (appid TEXT,expiry NUMERIC,PRIMARY KEY (appid))");
        xax.f51830b.mo25412b("Creating AppID cache facet table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE appid_facet (appid TEXT,trustedfacet TEXT)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m42579c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m42579c(sQLiteDatabase);
    }

    public xaw(Context context) {
        super(context, "fido-appid-cache.db", "fido-appid-cache.db", 1);
    }
}
