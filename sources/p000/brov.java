package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brov implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143101a;

    /* renamed from: b */
    final /* synthetic */ brph f143102b;

    public brov(brph brph, brpj brpj) {
        this.f143102b = brph;
        this.f143101a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        this.f143102b.f143125b.mo69781a(new brqk(getTokenResponse.f152527b), new brou(this, this, getTokenResponse));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143101a.mo69680a(brrv.m114516a(str));
    }
}
