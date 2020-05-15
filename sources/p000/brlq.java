package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: brlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlq implements aubq {

    /* renamed from: a */
    final /* synthetic */ Context f142934a;

    /* renamed from: b */
    final /* synthetic */ brpv f142935b;

    /* renamed from: c */
    final /* synthetic */ brqe f142936c;

    /* renamed from: d */
    final /* synthetic */ brpw f142937d;

    public brlq(brpw brpw, Context context, brpv brpv, brqe brqe) {
        this.f142937d = brpw;
        this.f142934a = context;
        this.f142935b = brpv;
        this.f142936c = brqe;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            brqf brqf = (brqf) aucb.mo50386d();
            if (!TextUtils.isEmpty(brqf.f143170c) && !TextUtils.isEmpty(brqf.f143171d)) {
                brla.f142902a.mo69673a(this.f142934a, brqf.f143171d, brqf.f143170c, brqf.f143172e * 1000);
            }
            brlj.m114139b(this.f142937d.f143142b.f143146a, brqf.f143171d);
            this.f142935b.mo69749a(brqf);
            return;
        }
        if (aucb.mo50387e().getMessage() != null && aucb.mo50387e().getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            brla.f142902a.mo69678d(this.f142934a, this.f142936c.f143162b);
        }
        this.f142935b.mo69750a(aucb.mo50387e().getMessage());
    }
}
