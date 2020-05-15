package p000;

import android.database.sqlite.SQLiteException;

/* renamed from: fky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fky extends flk {

    /* renamed from: a */
    final /* synthetic */ flb f16827a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fky(flb flb, fkm fkm) {
        super(fkm);
        this.f16827a = flb;
    }

    /* renamed from: a */
    public final void mo10965a() {
        flb flb = this.f16827a;
        try {
            fkv fkv = flb.f16836b;
            fje.m11804a();
            fkv.mo10954t();
            if (fkv.f16822c.mo11060a(86400000)) {
                fkv.f16822c.mo11059a();
                fkv.mo10933d("Deleting stale hits (if any)");
                fkv.mo10926a("Deleted stale hits, count", Integer.valueOf(fkv.mo10986w().delete("hits2", "hit_time < ?", new String[]{Long.toString(fkv.mo10936e().mo20505a() - 2592000000L)})));
            }
            flb.mo10994c();
        } catch (SQLiteException e) {
            flb.mo10934d("Failed to delete stale hits", e);
        }
        flk flk = flb.f16839f;
        flb.mo10943h();
        flk.mo11008a(86400000);
    }
}
