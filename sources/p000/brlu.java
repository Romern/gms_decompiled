package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlu implements aubq {

    /* renamed from: a */
    final /* synthetic */ brpv f142944a;

    public brlu(brpv brpv) {
        this.f142944a = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f142944a.mo69749a((GetTokenResponse) aucb.mo50386d());
        } else {
            this.f142944a.mo69750a(aucb.mo50387e().getMessage());
        }
    }
}
