package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: broj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class broj implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143075a;

    /* renamed from: b */
    final /* synthetic */ brph f143076b;

    public broj(brph brph, brpj brpj) {
        this.f143076b = brph;
        this.f143075a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        brra brra = new brra();
        brra.mo69812c(getTokenResponse.f152527b);
        brra.mo69811b(null);
        brra.mo69813d(null);
        this.f143076b.mo69751a(this.f143075a, getTokenResponse, brra, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143075a.mo69680a(brrv.m114516a(str));
    }
}
