package p000;

import android.database.sqlite.SQLiteException;

/* renamed from: fke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fke implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f16773a;

    /* renamed from: b */
    final /* synthetic */ fkh f16774b;

    public fke(fkh fkh, int i) {
        this.f16774b = fkh;
        this.f16773a = i;
    }

    public final void run() {
        flb flb = this.f16774b.f16778a;
        int i = this.f16773a;
        Integer valueOf = Integer.valueOf(i);
        sdo.m34959a(valueOf);
        fje.m11804a();
        flb.mo10954t();
        flb.mo10943h();
        flb.mo10926a("Delete hits for appUid", valueOf);
        try {
            fkv fkv = flb.f16836b;
            long j = (long) i;
            fje.m11804a();
            fkv.mo10954t();
            sdo.m34963a(j);
            fkv.mo10986w().delete("hits2", "hit_app_id = ?", new String[]{Long.valueOf(j).toString()});
            flb.mo10994c();
        } catch (SQLiteException e) {
            flb.mo10934d("Failed to delete app hits from local database", e);
        }
    }
}
