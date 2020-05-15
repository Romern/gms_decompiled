package p000;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;

/* renamed from: brmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmf implements aubq {

    /* renamed from: a */
    final /* synthetic */ brpv f142960a;

    public brmf(brpv brpv) {
        this.f142960a = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f142960a.mo69749a((GetAccountInfoResponse) aucb.mo50386d());
        } else {
            this.f142960a.mo69750a(aucb.mo50387e().getMessage());
        }
    }
}
