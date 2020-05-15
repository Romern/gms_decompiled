package p000;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnw {

    /* renamed from: a */
    public final qav f39891a = new qav("SQLiteCastStore");

    /* renamed from: b */
    public final boolean f39892b;

    /* renamed from: c */
    public final pnv f39893c;

    /* renamed from: d */
    public final SharedPreferences f39894d;

    /* renamed from: e */
    public int f39895e;

    public pnw(pnv pnv, SharedPreferences sharedPreferences) {
        this.f39893c = pnv;
        this.f39894d = sharedPreferences;
        this.f39892b = cdam.f180383a.mo6606a().mo77169a();
    }

    /* renamed from: a */
    public final boolean mo23515a(SQLiteDatabase sQLiteDatabase, pnm pnm) {
        pnq pnq;
        if (pnm.f39844a.mo17494a() == null || (((pnq = pnm.f39847d) != null && !pnq.f39868d) || (pnm.f39844a.mo17496a(64) && !ccxm.f180167a.mo6606a().mo76989f()))) {
            this.f39891a.mo23677d("Skip saving CastDeviceInfo: %s", pnm.f39844a);
            return false;
        } else if (sQLiteDatabase.replace("DeviceInfo", null, pod.m30944a(pnm)) != -1) {
            return true;
        } else {
            this.f39891a.mo23677d("Unable to insert CastDeviceInfo: %s.", pnm.f39844a);
            return false;
        }
    }
}
