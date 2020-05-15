package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ztf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztf implements DatabaseErrorHandler {

    /* renamed from: a */
    private final Context f55869a;

    /* renamed from: b */
    private final String f55870b;

    /* renamed from: c */
    private final ytp f55871c;

    /* renamed from: d */
    private final String f55872d;

    /* renamed from: e */
    private final DatabaseErrorHandler f55873e = new DefaultDatabaseErrorHandler();

    public ztf(Context context, String str, ytp ytp, String str2) {
        this.f55869a = context;
        this.f55870b = str;
        this.f55871c = ytp;
        this.f55872d = str2;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        bnsl bnsl = (bnsl) ztg.f55874a.mo68387b();
        bnsl.mo68404a(bnsk.FULL);
        bnsl.mo68432a("ztf", "onCorruption", 590, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("DB [%s] got corrupted. Recreating", this.f55872d);
        ytq a = this.f55871c.mo30767a(this.f55869a);
        a.mo30762a(this.f55870b);
        a.mo30755a(1017);
        a.mo30765d(3);
        a.mo30754a();
        this.f55873e.onCorruption(sQLiteDatabase);
    }
}
