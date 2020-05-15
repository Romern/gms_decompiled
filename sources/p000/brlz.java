package p000;

import android.content.Context;

/* renamed from: brlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlz implements aubq {

    /* renamed from: a */
    final /* synthetic */ Context f142949a;

    /* renamed from: b */
    final /* synthetic */ brpv f142950b;

    public brlz(Context context, brpv brpv) {
        this.f142949a = context;
        this.f142950b = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            brrk brrk = (brrk) aucb.mo50386d();
            if (this.f142949a != null && cdyc.m135274b() && brrk.mo69818b()) {
                brpw.m114445a(this.f142949a, brrk.f143244k, brrk.f143245l);
            }
            this.f142950b.mo69749a(brrk);
            return;
        }
        this.f142950b.mo69750a(aucb.mo50387e().getMessage());
    }
}
