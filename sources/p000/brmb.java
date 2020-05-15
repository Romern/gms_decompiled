package p000;

import android.content.Context;

/* renamed from: brmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmb implements aubq {

    /* renamed from: a */
    final /* synthetic */ Context f142952a;

    /* renamed from: b */
    final /* synthetic */ brpv f142953b;

    public brmb(Context context, brpv brpv) {
        this.f142952a = context;
        this.f142953b = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            brro brro = (brro) aucb.mo50386d();
            if (cdyc.m135274b() && brro.mo69822b()) {
                brpw.m114445a(this.f142952a, brro.f143258d, brro.f143259e);
            }
            this.f142953b.mo69749a(brro);
            return;
        }
        this.f142953b.mo69750a(aucb.mo50387e().getMessage());
    }
}
