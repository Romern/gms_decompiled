package p000;

import com.google.firebase.auth.api.model.ResetPasswordResponse;

/* renamed from: brmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmc implements aubq {

    /* renamed from: a */
    final /* synthetic */ brpv f142954a;

    public brmc(brpv brpv) {
        this.f142954a = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f142954a.mo69749a((ResetPasswordResponse) aucb.mo50386d());
        } else {
            this.f142954a.mo69750a(aucb.mo50387e().getMessage());
        }
    }
}
