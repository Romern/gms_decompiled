package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brol implements brpv {

    /* renamed from: a */
    final /* synthetic */ String f143080a;

    /* renamed from: b */
    final /* synthetic */ brpj f143081b;

    /* renamed from: c */
    final /* synthetic */ brph f143082c;

    public brol(brph brph, String str, brpj brpj) {
        this.f143082c = brph;
        this.f143080a = str;
        this.f143081b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        this.f143082c.f143125b.mo69781a(new brqk(getTokenResponse.f152527b), new brok(this, this, getTokenResponse));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143081b.mo69680a(brrv.m114516a(str));
    }
}
