package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: brlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlt implements aubq {

    /* renamed from: a */
    final /* synthetic */ Context f142940a;

    /* renamed from: b */
    final /* synthetic */ brqg f142941b;

    /* renamed from: c */
    final /* synthetic */ brpv f142942c;

    /* renamed from: d */
    final /* synthetic */ brpw f142943d;

    public brlt(brpw brpw, Context context, brqg brqg, brpv brpv) {
        this.f142943d = brpw;
        this.f142940a = context;
        this.f142941b = brqg;
        this.f142942c = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            brqh brqh = (brqh) aucb.mo50386d();
            if (!TextUtils.isEmpty(brqh.f143181c) && !TextUtils.isEmpty(brqh.f143182d)) {
                brla.f142902a.mo69673a(this.f142940a, brqh.f143182d, brqh.f143181c, brqh.f143183e * 1000);
            }
            brlj.m114140c(this.f142943d.f143142b.f143146a, this.f142941b.f143173a);
            brla.f142902a.mo69677c(this.f142940a, this.f142941b.f143173a);
            this.f142942c.mo69749a(brqh);
            return;
        }
        if (aucb.mo50387e().getMessage() != null && aucb.mo50387e().getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            brla.f142902a.mo69678d(this.f142940a, this.f142941b.f143174b);
        }
        this.f142942c.mo69750a(aucb.mo50387e().getMessage());
    }
}
