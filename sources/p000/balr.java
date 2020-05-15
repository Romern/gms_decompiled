package p000;

import android.accounts.Account;

/* renamed from: balr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class balr implements baqk {

    /* renamed from: a */
    public final bals f101181a;

    /* renamed from: b */
    public final cayo f101182b;

    public balr(bals bals) {
        this.f101181a = bals;
        bals.getClass();
        this.f101182b = new balp(bals);
    }

    /* renamed from: a */
    public final bqgg mo55652a(bygz bygz, Account account, boolean z, boolean z2) {
        if (!this.f101181a.mo32648n().mo32695q()) {
            return bqga.m112775a(bpyi.f139852o);
        }
        bala bala = new bala();
        bals bals = this.f101181a;
        cazf.m127594a(bals);
        bala.f101164b = bals;
        bxvd da = bygz.f166410c.mo74144da();
        byiq byiq = byiq.f166593a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygz bygz2 = (bygz) da.f164949b;
        byiq.getClass();
        bygz2.f166413b = byiq;
        bygz2.f166412a = 3;
        baql baql = new baql(account, (bygz) da.mo74062i());
        cazf.m127594a(baql);
        bala.f101163a = baql;
        cazf.m127595a(bala.f101163a, baql.class);
        cazf.m127595a(bala.f101164b, bals.class);
        return bqdf.m112620a(new balt(bala.f101163a, bala.f101164b).f101203b.mo75201b(), Exception.class, new balq(this), bqfb.INSTANCE);
    }
}
