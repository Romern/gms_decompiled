package p000;

import com.google.firebase.auth.api.model.CreateAuthUriResponse;

/* renamed from: brll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brll implements aubq {

    /* renamed from: a */
    final /* synthetic */ brpv f142929a;

    public brll(brpv brpv) {
        this.f142929a = brpv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f142929a.mo69749a((CreateAuthUriResponse) aucb.mo50386d());
        } else {
            this.f142929a.mo69750a(aucb.mo50387e().getMessage());
        }
    }
}
