package p000;

import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: brly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brly implements aubq {

    /* renamed from: a */
    final /* synthetic */ brpv f142948a;

    public brly(brpv brpv) {
        this.f142948a = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f142948a.mo69749a((VerifyCustomTokenResponse) aucb.mo50386d());
        } else {
            this.f142948a.mo69750a(aucb.mo50387e().getMessage());
        }
    }
}
