package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: brme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brme implements aubq {

    /* renamed from: a */
    final /* synthetic */ Context f142956a;

    /* renamed from: b */
    final /* synthetic */ brpv f142957b;

    /* renamed from: c */
    final /* synthetic */ brrp f142958c;

    /* renamed from: d */
    final /* synthetic */ brpw f142959d;

    public brme(brpw brpw, Context context, brpv brpv, brrp brrp) {
        this.f142959d = brpw;
        this.f142956a = context;
        this.f142957b = brpv;
        this.f142958c = brrp;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            brrq brrq = (brrq) aucb.mo50386d();
            if (!TextUtils.isEmpty(brrq.f143274f)) {
                brla.f142902a.mo69673a(this.f142956a, brrq.f143276h, brrq.f143274f, brrq.f143275g * 1000);
            }
            brlj.m114136a(this.f142959d.f143142b.f143146a, brrq.f143276h);
            this.f142957b.mo69749a(brrq);
            return;
        }
        Exception e = aucb.mo50387e();
        if (e.getMessage() != null && e.getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            brla.f142902a.mo69678d(this.f142956a, this.f142958c.f143261b);
        }
        this.f142957b.mo69750a(e.getMessage());
    }
}
